package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.entity.Drama;
import com.emiyaconsulting.dramalistapi.services.DramaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dramas")
public class DramaController {
    DramaService dramaService;

    public DramaController(DramaService dramaService) {
        this.dramaService = dramaService;
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<Drama> getDramas() {
        return dramaService.list();
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Drama save(@RequestBody Drama drama) {
        return dramaService.save(drama);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Drama get(@PathVariable Long id) {
        return dramaService.get(id);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public Drama update(@PathVariable Long id, @RequestBody Drama drama) {
        return dramaService.update(id, drama);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id) {
        dramaService.delete(id);
    }

}
