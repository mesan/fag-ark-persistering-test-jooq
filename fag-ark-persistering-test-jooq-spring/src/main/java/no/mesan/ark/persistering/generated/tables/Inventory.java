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
import no.mesan.ark.persistering.generated.tables.records.InventoryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Inventory extends TableImpl<InventoryRecord> {

	private static final long serialVersionUID = -1369057028;

	/**
	 * The reference instance of <code>public.inventory</code>
	 */
	public static final Inventory INVENTORY = new Inventory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InventoryRecord> getRecordType() {
		return InventoryRecord.class;
	}

	/**
	 * The column <code>public.inventory.inventory_id</code>.
	 */
	public final TableField<InventoryRecord, Integer> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.inventory.film_id</code>.
	 */
	public final TableField<InventoryRecord, Integer> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.inventory.store_id</code>.
	 */
	public final TableField<InventoryRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.inventory.last_update</code>.
	 */
	public final TableField<InventoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.inventory</code> table reference
	 */
	public Inventory() {
		this("inventory", null);
	}

	/**
	 * Create an aliased <code>public.inventory</code> table reference
	 */
	public Inventory(String alias) {
		this(alias, INVENTORY);
	}

	private Inventory(String alias, Table<InventoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private Inventory(String alias, Table<InventoryRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<InventoryRecord, Integer> getIdentity() {
		return Keys.IDENTITY_INVENTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<InventoryRecord> getPrimaryKey() {
		return Keys.INVENTORY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<InventoryRecord>> getKeys() {
		return Arrays.<UniqueKey<InventoryRecord>>asList(Keys.INVENTORY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<InventoryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<InventoryRecord, ?>>asList(Keys.INVENTORY__INVENTORY_FILM_ID_FKEY, Keys.INVENTORY__INVENTORY_STORE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Inventory as(String alias) {
		return new Inventory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Inventory rename(String name) {
		return new Inventory(name, null);
	}
}