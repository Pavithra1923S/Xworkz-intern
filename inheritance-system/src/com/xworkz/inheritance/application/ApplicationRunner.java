package com.xworkz.inheritance.application;

public class ApplicationRunner {
    public static void main(String args[]) {

        Application application = new Application();
        application.knowledge();
        application.entertains();

        Youtube youtube = new Youtube();
        youtube.knowledge();
        youtube.entertains();


        Application application1 = new Youtube();
        System.out.println(application1);
        Youtube youtube1 =(Youtube)application1;
        System.out.println(youtube1);
    }
}
