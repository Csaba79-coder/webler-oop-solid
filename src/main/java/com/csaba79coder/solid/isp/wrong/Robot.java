package com.csaba79coder.solid.isp.wrong;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working ...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat!");
    }
}
