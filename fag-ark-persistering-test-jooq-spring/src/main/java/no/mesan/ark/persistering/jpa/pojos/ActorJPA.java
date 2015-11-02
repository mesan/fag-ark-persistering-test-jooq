package no.mesan.ark.persistering.jpa.pojos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actor", schema = "public")
public class ActorJPA implements Serializable {

	private static final long serialVersionUID = -599307764;

	private Integer actorId;
	private String firstName;
	private String lastName;
	private Timestamp lastUpdate;

	private Collection<FilmJPA> films;

	public ActorJPA() {
	}

	public ActorJPA(ActorJPA value) {
		this.actorId = value.actorId;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.lastUpdate = value.lastUpdate;
	}

	public ActorJPA(Integer actorId, String firstName, String lastName, Timestamp lastUpdate) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@Column(name = "actor_id", unique = true, nullable = false, precision = 32)
	public Integer getActorId() {
		return this.actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
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

	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@ManyToMany(mappedBy = "actors")
	public Collection<FilmJPA> getFilms() {
		return films;
	}

	public void setFilms(Collection<FilmJPA> films) {
		this.films = films;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
