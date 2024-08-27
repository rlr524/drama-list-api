package com.emiyaconsulting.dramalistapi.repositories;

import com.emiyaconsulting.dramalistapi.entity.Drama;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DramaRepository extends CrudRepository<Drama, Long> {
}
