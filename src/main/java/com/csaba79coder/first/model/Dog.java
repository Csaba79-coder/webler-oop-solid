package com.csaba79coder.first.model;

public class Dog extends  Animal {

    public void makeSound() {
        System.out.println("Bark!");
    }

    public void fetch(String something) {
        System.out.println("Fetching the " + something + " ...");
    }
}
