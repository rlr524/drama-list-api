package com.emiyaconsulting.dramalistapi.dao;

import com.emiyaconsulting.dramalistapi.entity.Drama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DramaRepository extends JpaRepository<Drama, Long> {
}
