package com.learning.animalcqrs.command.app.interfaces;

public class CreateAnimalRequest {
    private String name;
    private String group;
    private String species;
    private Integer age;

    public CreateAnimalRequest(String name, String group, String species, Integer age) {
        this.name = name;
        this.group = group;
        this.species = species;
        this.age = age;
    }
}
