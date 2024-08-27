package com.emiyaconsulting.dramalistapi.repositories;

import com.emiyaconsulting.dramalistapi.entity.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
}
