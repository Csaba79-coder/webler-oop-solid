package com.csaba79coder.solid.isp;

public class Human implements Workable, Eatable {

    @Override
    public void eat() {
        System.out.println("Human is working ...");
    }

    @Override
    public void work() {
        System.out.println("Human is eating ...");
    }
}
