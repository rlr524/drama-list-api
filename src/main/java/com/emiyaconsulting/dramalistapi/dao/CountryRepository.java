package com.emiyaconsulting.dramalistapi.dao;

import com.emiyaconsulting.dramalistapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
