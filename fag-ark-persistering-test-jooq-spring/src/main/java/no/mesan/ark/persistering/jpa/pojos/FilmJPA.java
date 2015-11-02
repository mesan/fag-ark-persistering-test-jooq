package no.mesan.ark.persistering.jpa.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film", schema = "public")
public class FilmJPA implements Serializable {

	private static final long serialVersionUID = 1331889160;

	private Integer filmId;
	private String title;
	private String description;
	private Integer releaseYear;
	private Short languageId;
	private Short originalLanguageId;
	private Short rentalDuration;
	private BigDecimal rentalRate;
	private Short length;
	private BigDecimal replacementCost;
	//// private MpaaRating rating;
	private Timestamp lastUpdate;
	// private String[] specialFeatures;
	//// private Object fulltext;

	private Collection<ActorJPA> actors;
	private Collection<CategoryJPA> categories;

	public FilmJPA() {
	}

	public FilmJPA(FilmJPA value) {
		this.filmId = value.filmId;
		this.title = value.title;
		this.description = value.description;
		this.releaseYear = value.releaseYear;
		this.languageId = value.languageId;
		this.originalLanguageId = value.originalLanguageId;
		this.rentalDuration = value.rentalDuration;
		this.rentalRate = value.rentalRate;
		this.length = value.length;
		this.replacementCost = value.replacementCost;
		//// this.rating = value.rating;
		this.lastUpdate = value.lastUpdate;
		// this.specialFeatures = value.specialFeatures;
		// this.fulltext = value.fulltext;
	}

	public FilmJPA(Integer filmId, String title, String description, Integer releaseYear, Short languageId,
			Short originalLanguageId, Short rentalDuration, BigDecimal rentalRate, Short length,
			BigDecimal replacementCost/*
										 * , MpaaRating rating
										 */,
			Timestamp lastUpdate/*
								 * , String[] specialFeatures, Object fulltext
								 */
	) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.originalLanguageId = originalLanguageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		//// this.rating = rating;
		this.lastUpdate = lastUpdate;
		// this.specialFeatures = specialFeatures;
		// this.fulltext = fulltext;
	}

	@Id
	@Column(name = "film_id", unique = true, nullable = false, precision = 32)
	public Integer getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	@Column(name = "title", nullable = false, length = 255)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "release_year", precision = 32)
	public Integer getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Column(name = "language_id", nullable = false, precision = 16)
	public Short getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Short languageId) {
		this.languageId = languageId;
	}

	@Column(name = "original_language_id", precision = 16)
	public Short getOriginalLanguageId() {
		return this.originalLanguageId;
	}

	public void setOriginalLanguageId(Short originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}

	@Column(name = "rental_duration", nullable = false, precision = 16)
	public Short getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(Short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	@Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
	public BigDecimal getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	@Column(name = "length", precision = 16)
	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	@Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
	public BigDecimal getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	//
	// @Column(name = "rating")
	// public MpaaRating getRating() {
	// return this.rating;
	// }
	//
	// public void setRating(MpaaRating rating) {
	// this.rating = rating;
	// }
	//
	@Column(name = "last_update", nullable = false)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	// @Column(name = "special_features")
	// public String[] getSpecialFeatures() {
	// return this.specialFeatures;
	// }
	//
	// public void setSpecialFeatures(String[] specialFeatures) {
	// this.specialFeatures = specialFeatures;
	// }

	// @Column(name = "fulltext", nullable = false, columnDefinition="text")
	// public Object getFulltext() {
	// return this.fulltext;
	// }
	//
	// public void setFulltext(Object fulltext) {
	// this.fulltext = fulltext;
	// }

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "film_actor", joinColumns = { @JoinColumn(name = "film_id") }, inverseJoinColumns = {
			@JoinColumn(name = "actor_id") })
	public Collection<ActorJPA> getActors() {
		return actors;
	}

	public void setActors(Collection<ActorJPA> actors) {
		this.actors = actors;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "film_category", joinColumns = { @JoinColumn(name = "film_id") }, inverseJoinColumns = {
			@JoinColumn(name = "category_id") })
	public Collection<CategoryJPA> getCategories() {
		return categories;
	}

	public void setCategories(Collection<CategoryJPA> categories) {
		this.categories = categories;
	}
}
