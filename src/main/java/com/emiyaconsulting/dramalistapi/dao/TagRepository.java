package com.emiyaconsulting.dramalistapi.dao;

import com.emiyaconsulting.dramalistapi.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
