/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.pojos;


import java.io.Serializable;

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
@Table(name = "actor_info", schema = "public")
public class ActorInfo implements Serializable {

	private static final long serialVersionUID = -1304633615;

	private Integer actorId;
	private String  firstName;
	private String  lastName;
	private String  filmInfo;

	public ActorInfo() {}

	public ActorInfo(ActorInfo value) {
		this.actorId = value.actorId;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.filmInfo = value.filmInfo;
	}

	public ActorInfo(
		Integer actorId,
		String  firstName,
		String  lastName,
		String  filmInfo
	) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.filmInfo = filmInfo;
	}

	@Column(name = "actor_id", precision = 32)
	public Integer getActorId() {
		return this.actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "film_info")
	public String getFilmInfo() {
		return this.filmInfo;
	}

	public void setFilmInfo(String filmInfo) {
		this.filmInfo = filmInfo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ActorInfo (");

		sb.append(actorId);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(filmInfo);

		sb.append(")");
		return sb.toString();
	}
}
