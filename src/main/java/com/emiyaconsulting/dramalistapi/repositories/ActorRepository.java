package com.emiyaconsulting.dramalistapi.repositories;

import com.emiyaconsulting.dramalistapi.entity.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {
}
