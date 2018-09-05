/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder.oop;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }
    
    public void add(Animal animal) {
        animals.add(animal);
    }
    
    public void showListAnimal() {
        animals.forEach((animal) -> {
            animal.sayHello();
        });
    }
}
