package com.emiyaconsulting.dramalistapi.dao;

import com.emiyaconsulting.dramalistapi.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
