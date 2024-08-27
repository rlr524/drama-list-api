package com.emiyaconsulting.dramalistapi.repositories;

import com.emiyaconsulting.dramalistapi.entity.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
