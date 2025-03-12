package com.csaba79coder.first;

import com.csaba79coder.first.model.Animal;
import com.csaba79coder.first.model.Dog;

public class Main {

    public static void main(String[] args) {
        String ball = "ball";
        /*
        String ball2 = new String("ball");
        String ball3 = "ball";
        System.out.println(ball.equals(ball2)); // true
        System.out.println(ball == ball2); // false
        System.out.println(ball == ball3); // true
        System.out.println(ball == ball2.intern()); // true
        */
        /**
         * +----------------------------+-----------------------------------------------------------+---------------------------------------------------------+
         * | Deklaráció                 | Metódushívás                                              | Elérhető metódusok                                      |
         * +----------------------------+-----------------------------------------------------------+---------------------------------------------------------+
         * | Animal animal = new Dog(); | A felülírt (@Override) metódusok az Dog osztályból futnak | Csak az Animal osztályban lévő metódusokat hívhatod meg |
         * +----------------------------+-----------------------------------------------------------+---------------------------------------------------------+
         * | Dog dog = new Dog();       | Az Dog saját és örökölt metódusai is elérhetők            | Minden Dog-ra jellemző metódus elérhető                 |
         * +----------------------------+-----------------------------------------------------------+---------------------------------------------------------+
         */
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch(ball);
        Animal animal2 = new Dog();
        animal2.makeSound(); // lefut a Dog implementációja
        // animal2.fetch(ball); // fordítási hiba, mert az Animal nem ismeri a fetch metódust (Ő nincs a szülőben!)
    }
}
