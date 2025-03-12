package com.csaba79coder.second;

import com.csaba79coder.second.model.Animal;
import com.csaba79coder.second.model.Cat;
import com.csaba79coder.second.model.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        // com.csaba79coder.first.model.Animal animal2 = new com.csaba79coder.first.model.Animal();
        animal.makeSound();

        Animal myAnimal = new Dog();
        myAnimal.makeSound();
        try {
            Cat myCat = (Cat) myAnimal;
            myCat.scratch();
        } catch (ClassCastException e) {
            System.out.println("HIBA!");
            //e.printStackTrace();
        }
        Animal myAnimal2 = new Cat();
        System.out.println("----------");
        myAnimal2.makeSound();
        System.out.println("----------");
        System.out.println("new Dog() - Dog példány ellenőzrés:");
        Animal myAnimal3 = new Dog();
        if (myAnimal3 instanceof Dog) {
            Dog myDog = (Dog) myAnimal3;
            myDog.fetch();
        } else {
            System.out.println("Ezt nem lehet Dog-ként kezelni ...");
        }
        System.out.println("new Cat() - Dog példány ellenőzrés:");
        Animal myAnimal4 = new Cat();
        if (myAnimal4 instanceof Dog) {
            Dog myDog = (Dog) myAnimal4;
            myDog.fetch();
        } else {
            System.out.println("Ezt nem lehet Dog-ként kezelni ...");
        }
        System.out.println("----------");
        System.out.println("new Animal() - Dog példány ellenőzrés:");
        Animal myAnimal5 = new Animal();
        if (myAnimal5 instanceof Dog) {
            Dog myDog = (Dog) myAnimal5;
            myDog.fetch();
        } else {
            System.out.println("Ezt nem lehet Dog-ként kezelni ...");
        }
    }
}
