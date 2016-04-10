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
@Table(name = "staff", schema = "public")
public class Staff implements Serializable {

	private static final long serialVersionUID = -211734948;

	private Integer   staffId;
	private String    firstName;
	private String    lastName;
	private Integer   addressId;
	private String    email;
	private Integer   storeId;
	private Boolean   active;
	private String    username;
	private String    password;
	private Timestamp lastUpdate;
	private byte[]    picture;

	public Staff() {}

	public Staff(Staff value) {
		this.staffId = value.staffId;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.addressId = value.addressId;
		this.email = value.email;
		this.storeId = value.storeId;
		this.active = value.active;
		this.username = value.username;
		this.password = value.password;
		this.lastUpdate = value.lastUpdate;
		this.picture = value.picture;
	}

	public Staff(
		Integer   staffId,
		String    firstName,
		String    lastName,
		Integer   addressId,
		String    email,
		Integer   storeId,
		Boolean   active,
		String    username,
		String    password,
		Timestamp lastUpdate,
		byte[]    picture
	) {
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressId = addressId;
		this.email = email;
		this.storeId = storeId;
		this.active = active;
		this.username = username;
		this.password = password;
		this.lastUpdate = lastUpdate;
		this.picture = picture;
	}

	@Id
	@Column(name = "staff_id", unique = true, nullable = false, precision = 32)
	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
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

	@Column(name = "address_id", nullable = false, precision = 32)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "store_id", nullable = false, precision = 32)
	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Column(name = "active", nullable = false)
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "username", nullable = false, length = 16)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 40)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "picture")
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Staff (");

		sb.append(staffId);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(addressId);
		sb.append(", ").append(email);
		sb.append(", ").append(storeId);
		sb.append(", ").append(active);
		sb.append(", ").append(username);
		sb.append(", ").append(password);
		sb.append(", ").append(lastUpdate);
		sb.append(", ").append("[binary...]");

		sb.append(")");
		return sb.toString();
	}
}