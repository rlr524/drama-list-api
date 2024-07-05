package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.services.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
    CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
}
