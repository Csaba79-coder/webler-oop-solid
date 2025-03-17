package com.csaba79coder.solid.lsp;

public class Penguin implements Bird {

    @Override
    public void makeSound() {
        System.out.println("Penguin's sound: honk!");
    }
}
