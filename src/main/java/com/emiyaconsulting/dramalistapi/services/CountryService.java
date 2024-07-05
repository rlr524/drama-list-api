package com.emiyaconsulting.dramalistapi.services;

import com.emiyaconsulting.dramalistapi.dao.CountryRepository;
import com.emiyaconsulting.dramalistapi.entity.Country;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Iterable<Country> list() {
        return countryRepository.findAll();
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public Country get(Long id) {
        Optional<Country> countryOptional = countryRepository.findById(id);
        if (countryOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Title not found");
        }
        return countryOptional.get();
    }

    public Country update(Long id, Country country) {
        Optional<Country> countryOptional = countryRepository.findById(id);
        if (countryOptional.isEmpty()) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND, "Title not found");
        }
        Country existingCountry = countryOptional.get();
        existingCountry.setCountryName(country.getCountryName());
        return countryRepository.save(existingCountry);
    }

    public void delete(Long id) {
        countryRepository.deleteById(id);
    }
}
