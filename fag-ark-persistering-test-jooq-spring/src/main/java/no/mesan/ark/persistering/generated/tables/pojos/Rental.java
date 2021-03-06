/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "rental", schema = "public")
public class Rental implements Serializable {

	private static final long serialVersionUID = 1706853341;

	private Integer   rentalId;
	private Timestamp rentalDate;
	private Integer   inventoryId;
	private Integer   customerId;
	private Timestamp returnDate;
	private Integer   staffId;
	private Timestamp lastUpdate;

	public Rental() {}

	public Rental(Rental value) {
		this.rentalId = value.rentalId;
		this.rentalDate = value.rentalDate;
		this.inventoryId = value.inventoryId;
		this.customerId = value.customerId;
		this.returnDate = value.returnDate;
		this.staffId = value.staffId;
		this.lastUpdate = value.lastUpdate;
	}

	public Rental(
		Integer   rentalId,
		Timestamp rentalDate,
		Integer   inventoryId,
		Integer   customerId,
		Timestamp returnDate,
		Integer   staffId,
		Timestamp lastUpdate
	) {
		this.rentalId = rentalId;
		this.rentalDate = rentalDate;
		this.inventoryId = inventoryId;
		this.customerId = customerId;
		this.returnDate = returnDate;
		this.staffId = staffId;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@Column(name = "rental_id", unique = true, nullable = false, precision = 32)
	public Integer getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	@Column(name = "rental_date", nullable = false)
	public Timestamp getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Timestamp rentalDate) {
		this.rentalDate = rentalDate;
	}

	@Column(name = "inventory_id", nullable = false, precision = 32)
	public Integer getInventoryId() {
		return this.inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	@Column(name = "customer_id", nullable = false, precision = 32)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "return_date")
	public Timestamp getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
	}

	@Column(name = "staff_id", nullable = false, precision = 32)
	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Rental (");

		sb.append(rentalId);
		sb.append(", ").append(rentalDate);
		sb.append(", ").append(inventoryId);
		sb.append(", ").append(customerId);
		sb.append(", ").append(returnDate);
		sb.append(", ").append(staffId);
		sb.append(", ").append(lastUpdate);

		sb.append(")");
		return sb.toString();
	}
}
