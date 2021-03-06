/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.routines;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class LastDay extends AbstractRoutine<Date> {

	private static final long serialVersionUID = 1544990576;

	/**
	 * The parameter <code>public.last_day.RETURN_VALUE</code>.
	 */
	public static final Parameter<Date> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE, false);

	/**
	 * The parameter <code>public.last_day._1</code>.
	 */
	public static final Parameter<Timestamp> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMP, false);

	/**
	 * Create a new routine call instance
	 */
	public LastDay() {
		super("last_day", Public.PUBLIC, org.jooq.impl.SQLDataType.DATE);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(Timestamp value) {
		setValue(_1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void set__1(Field<Timestamp> field) {
		setField(_1, field);
	}
}
