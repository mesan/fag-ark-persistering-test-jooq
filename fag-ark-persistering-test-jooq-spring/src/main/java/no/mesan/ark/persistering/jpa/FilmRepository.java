package no.mesan.ark.persistering.jpa;

import org.springframework.data.repository.CrudRepository;

import no.mesan.ark.persistering.jpa.pojos.FilmJPA;

public interface FilmRepository extends CrudRepository<FilmJPA, Integer> {

}
