package com.learning.animalcqrs.command.app.controller;

import com.learning.animalcqrs.command.app.interfaces.CreateAnimalRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalController {

    @PostMapping(path = "/animal")
    public ResponseEntity<String> createAnimal(@RequestBody CreateAnimalRequest createAnimalRequest) {
        // TODO Validate the animal
        return new ResponseEntity<>("animal", HttpStatus.CREATED);
    }



}
