/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.Keys;
import no.mesan.ark.persistering.generated.Public;
import no.mesan.ark.persistering.generated.tables.records.PaymentP2007_02Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class PaymentP2007_02 extends TableImpl<PaymentP2007_02Record> {

	private static final long serialVersionUID = 1641114435;

	/**
	 * The reference instance of <code>public.payment_p2007_02</code>
	 */
	public static final PaymentP2007_02 PAYMENT_P2007_02 = new PaymentP2007_02();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PaymentP2007_02Record> getRecordType() {
		return PaymentP2007_02Record.class;
	}

	/**
	 * The column <code>public.payment_p2007_02.payment_id</code>.
	 */
	public final TableField<PaymentP2007_02Record, Integer> PAYMENT_ID = createField("payment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.payment_p2007_02.customer_id</code>.
	 */
	public final TableField<PaymentP2007_02Record, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.payment_p2007_02.staff_id</code>.
	 */
	public final TableField<PaymentP2007_02Record, Integer> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.payment_p2007_02.rental_id</code>.
	 */
	public final TableField<PaymentP2007_02Record, Integer> RENTAL_ID = createField("rental_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.payment_p2007_02.amount</code>.
	 */
	public final TableField<PaymentP2007_02Record, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC.precision(5, 2).nullable(false), this, "");

	/**
	 * The column <code>public.payment_p2007_02.payment_date</code>.
	 */
	public final TableField<PaymentP2007_02Record, Timestamp> PAYMENT_DATE = createField("payment_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * Create a <code>public.payment_p2007_02</code> table reference
	 */
	public PaymentP2007_02() {
		this("payment_p2007_02", null);
	}

	/**
	 * Create an aliased <code>public.payment_p2007_02</code> table reference
	 */
	public PaymentP2007_02(String alias) {
		this(alias, PAYMENT_P2007_02);
	}

	private PaymentP2007_02(String alias, Table<PaymentP2007_02Record> aliased) {
		this(alias, aliased, null);
	}

	private PaymentP2007_02(String alias, Table<PaymentP2007_02Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PaymentP2007_02Record, Integer> getIdentity() {
		return Keys.IDENTITY_PAYMENT_P2007_02;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<PaymentP2007_02Record, ?>> getReferences() {
		return Arrays.<ForeignKey<PaymentP2007_02Record, ?>>asList(Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaymentP2007_02 as(String alias) {
		return new PaymentP2007_02(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PaymentP2007_02 rename(String name) {
		return new PaymentP2007_02(name, null);
	}
}