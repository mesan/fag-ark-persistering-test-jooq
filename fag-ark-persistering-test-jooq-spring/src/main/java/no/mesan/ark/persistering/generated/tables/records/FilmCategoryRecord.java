/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import no.mesan.ark.persistering.generated.tables.FilmCategory;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "film_category", schema = "public", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"film_id", "category_id"})
})
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> implements Record3<Integer, Integer, Timestamp> {

	private static final long serialVersionUID = -155022902;

	/**
	 * Setter for <code>public.film_category.film_id</code>.
	 */
	public void setFilmId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.film_category.film_id</code>.
	 */
	@Column(name = "film_id", nullable = false, precision = 32)
	public Integer getFilmId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.film_category.category_id</code>.
	 */
	public void setCategoryId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.film_category.category_id</code>.
	 */
	@Column(name = "category_id", nullable = false, precision = 32)
	public Integer getCategoryId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.film_category.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.film_category.last_update</code>.
	 */
	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Timestamp> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Timestamp> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return FilmCategory.FILM_CATEGORY.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return FilmCategory.FILM_CATEGORY.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return FilmCategory.FILM_CATEGORY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getFilmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategoryRecord value1(Integer value) {
		setFilmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategoryRecord value2(Integer value) {
		setCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategoryRecord value3(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategoryRecord values(Integer value1, Integer value2, Timestamp value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmCategoryRecord
	 */
	public FilmCategoryRecord() {
		super(FilmCategory.FILM_CATEGORY);
	}

	/**
	 * Create a detached, initialised FilmCategoryRecord
	 */
	public FilmCategoryRecord(Integer filmId, Integer categoryId, Timestamp lastUpdate) {
		super(FilmCategory.FILM_CATEGORY);

		setValue(0, filmId);
		setValue(1, categoryId);
		setValue(2, lastUpdate);
	}
}