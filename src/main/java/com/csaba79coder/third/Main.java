package com.csaba79coder.third;

import com.csaba79coder.third.model.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle);
        System.out.println("------------");
        try {
            Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
            System.out.println(triangle2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");
        try {
            Triangle triangle3 = new Triangle(1.0, 2.0, 10.0);
            System.out.println(triangle3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");
        Triangle triangle4 = new Triangle(1.0, 2.0, 10.0);
        System.out.println(triangle4);
        System.out.println("EZ már nem fut le! mivel a try catch miatt elszállt a program exit code 1 ...");
    }
}
