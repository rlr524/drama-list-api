package com.emiyaconsulting.dramalistapi.services;

import com.emiyaconsulting.dramalistapi.dao.DramaRepository;
import com.emiyaconsulting.dramalistapi.entity.Drama;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class DramaService {
    private final DramaRepository dramaRepository;

    public DramaService(DramaRepository dramaRepository) {
        this.dramaRepository = dramaRepository;
    }

    public Iterable<Drama> list() {
        return dramaRepository.findAll();
    }

    public Drama save(Drama drama) {
        return dramaRepository.save(drama);
    }

    public Drama get(Long id) {
        Optional<Drama> dramaOptional = dramaRepository.findById(id);
        if (dramaOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Title not found");
        }
        return dramaOptional.get();
    }

    public Drama update(Long id, Drama drama) {
        Optional<Drama> dramaOptional = dramaRepository.findById(id);
        if (dramaOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Title not found");
        }
        Drama existingDrama = dramaOptional.get();
        existingDrama.setDramaName(drama.getDramaName());
        return dramaRepository.save(existingDrama);
    }

    public void delete(Long id) {
        dramaRepository.deleteById(id);
    }
}
