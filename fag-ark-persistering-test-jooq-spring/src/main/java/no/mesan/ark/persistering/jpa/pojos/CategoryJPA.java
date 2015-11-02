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
@Table(name = "category", schema = "public")
public class CategoryJPA implements Serializable {

	private static final long serialVersionUID = -548234514;

	private Integer categoryId;
	private String name;
	private Timestamp lastUpdate;

	private Collection<FilmJPA> films;

	public CategoryJPA() {
	}

	public CategoryJPA(CategoryJPA value) {
		this.categoryId = value.categoryId;
		this.name = value.name;
		this.lastUpdate = value.lastUpdate;
	}

	public CategoryJPA(Integer categoryId, String name, Timestamp lastUpdate) {
		this.categoryId = categoryId;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@Column(name = "category_id", unique = true, nullable = false, precision = 32)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "name", nullable = false, length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@ManyToMany(mappedBy = "categories")
	public Collection<FilmJPA> getFilms() {
		return films;
	}

	public void setFilms(Collection<FilmJPA> films) {
		this.films = films;
	}
}
