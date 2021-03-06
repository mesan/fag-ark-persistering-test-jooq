/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import no.mesan.ark.persistering.generated.tables.StaffList;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
@Table(name = "staff_list", schema = "public")
public class StaffListRecord extends TableRecordImpl<StaffListRecord> implements Record8<Integer, String, String, String, String, String, String, Integer> {

	private static final long serialVersionUID = 1565081645;

	/**
	 * Setter for <code>public.staff_list.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.staff_list.id</code>.
	 */
	@Column(name = "id", precision = 32)
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.staff_list.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.staff_list.name</code>.
	 */
	@Column(name = "name")
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.staff_list.address</code>.
	 */
	public void setAddress(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.staff_list.address</code>.
	 */
	@Column(name = "address", length = 50)
	public String getAddress() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.staff_list.zip code</code>.
	 */
	public void setZipCode(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.staff_list.zip code</code>.
	 */
	@Column(name = "zip code", length = 10)
	public String getZipCode() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.staff_list.phone</code>.
	 */
	public void setPhone(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.staff_list.phone</code>.
	 */
	@Column(name = "phone", length = 20)
	public String getPhone() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.staff_list.city</code>.
	 */
	public void setCity(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.staff_list.city</code>.
	 */
	@Column(name = "city", length = 50)
	public String getCity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>public.staff_list.country</code>.
	 */
	public void setCountry(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.staff_list.country</code>.
	 */
	@Column(name = "country", length = 50)
	public String getCountry() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.staff_list.sid</code>.
	 */
	public void setSid(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.staff_list.sid</code>.
	 */
	@Column(name = "sid", precision = 32)
	public Integer getSid() {
		return (Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, String, String, String, String, String, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, String, String, String, String, String, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return StaffList.STAFF_LIST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StaffList.STAFF_LIST.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return StaffList.STAFF_LIST.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return StaffList.STAFF_LIST.ZIP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return StaffList.STAFF_LIST.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return StaffList.STAFF_LIST.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return StaffList.STAFF_LIST.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return StaffList.STAFF_LIST.SID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getZipCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getSid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value3(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value4(String value) {
		setZipCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value5(String value) {
		setPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value6(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value7(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value8(Integer value) {
		setSid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StaffListRecord
	 */
	public StaffListRecord() {
		super(StaffList.STAFF_LIST);
	}

	/**
	 * Create a detached, initialised StaffListRecord
	 */
	public StaffListRecord(Integer id, String name, String address, String zipCode, String phone, String city, String country, Integer sid) {
		super(StaffList.STAFF_LIST);

		setValue(0, id);
		setValue(1, name);
		setValue(2, address);
		setValue(3, zipCode);
		setValue(4, phone);
		setValue(5, city);
		setValue(6, country);
		setValue(7, sid);
	}
}
