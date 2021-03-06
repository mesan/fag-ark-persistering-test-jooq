/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import no.mesan.ark.persistering.generated.tables.SalesByStore;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
@Table(name = "sales_by_store", schema = "public")
public class SalesByStoreRecord extends TableRecordImpl<SalesByStoreRecord> implements Record3<String, String, BigDecimal> {

	private static final long serialVersionUID = -166771102;

	/**
	 * Setter for <code>public.sales_by_store.store</code>.
	 */
	public void setStore(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.sales_by_store.store</code>.
	 */
	@Column(name = "store")
	public String getStore() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.sales_by_store.manager</code>.
	 */
	public void setManager(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.sales_by_store.manager</code>.
	 */
	@Column(name = "manager")
	public String getManager() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.sales_by_store.total_sales</code>.
	 */
	public void setTotalSales(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.sales_by_store.total_sales</code>.
	 */
	@Column(name = "total_sales")
	public BigDecimal getTotalSales() {
		return (BigDecimal) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, String, BigDecimal> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, String, BigDecimal> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SalesByStore.SALES_BY_STORE.STORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SalesByStore.SALES_BY_STORE.MANAGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return SalesByStore.SALES_BY_STORE.TOTAL_SALES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getStore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getManager();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getTotalSales();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByStoreRecord value1(String value) {
		setStore(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByStoreRecord value2(String value) {
		setManager(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByStoreRecord value3(BigDecimal value) {
		setTotalSales(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByStoreRecord values(String value1, String value2, BigDecimal value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SalesByStoreRecord
	 */
	public SalesByStoreRecord() {
		super(SalesByStore.SALES_BY_STORE);
	}

	/**
	 * Create a detached, initialised SalesByStoreRecord
	 */
	public SalesByStoreRecord(String store, String manager, BigDecimal totalSales) {
		super(SalesByStore.SALES_BY_STORE);

		setValue(0, store);
		setValue(1, manager);
		setValue(2, totalSales);
	}
}
