package com.csaba79coder.solid.dip;

public class PostGreSqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to PostGreSQL...");
    }
}
