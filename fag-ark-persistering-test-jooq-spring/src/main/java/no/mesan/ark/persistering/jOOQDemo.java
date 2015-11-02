package no.mesan.ark.persistering;

import static no.mesan.ark.persistering.generated.Tables.*;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import no.mesan.ark.persistering.generated.Keys;
import no.mesan.ark.persistering.generated.tables.records.ActorRecord;
import no.mesan.ark.persistering.generated.tables.records.CategoryRecord;
import no.mesan.ark.persistering.generated.tables.records.FilmRecord;

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
}
