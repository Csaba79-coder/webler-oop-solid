package com.csaba79coder.solid.dip;

public class Application {

    private final Database database;

    // constructor based dependency injection!
    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}
