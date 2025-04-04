package com.xworkx.showroom;

import com.xworkx.showroom.manager.Manager;
import com.xworkx.showroom.showroom.Showroom;

public class ShowroomRunner {




        public static void main(String[] args) {
            System.out.println("main started");
            String manager[] = {"dev", "atharva"};



            Showroom new1 = new Showroom();
            new1.showroomId =1 ;
            new1.showroomName= "pavithra paradise";
            new1.location = "vijaynagar";
            new1.manager = manager;

            Manager managers = new Manager();
            managers.managerid = 1;
            managers.managerName ="darshan";
            managers.staff = new String[]{"sudeep"};




            new1.getHotelInfo();
            managers.menuDetails();

            System.out.println("main ended");
        }

    }



