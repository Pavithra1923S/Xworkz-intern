package com.xworkz.calenderapp;

import com.xworkz.calenderapp.calender.Calender;
import com.xworkz.calenderapp.meetings.Meetings;
import com.xworkz.calenderapp.invitee.Invitee;
import com.xworkz.calenderapp.constants.Days;
public class CalenderRunner {
    public static void main(String[] args) {


        Calender calender = new Calender();
        calender.day=Days.Monday;
        Meetings meetings[]=new Meetings[1];
        Meetings meeting1 = new Meetings();
        meeting1.title = "Project Planning";
        meeting1.startTime = "10:00 AM";
        meeting1.endTime = "11:30 AM";

        Invitee invitees1[] = new Invitee[2];

        Invitee invitee1 = new Invitee();
        invitee1.setInviteeId(1);
        invitee1.setName("Radha");
        invitee1.setEmail("radha@gmail.com");
        invitee1.setPhoneNumber(9876543210L);

        Invitee invitee2 = new Invitee();
        invitee2.setInviteeId(2);
        invitee2.setName("Ranjini");
        invitee2.setEmail("ranjini@gmail.com");
        invitee2.setPhoneNumber(9876543211L);

        invitees1[0] = invitee1;
        invitees1[1] = invitee2;
        meeting1.invitees = invitees1;
        meetings[0]=meeting1;
        calender.meetings=meetings;
        calender.getCalenderInfo();
    }

}

