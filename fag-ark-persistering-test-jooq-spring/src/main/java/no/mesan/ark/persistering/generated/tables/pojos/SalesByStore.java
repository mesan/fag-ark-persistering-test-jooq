/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


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
public class SalesByStore implements Serializable {

	private static final long serialVersionUID = -1229432382;

	private String     store;
	private String     manager;
	private BigDecimal totalSales;

	public SalesByStore() {}

	public SalesByStore(SalesByStore value) {
		this.store = value.store;
		this.manager = value.manager;
		this.totalSales = value.totalSales;
	}

	public SalesByStore(
		String     store,
		String     manager,
		BigDecimal totalSales
	) {
		this.store = store;
		this.manager = manager;
		this.totalSales = totalSales;
	}

	@Column(name = "store")
	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	@Column(name = "manager")
	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Column(name = "total_sales")
	public BigDecimal getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("SalesByStore (");

		sb.append(store);
		sb.append(", ").append(manager);
		sb.append(", ").append(totalSales);

		sb.append(")");
		return sb.toString();
	}
}
