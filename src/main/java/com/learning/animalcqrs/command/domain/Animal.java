package com.learning.animalcqrs.command.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String animalGroup;
    private String species;
    private Integer age;

    public Animal() {
    }



    public Animal(String name, String animalGroup, String species, Integer age) {
        this.name = name;
        this.animalGroup = animalGroup;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalGroup() {
        return animalGroup;
    }

    public void setAnimalGroup(String animalGroup) {
        this.animalGroup = animalGroup;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
