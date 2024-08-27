package com.emiyaconsulting.dramalistapi.controllers;

import com.emiyaconsulting.dramalistapi.services.ActorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actors")
public class ActorController {
    ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
}
