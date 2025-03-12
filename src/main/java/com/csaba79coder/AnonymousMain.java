package com.csaba79coder;

public class AnonymousMain {

    public static void main(String[] args) {
       /*InnerClass inner = new InnerClass();
       inner.startApplication();*/
        new InnerClass().startApplication();
    }

    // statikus osztály kizárólag inner class lehet a Javaban!
    private static class InnerClass {

        public void startApplication() {
            // A Runnable egy functional interface, kizárólag egy abstract metódusa a run() van!
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is anonymous inner class");
                }
            };
            // Using the anonymous inner class to create a thread
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
