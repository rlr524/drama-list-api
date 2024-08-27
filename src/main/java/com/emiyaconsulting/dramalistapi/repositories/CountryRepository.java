package com.emiyaconsulting.dramalistapi.repositories;

import com.emiyaconsulting.dramalistapi.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
