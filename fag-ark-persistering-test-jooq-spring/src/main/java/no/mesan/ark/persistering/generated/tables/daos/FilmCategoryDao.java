/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.tables.FilmCategory;
import no.mesan.ark.persistering.generated.tables.records.FilmCategoryRecord;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategoryDao extends DAOImpl<FilmCategoryRecord, no.mesan.ark.persistering.generated.tables.pojos.FilmCategory, Record2<Integer, Integer>> {

	/**
	 * Create a new FilmCategoryDao without any configuration
	 */
	public FilmCategoryDao() {
		super(FilmCategory.FILM_CATEGORY, no.mesan.ark.persistering.generated.tables.pojos.FilmCategory.class);
	}

	/**
	 * Create a new FilmCategoryDao with an attached configuration
	 */
	public FilmCategoryDao(Configuration configuration) {
		super(FilmCategory.FILM_CATEGORY, no.mesan.ark.persistering.generated.tables.pojos.FilmCategory.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<Integer, Integer> getId(no.mesan.ark.persistering.generated.tables.pojos.FilmCategory object) {
		return compositeKeyRecord(object.getFilmId(), object.getCategoryId());
	}

	/**
	 * Fetch records that have <code>film_id IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.FilmCategory> fetchByFilmId(Integer... values) {
		return fetch(FilmCategory.FILM_CATEGORY.FILM_ID, values);
	}

	/**
	 * Fetch records that have <code>category_id IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.FilmCategory> fetchByCategoryId(Integer... values) {
		return fetch(FilmCategory.FILM_CATEGORY.CATEGORY_ID, values);
	}

	/**
	 * Fetch records that have <code>last_update IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.FilmCategory> fetchByLastUpdate(Timestamp... values) {
		return fetch(FilmCategory.FILM_CATEGORY.LAST_UPDATE, values);
	}
}
