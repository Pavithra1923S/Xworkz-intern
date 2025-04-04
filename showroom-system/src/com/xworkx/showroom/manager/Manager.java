package com.xworkx.showroom.manager;

public class Manager {


        public int managerid;
        public String staff[];
        public String managerName;

        public void menuDetails() {
            System.out.println("Manager id :" + managerid);
            System.out.println("Manager name : " + managerName);
            for (String ingredient : staff) {
                System.out.println("staff :" + staff);
            }


        }}



