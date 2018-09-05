/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder.oop;


public class OopDemo {

    
    public static void main(String[] args) {
       Cat cat = new Cat("Tom");
       Dog dog = new Dog("Milu");
       
       Zoo zoo = new Zoo();
       zoo.add(cat);
       zoo.add(dog);
       zoo.showListAnimal();
    }
    
}
