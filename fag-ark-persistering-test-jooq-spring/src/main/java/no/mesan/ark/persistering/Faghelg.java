package no.mesan.ark.persistering;

import static no.mesan.ark.persistering.generated.Tables.ACTOR;
import static no.mesan.ark.persistering.generated.Tables.CATEGORY;
import static no.mesan.ark.persistering.generated.Tables.FILM;
import static no.mesan.ark.persistering.generated.Tables.FILM_CATEGORY;
import static no.mesan.ark.persistering.generated.Tables.LANGUAGE;
import static org.jooq.impl.DSL.select;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import no.mesan.ark.persistering.generated.enums.MpaaRating;
import no.mesan.ark.persistering.generated.tables.Category;
import no.mesan.ark.persistering.generated.tables.Film;
import no.mesan.ark.persistering.generated.tables.FilmCategory;
import no.mesan.ark.persistering.generated.tables.Language;
import no.mesan.ark.persistering.generated.tables.records.ActorRecord;
import no.mesan.ark.persistering.generated.tables.records.FilmRecord;

@Component
public class Faghelg {

	private final DSLContext dsl;
	private final NamedParameterJdbcOperations jdbcTemplate;

	@Autowired
	public Faghelg(DataSource dataSource) {
		dsl = DSL.using(dataSource, SQLDialect.POSTGRES);
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Transactional
	public void run() {
		//@formatter:off
		Result<FilmRecord> films = dsl
				.selectFrom(FILM)
				.where(FILM.FILM_ID.in(
						select(FILM_CATEGORY.FILM_ID)
						.from(FILM_CATEGORY.join(CATEGORY)
								.on(FILM_CATEGORY.CATEGORY_ID.equal(CATEGORY.CATEGORY_ID)))
						.where(CATEGORY.NAME.equal("Action"))))
				.and(FILM.LANGUAGE_ID.equal(
						select(LANGUAGE.LANGUAGE_ID)
						.from(LANGUAGE)
						.where(LANGUAGE.NAME.equal("English"))))
				.and(FILM.RATING.greaterOrEqual(MpaaRating.PG_13))
				.fetch();
		//@formatter:on

		System.out.println("Antall filmer jOOQ: " + films.size());
		System.out.println(films.format());
	}

	@Transactional
	public void doNotRunMe() {
		//@formatter:off
		FilmRecord film = dsl
			.selectFrom(FILM)
			.where(FILM.FILM_ID.equal(12345))
			.fetchOne();
		//@formatter:on

		film.setRating(MpaaRating.G);
		film.update();
		
		Timestamp timestamp = null;
		Consumer<? super ActorRecord> action = null;

		//@formatter:off
		dsl.insertInto(ACTOR,
				ACTOR.ACTOR_ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME, ACTOR.LAST_UPDATE)
			.values(123, "Ole", "Brumm", timestamp)
			.execute();
		//@formatter:on

		//@formatter:off
		dsl.insertInto(ACTOR).values(123, "Ole", "Brumm", timestamp).execute();
		//@formatter:on
		
		Result<ActorRecord> result = dsl.insertInto(ACTOR,
				ACTOR.ACTOR_ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME, ACTOR.LAST_UPDATE)
			.values(123, "Ole", "Brumm", timestamp)
			.values(456, "Nasse", "Nøff", timestamp)
			.returning()
			.fetch();
		
		result.stream().forEach(action);
		
//		dsl.deleteFrom(FILM).where(FILM.FILM_ID.between(123, 456));
//		dsl.truncate(FILM).execute();

		//@formatter:off
		Film film2 = dsl
			.selectFrom(FILM)
			.where(FILM.FILM_ID.equal(12345))
			.fetchOneInto(Film.class);
		//@formatter:on

		//@formatter:off
		Map<MpaaRating, List<Film>> filmsByRating = dsl
			.selectFrom(FILM)
			.fetch()
			.intoGroups(FILM.RATING, Film.class);
		//@formatter:on
		
		dsl.batch(
				dsl.insertInto(ACTOR, ACTOR.ACTOR_ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME, ACTOR.LAST_UPDATE)
					.values(123, "Ole", "Brumm", timestamp),
				dsl.insertInto(ACTOR, ACTOR.ACTOR_ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME, ACTOR.LAST_UPDATE)
					.values(124, "Nasse", "Nøff", timestamp),
				dsl.insertInto(ACTOR, ACTOR.ACTOR_ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME, ACTOR.LAST_UPDATE)
					.values(125, "Kristoffer", "Robin", timestamp))
		.execute();
		
	}

	@Transactional
	public void runAlias() {
		Film f = FILM.as("f");
		FilmCategory fc = FILM_CATEGORY.as("fc");
		Category c = CATEGORY.as("c");
		Language l = LANGUAGE.as("l");

		//@formatter:off
		Result<FilmRecord> films = dsl
				.selectFrom(f)
				.where(f.FILM_ID.in(
						select(fc.FILM_ID)
						.from(fc.join(c)
								.on(fc.CATEGORY_ID.equal(c.CATEGORY_ID)))
						.where(c.NAME.equal("Action"))))
				.and(f.LANGUAGE_ID.equal(
						select(l.LANGUAGE_ID)
						.from(l)
						.where(l.NAME.equal("English"))))
				.and(f.RATING.greaterOrEqual(MpaaRating.PG_13))
				.fetch();
		//@formatter:on

		System.out.println("Antall filmer jOOQ: " + films.size());
		System.out.println(films.format());
	}

	@Transactional
	public void runJDBC() {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("category_name", "Action");
		parameters.addValue("language_name", "English");
		parameters.addValue("film_rating", "PG-13");

		//@formatter:off
		List<Map<String, Object>> results = jdbcTemplate.queryForList(
				"SELECT * "
		      + "FROM film f "
		      + "WHERE f.film_id in ("
		      + "    SELECT film_id"
		      + "    FROM film_category fc join category c "
		      + "        ON fc.category_id = c.category_id "
		      + "    WHERE c.name = :category_name "
		      + "    ) "
		      + "AND f.language_id = ("
		      + "    SELECT language_id"
		      + "    FROM language"
		      + "    WHERE name = :language_name"
		      + "    )"
		      + "AND f.rating >= :film_rating::mpaa_rating",
		      parameters);
		//@formatter:on

		System.out.println("Antall filmer JDBC: " + results.size());
		results.stream().forEach(System.out::println);
	}
}
