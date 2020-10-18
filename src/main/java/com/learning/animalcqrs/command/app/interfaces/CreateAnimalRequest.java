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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
