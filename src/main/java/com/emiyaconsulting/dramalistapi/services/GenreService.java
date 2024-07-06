package com.emiyaconsulting.dramalistapi.services;

import com.emiyaconsulting.dramalistapi.dao.GenreRepository;
import com.emiyaconsulting.dramalistapi.entity.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Iterable<Genre> list() {
        return genreRepository.findAll();
    }

    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }

    public Genre get(Long id) {
        Optional<Genre> genreOptional = genreRepository.findById(id);
        if (genreOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Genre not found");
        }
        return genreOptional.get();
    }

    public Genre update(Long id, Genre genre) {
        Optional<Genre> genreOptional = genreRepository.findById(id);
        if (genreOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Genre not found");
        }
        Genre existingGenre = genreOptional.get();
        existingGenre.setGenreName(genre.getGenreName());
        return genreRepository.save(existingGenre);
    }

    public void delete(Long id) {
        genreRepository.deleteById(id);
    }
}
