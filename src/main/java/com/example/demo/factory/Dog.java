package com.example.demo.factory;

public class Dog implements Pet {

    private String name;
    private String type = "dog";
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
