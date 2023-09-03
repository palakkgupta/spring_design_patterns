package com.example.demo.controller;

import com.example.demo.factory.Pet;
import com.example.demo.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    private PetFactory petFactory;


    @PostMapping("/adoptPet/{type}/{name}")
    private Pet adoptPet(@PathVariable String type, @PathVariable String name){
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        return pet;
    }

}
