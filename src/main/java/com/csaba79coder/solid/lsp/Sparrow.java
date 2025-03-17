package com.csaba79coder.solid.lsp;

public class Sparrow implements FlyingBird {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow's sound: chirp");
    }
}
