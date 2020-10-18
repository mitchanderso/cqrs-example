package com.learning.animalcqrs.command.app.service;

import com.learning.animalcqrs.command.app.interfaces.CreateAnimalRequest;
import com.learning.animalcqrs.command.domain.Animal;
import com.learning.animalcqrs.command.domain.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalWriteService {
    private AnimalRepository animalRepository;

    public AnimalWriteService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void createAnimal(CreateAnimalRequest createAnimalRequest) {
        // TODO Properly convert the animal
        animalRepository.save(new Animal(createAnimalRequest.getName(), createAnimalRequest.getGroup(), createAnimalRequest.getSpecies(), createAnimalRequest.getAge()));
    }
}
