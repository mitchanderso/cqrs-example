package com.learning.animalcqrs.command.app.service;

import com.learning.animalcqrs.command.app.error.EntityNotFoundException;
import com.learning.animalcqrs.command.app.interfaces.CreateAnimalRequest;
import com.learning.animalcqrs.command.app.interfaces.UpdateAnimalRequest;
import com.learning.animalcqrs.command.domain.Animal;
import com.learning.animalcqrs.command.domain.AnimalRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
public class AnimalWriteService {
    private AnimalRepository animalRepository;
    private ConversionService conversionService;

    public AnimalWriteService(AnimalRepository animalRepository, ConversionService conversionService) {
        this.animalRepository = animalRepository;
        this.conversionService = conversionService;
    }

    public void createAnimal(CreateAnimalRequest createAnimalRequest) {
        animalRepository.save(conversionService.convert(createAnimalRequest, Animal.class));
    }

    public void updateAnimal(UpdateAnimalRequest updateAnimalRequest, Integer id) {
        Animal previousAnimal = animalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));

        if (updateAnimalRequest.getAge() != null) {
            previousAnimal.setAge(updateAnimalRequest.getAge());
        }
        if (updateAnimalRequest.getName() != null){
            previousAnimal.setName(updateAnimalRequest.getName());
        }

        animalRepository.save(previousAnimal);
    }
}
