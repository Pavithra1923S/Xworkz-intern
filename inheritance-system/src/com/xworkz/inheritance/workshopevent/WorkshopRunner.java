package com.xworkz.inheritance.workshopevent;

public class WorkshopRunner {
    public static void main(String[] args) {

        WorkshopEvent workshopEvent = new WebinarEvent();
        workshopEvent.organizeWorkshop();
        workshopEvent.inviteParticipants();

        WebinarEvent webinarEvent = new WebinarEvent();
        webinarEvent.organizeWorkshop();
        webinarEvent.inviteParticipants();

        WorkshopEvent workshopEvent1 = new WebinarEvent();
        System.out.println(workshopEvent1);

        WebinarEvent webinarEvent1 =(WebinarEvent) workshopEvent1;
        System.out.println(webinarEvent1);
    }
}
