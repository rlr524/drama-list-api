package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.entity.Country;
import com.emiyaconsulting.dramalistapi.services.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountryController {
    CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<Country> getCountries() {
        return countryService.list();
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Country save(@RequestBody Country country) {
        return countryService.save(country);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Country get(@PathVariable Long id) {
        return countryService.get(id);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public Country update(@PathVariable Long id, @RequestBody Country country) {
        return countryService.update(id, country);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id) {
        countryService.delete(id);
    }
}
