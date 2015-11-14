package no.mesan.ark.persistering;

import static no.mesan.ark.persistering.generated.Tables.*;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.jooq.Binding;
import org.jooq.Configuration;
import org.jooq.Converter;
import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.SQLDialect;
import org.jooq.SelectConditionStep;
import org.jooq.SelectField;
import org.jooq.SelectJoinStep;
import org.jooq.SelectOffsetStep;
import org.jooq.SelectSeekStep1;
import org.jooq.SelectSeekStepN;
import org.jooq.SelectSelectStep;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import no.mesan.ark.persistering.generated.Keys;
import no.mesan.ark.persistering.generated.tables.records.ActorRecord;
import no.mesan.ark.persistering.generated.tables.records.CategoryRecord;
import no.mesan.ark.persistering.generated.tables.records.FilmRecord;
import no.mesan.ark.persistering.generated.tables.records.InventoryRecord;

@Component
public class jOOQDemo {

	private final DSLContext create;

	@Autowired
	public jOOQDemo(DataSource dataSource) {
		create = DSL.using(dataSource, SQLDialect.POSTGRES);
	}

	@Transactional
	public void runActors() {
		System.out.println("jOOQ Demo Actors");

		create.select().from(ACTOR).fetchInto(ActorRecord.class).stream()
				.map(actor -> "ID: " + actor.getActorId() + ", First name: " + actor.getFirstName() + ", Last name: "
						+ actor.getLastName() + ", # films: "
						+ actor.fetchChildren(Keys.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY)
								.fetchParents(Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY).size())
				.collect(Collectors.toList()).stream().limit(10).forEach(System.out::println);
	}

	@Transactional
	public void runFilms() {
		System.out.println("jOOQ Demo Films");

		create.select().from(FILM).fetchInto(FilmRecord.class).stream().map(this::filmInfo).collect(Collectors.toList())
				.stream().limit(10).forEach(System.out::println);
	}

	private String filmInfo(FilmRecord filmRecord) {
		BinaryOperator<String> accumulator = (strA, strB) -> strA + ", " + strB;

		return "ID: "
				+ filmRecord
						.getFilmId()
				+ "; Title: " + filmRecord.getTitle() + "; Actors: "
				+ filmRecord.fetchChildren(Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY).stream()
						.map(filmActor -> filmActor.fetchParent(Keys.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY))
						.map(actorRecord -> actorRecord.getFirstName() + " " + actorRecord.getLastName())
						.reduce(accumulator).orElse("ingen")
				+ "; Categories: "
				+ filmRecord.fetchChildren(Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY).stream()
						.map(filmCategory -> filmCategory
								.fetchParent(Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY))
						.map(CategoryRecord::getName).reduce(accumulator).orElse("ingen");
	}

	@Transactional
	public void runComedy() {
		System.out.println("jOOQ Demo Most Rented Comedy");

		SelectSeekStep1<Record2<Integer, Integer>, Integer> nested = create.select(INVENTORY.FILM_ID, RENTAL.RENTAL_ID.count())
				.from(RENTAL.join(INVENTORY).on(RENTAL.INVENTORY_ID.equal(INVENTORY.INVENTORY_ID)))
				.where(INVENTORY.FILM_ID
						.in(create.select(FILM_CATEGORY.FILM_ID)
								.from(FILM_CATEGORY.join(CATEGORY)
										.on(FILM_CATEGORY.CATEGORY_ID.equal(CATEGORY.CATEGORY_ID)))
								.where(CATEGORY.NAME.equal("Comedy"))))
				.groupBy(INVENTORY.FILM_ID).orderBy(RENTAL.RENTAL_ID.count().desc());

		SelectConditionStep<Record> query = create.select().from(FILM)
				.where(FILM.FILM_ID.in(create.select(nested.field(INVENTORY.FILM_ID)).from(nested).limit(1)));

		List<FilmRecord> result = query.fetchInto(FilmRecord.class);
		result.stream().map(record -> record.getTitle()).forEach(System.out::println);
	}
}
