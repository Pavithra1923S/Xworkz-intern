package com.xworkz.inheritance.application;



public class ApplicationRunner {
    public static void main(String args[]) {

        Application application = new Application();
        application.knowledge();
        application.entertains();

        Youtube youtube = new Youtube();
        youtube.knowledge();
        youtube.entertains();
    }
}
