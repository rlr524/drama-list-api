package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.services.GenreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {
    GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }
}
