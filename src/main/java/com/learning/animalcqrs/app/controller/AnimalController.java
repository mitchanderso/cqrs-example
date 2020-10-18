package com.learning.animalcqrs.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @GetMapping(path = "/animal/{id}")
    public ResponseEntity<String> getAnimalById(@PathVariable String id) {
        return ResponseEntity.ok("TODO");
    }

}
