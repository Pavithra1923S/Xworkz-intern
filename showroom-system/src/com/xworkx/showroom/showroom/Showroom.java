package com.xworkx.showroom.showroom;

public class Showroom {

        public int showroomId;
        public String location;
        public String showroomName;
        public String manager[];



        public void getHotelInfo() {
            System.out.println("HShowroom id : " + showroomId);
            System.out.println("showroomname :" + showroomName);
            System.out.println("Location : " + location);
            for (String manager : manager)
                System.out.println("manager: " + manager);


        }
    }
