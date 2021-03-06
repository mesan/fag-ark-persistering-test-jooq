/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.Keys;
import no.mesan.ark.persistering.generated.Public;
import no.mesan.ark.persistering.generated.tables.records.FilmCategoryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class FilmCategory extends TableImpl<FilmCategoryRecord> {

	private static final long serialVersionUID = 644005161;

	/**
	 * The reference instance of <code>public.film_category</code>
	 */
	public static final FilmCategory FILM_CATEGORY = new FilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FilmCategoryRecord> getRecordType() {
		return FilmCategoryRecord.class;
	}

	/**
	 * The column <code>public.film_category.film_id</code>.
	 */
	public final TableField<FilmCategoryRecord, Integer> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.film_category.category_id</code>.
	 */
	public final TableField<FilmCategoryRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.film_category.last_update</code>.
	 */
	public final TableField<FilmCategoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.film_category</code> table reference
	 */
	public FilmCategory() {
		this("film_category", null);
	}

	/**
	 * Create an aliased <code>public.film_category</code> table reference
	 */
	public FilmCategory(String alias) {
		this(alias, FILM_CATEGORY);
	}

	private FilmCategory(String alias, Table<FilmCategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private FilmCategory(String alias, Table<FilmCategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FilmCategoryRecord> getPrimaryKey() {
		return Keys.FILM_CATEGORY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FilmCategoryRecord>> getKeys() {
		return Arrays.<UniqueKey<FilmCategoryRecord>>asList(Keys.FILM_CATEGORY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FilmCategoryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FilmCategoryRecord, ?>>asList(Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FilmCategory as(String alias) {
		return new FilmCategory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public FilmCategory rename(String name) {
		return new FilmCategory(name, null);
	}
}
