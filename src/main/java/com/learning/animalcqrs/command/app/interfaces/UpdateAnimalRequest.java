package com.learning.animalcqrs.command.app.interfaces;

public class UpdateAnimalRequest {
    private Integer age;
    private String name;

    public UpdateAnimalRequest(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasChanges() {
        return this.name != null || this.age != null;
    }
}
