package com.emiyaconsulting.dramalistapi.services;

import com.emiyaconsulting.dramalistapi.entity.Actor;
import com.emiyaconsulting.dramalistapi.repositories.ActorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ActorService {
    // Often you will see the implementation of the repository (in this case, the service) implement
    // the repository directly, however we are choosing to favor a composition pattern here. 
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Iterable<Actor> list() {
        return actorRepository.findAll();
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    public Actor get(Long id) {
        Optional<Actor> actorOptional = actorRepository.findById(id);
        if (actorOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor not found");
        }
        return actorOptional.get();
    }

    public Actor update(Long id, Actor actor) {
        Optional<Actor> actorOptional = actorRepository.findById(id);
        if (actorOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Actor not found");
        }
        Actor existingActor = actorOptional.get();
        existingActor.setLastName(actor.getLastName());
        existingActor.setFirstName(actor.getFirstName());
        return actorRepository.save(existingActor);
    }

    public void delete(Long id) {
        actorRepository.deleteById(id);
    }
}
