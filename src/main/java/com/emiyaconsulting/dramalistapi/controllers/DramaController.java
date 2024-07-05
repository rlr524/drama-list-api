package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.services.DramaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dramas")
public class DramaController {
    DramaService dramaService;

    public DramaController(DramaService dramaService) {
        this.dramaService = dramaService;
    }
}
