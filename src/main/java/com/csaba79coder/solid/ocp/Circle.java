package com.csaba79coder.solid.ocp;

public class Circle implements Shape {

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
