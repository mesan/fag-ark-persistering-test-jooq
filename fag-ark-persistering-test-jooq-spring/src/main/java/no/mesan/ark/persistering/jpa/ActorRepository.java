package no.mesan.ark.persistering.jpa;

import org.springframework.data.repository.CrudRepository;

import no.mesan.ark.persistering.jpa.pojos.ActorJPA;

public interface ActorRepository extends CrudRepository<ActorJPA, Integer> {

}
