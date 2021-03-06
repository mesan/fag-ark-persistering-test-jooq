/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "customer", schema = "public")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1697810815;

	private Integer   customerId;
	private Integer   storeId;
	private String    firstName;
	private String    lastName;
	private String    email;
	private Integer   addressId;
	private Boolean   activebool;
	private Date      createDate;
	private Timestamp lastUpdate;
	private Integer   active;

	public Customer() {}

	public Customer(Customer value) {
		this.customerId = value.customerId;
		this.storeId = value.storeId;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.email = value.email;
		this.addressId = value.addressId;
		this.activebool = value.activebool;
		this.createDate = value.createDate;
		this.lastUpdate = value.lastUpdate;
		this.active = value.active;
	}

	public Customer(
		Integer   customerId,
		Integer   storeId,
		String    firstName,
		String    lastName,
		String    email,
		Integer   addressId,
		Boolean   activebool,
		Date      createDate,
		Timestamp lastUpdate,
		Integer   active
	) {
		this.customerId = customerId;
		this.storeId = storeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.addressId = addressId;
		this.activebool = activebool;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
		this.active = active;
	}

	@Id
	@Column(name = "customer_id", unique = true, nullable = false, precision = 32)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "store_id", nullable = false, precision = 32)
	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Column(name = "first_name", nullable = false, length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address_id", nullable = false, precision = 32)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "activebool", nullable = false)
	public Boolean getActivebool() {
		return this.activebool;
	}

	public void setActivebool(Boolean activebool) {
		this.activebool = activebool;
	}

	@Column(name = "create_date", nullable = false)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "last_update")
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "active", precision = 32)
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Customer (");

		sb.append(customerId);
		sb.append(", ").append(storeId);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(email);
		sb.append(", ").append(addressId);
		sb.append(", ").append(activebool);
		sb.append(", ").append(createDate);
		sb.append(", ").append(lastUpdate);
		sb.append(", ").append(active);

		sb.append(")");
		return sb.toString();
	}
}
