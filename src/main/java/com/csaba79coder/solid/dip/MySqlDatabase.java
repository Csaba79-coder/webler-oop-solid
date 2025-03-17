package com.csaba79coder.solid.dip;

public class MySqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
