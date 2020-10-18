package com.learning.animalcqrs.command.app.controller;

import com.learning.animalcqrs.command.app.interfaces.CreateAnimalRequest;
import com.learning.animalcqrs.command.domain.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalController {
    @GetMapping(path = "/animal/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable String id) {
        Animal animal = new Animal("JoJo", "Mammal", "Monkey", 15);
        return ResponseEntity.ok(animal);
    }

    @PostMapping(path = "/animal")
    public ResponseEntity<String> createAnimal(@RequestBody CreateAnimalRequest createAnimalRequest) {
        return new ResponseEntity<>("animal", HttpStatus.CREATED);
    }



}
