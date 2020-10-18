package com.learning.animalcqrs.command.app.controller;

import com.learning.animalcqrs.command.domain.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @GetMapping(path = "/animal/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable String id) {
        Animal animal = new Animal("JoJo", "Mammal", "Monkey", 15);
        return ResponseEntity.ok(animal);
    }



}
