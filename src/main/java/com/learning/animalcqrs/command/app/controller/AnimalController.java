package com.learning.animalcqrs.command.app.controller;

import com.learning.animalcqrs.command.app.interfaces.CreateAnimalRequest;
import com.learning.animalcqrs.command.app.interfaces.UpdateAnimalRequest;
import com.learning.animalcqrs.command.app.service.AnimalWriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class AnimalController {

    private AnimalWriteService animalWriteService;

    public AnimalController(AnimalWriteService animalWriteService) {
        this.animalWriteService = animalWriteService;
    }

    @PostMapping(path = "/animal")
    public ResponseEntity<String> createAnimal(@RequestBody @Valid CreateAnimalRequest createAnimalRequest) {
        animalWriteService.createAnimal(createAnimalRequest);
        return new ResponseEntity<>("animal", HttpStatus.CREATED);
    }

    @PatchMapping(path = "/animal/{id}")
    public ResponseEntity<String> updateAnima(@RequestBody @Valid UpdateAnimalRequest updateAnimalRequest, @PathVariable Integer id) {
        animalWriteService.updateAnimal(updateAnimalRequest, id);
        return new ResponseEntity<>("", HttpStatus.CREATED);
    }



}
