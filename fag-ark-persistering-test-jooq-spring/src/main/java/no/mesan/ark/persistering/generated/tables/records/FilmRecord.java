/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import no.mesan.ark.persistering.generated.enums.MpaaRating;
import no.mesan.ark.persistering.generated.tables.Film;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
@Table(name = "film", schema = "public")
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record14<Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, MpaaRating, Timestamp, String[], Object> {

	private static final long serialVersionUID = -649464243;

	/**
	 * Setter for <code>public.film.film_id</code>.
	 */
	public void setFilmId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.film.film_id</code>.
	 */
	@Id
	@Column(name = "film_id", unique = true, nullable = false, precision = 32)
	public Integer getFilmId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.film.title</code>.
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.film.title</code>.
	 */
	@Column(name = "title", nullable = false, length = 255)
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.film.description</code>.
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.film.description</code>.
	 */
	@Column(name = "description")
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.film.release_year</code>.
	 */
	public void setReleaseYear(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.film.release_year</code>.
	 */
	@Column(name = "release_year", precision = 32)
	public Integer getReleaseYear() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.film.language_id</code>.
	 */
	public void setLanguageId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.film.language_id</code>.
	 */
	@Column(name = "language_id", nullable = false, precision = 32)
	public Integer getLanguageId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.film.original_language_id</code>.
	 */
	public void setOriginalLanguageId(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.film.original_language_id</code>.
	 */
	@Column(name = "original_language_id", precision = 32)
	public Integer getOriginalLanguageId() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.film.rental_duration</code>.
	 */
	public void setRentalDuration(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.film.rental_duration</code>.
	 */
	@Column(name = "rental_duration", nullable = false, precision = 32)
	public Integer getRentalDuration() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.film.rental_rate</code>.
	 */
	public void setRentalRate(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.film.rental_rate</code>.
	 */
	@Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
	public BigDecimal getRentalRate() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>public.film.length</code>.
	 */
	public void setLength(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.film.length</code>.
	 */
	@Column(name = "length", precision = 32)
	public Integer getLength() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.film.replacement_cost</code>.
	 */
	public void setReplacementCost(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.film.replacement_cost</code>.
	 */
	@Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
	public BigDecimal getReplacementCost() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>public.film.rating</code>.
	 */
	public void setRating(MpaaRating value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.film.rating</code>.
	 */
	@Column(name = "rating")
	public MpaaRating getRating() {
		return (MpaaRating) getValue(10);
	}

	/**
	 * Setter for <code>public.film.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.film.last_update</code>.
	 */
	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>public.film.special_features</code>.
	 */
	public void setSpecialFeatures(String[] value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>public.film.special_features</code>.
	 */
	@Column(name = "special_features")
	public String[] getSpecialFeatures() {
		return (String[]) getValue(12);
	}

	/**
	 * Setter for <code>public.film.fulltext</code>.
	 */
	public void setFulltext(Object value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>public.film.fulltext</code>.
	 */
	@Column(name = "fulltext", nullable = false)
	public Object getFulltext() {
		return (Object) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, MpaaRating, Timestamp, String[], Object> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, String, String, Integer, Integer, Integer, Integer, BigDecimal, Integer, BigDecimal, MpaaRating, Timestamp, String[], Object> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Film.FILM.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Film.FILM.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Film.FILM.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Film.FILM.RELEASE_YEAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Film.FILM.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Film.FILM.ORIGINAL_LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return Film.FILM.RENTAL_DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return Film.FILM.RENTAL_RATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Film.FILM.LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return Film.FILM.REPLACEMENT_COST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<MpaaRating> field11() {
		return Film.FILM.RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return Film.FILM.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String[]> field13() {
		return Film.FILM.SPECIAL_FEATURES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field14() {
		return Film.FILM.FULLTEXT;
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
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getReleaseYear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getOriginalLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getRentalDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getRentalRate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getReplacementCost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MpaaRating value11() {
		return getRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value12() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] value13() {
		return getSpecialFeatures();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value14() {
		return getFulltext();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value1(Integer value) {
		setFilmId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value4(Integer value) {
		setReleaseYear(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value5(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value6(Integer value) {
		setOriginalLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value7(Integer value) {
		setRentalDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value8(BigDecimal value) {
		setRentalRate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value9(Integer value) {
		setLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value10(BigDecimal value) {
		setReplacementCost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value11(MpaaRating value) {
		setRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value12(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value13(String[] value) {
		setSpecialFeatures(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord value14(Object value) {
		setFulltext(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, BigDecimal value8, Integer value9, BigDecimal value10, MpaaRating value11, Timestamp value12, String[] value13, Object value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmRecord
	 */
	public FilmRecord() {
		super(Film.FILM);
	}

	/**
	 * Create a detached, initialised FilmRecord
	 */
	public FilmRecord(Integer filmId, String title, String description, Integer releaseYear, Integer languageId, Integer originalLanguageId, Integer rentalDuration, BigDecimal rentalRate, Integer length, BigDecimal replacementCost, MpaaRating rating, Timestamp lastUpdate, String[] specialFeatures, Object fulltext) {
		super(Film.FILM);

		setValue(0, filmId);
		setValue(1, title);
		setValue(2, description);
		setValue(3, releaseYear);
		setValue(4, languageId);
		setValue(5, originalLanguageId);
		setValue(6, rentalDuration);
		setValue(7, rentalRate);
		setValue(8, length);
		setValue(9, replacementCost);
		setValue(10, rating);
		setValue(11, lastUpdate);
		setValue(12, specialFeatures);
		setValue(13, fulltext);
	}
}
