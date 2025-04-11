package com.xworkz.inheritance.dance;

public class DanceRunner {
    public static void main(String[] args) {
        Dance dance = new Dance();
        dance.startPerformance();
        dance.practiceRoutine();

        Bharatanatyam classical = new Bharatanatyam();
        classical.startPerformance();
        classical.practiceRoutine();
    }
}
