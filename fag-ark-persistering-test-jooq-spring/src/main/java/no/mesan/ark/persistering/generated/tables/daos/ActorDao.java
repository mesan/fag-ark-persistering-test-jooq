/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.tables.Actor;
import no.mesan.ark.persistering.generated.tables.records.ActorRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class ActorDao extends DAOImpl<ActorRecord, no.mesan.ark.persistering.generated.tables.pojos.Actor, Integer> {

	/**
	 * Create a new ActorDao without any configuration
	 */
	public ActorDao() {
		super(Actor.ACTOR, no.mesan.ark.persistering.generated.tables.pojos.Actor.class);
	}

	/**
	 * Create a new ActorDao with an attached configuration
	 */
	public ActorDao(Configuration configuration) {
		super(Actor.ACTOR, no.mesan.ark.persistering.generated.tables.pojos.Actor.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(no.mesan.ark.persistering.generated.tables.pojos.Actor object) {
		return object.getActorId();
	}

	/**
	 * Fetch records that have <code>actor_id IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.Actor> fetchByActorId(Integer... values) {
		return fetch(Actor.ACTOR.ACTOR_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>actor_id = value</code>
	 */
	public no.mesan.ark.persistering.generated.tables.pojos.Actor fetchOneByActorId(Integer value) {
		return fetchOne(Actor.ACTOR.ACTOR_ID, value);
	}

	/**
	 * Fetch records that have <code>first_name IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.Actor> fetchByFirstName(String... values) {
		return fetch(Actor.ACTOR.FIRST_NAME, values);
	}

	/**
	 * Fetch records that have <code>last_name IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.Actor> fetchByLastName(String... values) {
		return fetch(Actor.ACTOR.LAST_NAME, values);
	}

	/**
	 * Fetch records that have <code>last_update IN (values)</code>
	 */
	public List<no.mesan.ark.persistering.generated.tables.pojos.Actor> fetchByLastUpdate(Timestamp... values) {
		return fetch(Actor.ACTOR.LAST_UPDATE, values);
	}
}
