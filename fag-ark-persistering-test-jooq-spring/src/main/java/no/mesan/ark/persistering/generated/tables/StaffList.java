/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables;


import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.Public;
import no.mesan.ark.persistering.generated.tables.records.StaffListRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class StaffList extends TableImpl<StaffListRecord> {

	private static final long serialVersionUID = 470982589;

	/**
	 * The reference instance of <code>public.staff_list</code>
	 */
	public static final StaffList STAFF_LIST = new StaffList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StaffListRecord> getRecordType() {
		return StaffListRecord.class;
	}

	/**
	 * The column <code>public.staff_list.id</code>.
	 */
	public final TableField<StaffListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.staff_list.name</code>.
	 */
	public final TableField<StaffListRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.staff_list.address</code>.
	 */
	public final TableField<StaffListRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.staff_list.zip code</code>.
	 */
	public final TableField<StaffListRecord, String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>public.staff_list.phone</code>.
	 */
	public final TableField<StaffListRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.staff_list.city</code>.
	 */
	public final TableField<StaffListRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.staff_list.country</code>.
	 */
	public final TableField<StaffListRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.staff_list.sid</code>.
	 */
	public final TableField<StaffListRecord, Integer> SID = createField("sid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.staff_list</code> table reference
	 */
	public StaffList() {
		this("staff_list", null);
	}

	/**
	 * Create an aliased <code>public.staff_list</code> table reference
	 */
	public StaffList(String alias) {
		this(alias, STAFF_LIST);
	}

	private StaffList(String alias, Table<StaffListRecord> aliased) {
		this(alias, aliased, null);
	}

	private StaffList(String alias, Table<StaffListRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffList as(String alias) {
		return new StaffList(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StaffList rename(String name) {
		return new StaffList(name, null);
	}
}