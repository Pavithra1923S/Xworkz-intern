package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.constants.Days;
import com.xworkz.calenderapp.meetings.Meetings;


public class Calender {


   public  Days day;

   public Meetings meetings[];

   public void getCalenderInfo() {

      System.out.println("The meeting day is:" + day);

      for (Meetings meeting : meetings)
         meeting.getMeetingInfo();
   }

}