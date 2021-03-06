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
import no.mesan.ark.persistering.generated.tables.records.CategoryRecord;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Category extends TableImpl<CategoryRecord> {

	private static final long serialVersionUID = -1146030610;

	/**
	 * The reference instance of <code>public.category</code>
	 */
	public static final Category CATEGORY = new Category();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CategoryRecord> getRecordType() {
		return CategoryRecord.class;
	}

	/**
	 * The column <code>public.category.category_id</code>.
	 */
	public final TableField<CategoryRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.category.name</code>.
	 */
	public final TableField<CategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

	/**
	 * The column <code>public.category.last_update</code>.
	 */
	public final TableField<CategoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.category</code> table reference
	 */
	public Category() {
		this("category", null);
	}

	/**
	 * Create an aliased <code>public.category</code> table reference
	 */
	public Category(String alias) {
		this(alias, CATEGORY);
	}

	private Category(String alias, Table<CategoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private Category(String alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CategoryRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CategoryRecord> getPrimaryKey() {
		return Keys.CATEGORY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CategoryRecord>> getKeys() {
		return Arrays.<UniqueKey<CategoryRecord>>asList(Keys.CATEGORY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Category as(String alias) {
		return new Category(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Category rename(String name) {
		return new Category(name, null);
	}
}
