package no.mesan.ark.persistering;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import no.mesan.ark.persistering.jpa.ActorRepository;
import no.mesan.ark.persistering.jpa.FilmRepository;
import no.mesan.ark.persistering.jpa.pojos.ActorJPA;
import no.mesan.ark.persistering.jpa.pojos.CategoryJPA;
import no.mesan.ark.persistering.jpa.pojos.FilmJPA;

@Component
public class JPADemo {

	private ActorRepository actorRepo;
	private FilmRepository filmsRepo;

	@Autowired
	public JPADemo(ActorRepository actorRepo, FilmRepository filmsRepo) {
		this.actorRepo = actorRepo;
		this.filmsRepo = filmsRepo;
	}

	@Transactional
	public void runActors() {
		System.out.println("JPA Demo Actor");

		StreamSupport.stream(actorRepo.findAll().spliterator(), false)
				.map(record -> "ID: " + record.getActorId() + ", First name: " + record.getFirstName() + ", Last name: "
						+ record.getLastName() + ", # films: " + record.getFilms().size())
				.collect(Collectors.toList()).stream().limit(10).forEach(System.out::println);
	}

	@Transactional
	public void runFilms() {
		System.out.println("JPA Demo Film");

		StreamSupport.stream(filmsRepo.findAll().spliterator(), false).map(this::filmInfo).collect(Collectors.toList())
				.stream().limit(10).forEach(System.out::println);
	}

	private String filmInfo(FilmJPA film) {
		BinaryOperator<String> accumulator = (strA, strB) -> strA + ", " + strB;

		return "ID: " + film.getFilmId() + "; Title: " + film.getTitle() + "; Actors: "
				+ film.getActors().stream().map(ActorJPA::toString).reduce(accumulator).orElse("ingen")
				+ "; Categories: "
				+ film.getCategories().stream().map(CategoryJPA::getName).reduce(accumulator).orElse("ingen");
	}

}
