package com.Xworkz.HotelApp.menu;

public class Menu {
        public int menusId;
        public String ingredients[];
    public String menuName;

    public void menuDetails() {
        System.out.println("Menu id :" + menusId);
        System.out.println("Menus name : " + menuName);
        for (String ingredient : ingredients) {
            System.out.println("ingredients :" +ingredient);
        }


    }



}
