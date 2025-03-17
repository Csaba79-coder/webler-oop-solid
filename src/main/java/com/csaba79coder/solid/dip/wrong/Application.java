package com.csaba79coder.solid.dip.wrong;

public class Application {

    private final MySqlDatabase database = new MySqlDatabase();

    public void start() {
        database.connect();
    }
}
