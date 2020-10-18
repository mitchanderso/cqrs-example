package com.learning.animalcqrs.command.app.interfaces;

import com.learning.animalcqrs.command.domain.Animal;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AnimalRequestToAnimalConvertor implements Converter<CreateAnimalRequest, Animal> {
    @Override
    public Animal convert(CreateAnimalRequest createAnimalRequest) {
        return new Animal(createAnimalRequest.getName(), createAnimalRequest.getGroup(), createAnimalRequest.getSpecies(), createAnimalRequest.getAge());
    }
}
