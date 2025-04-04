package com.Xworkz.HotelApp;

import com.Xworkz.HotelApp.hotel.Hotel;
import com.Xworkz.HotelApp.menu.Menu;



public class Hotelrunner {

    public static void main(String[] args) {
        System.out.println("main started");
        String branchesForHotel[] = {"vijaynagar", "rajajinagar"};
        String ingredientsForPalav[] = {"chicken", " masala", "rice", "water"};
        String ingredientsFortea[] = {"milk", " sugar", "taj", "water"};


        Hotel hotel = new Hotel();
        hotel.hotelId =1 ;
        hotel.hotelName= "pavithra paradise";
        hotel.location = "vijaynagar";
        hotel.branches = branchesForHotel;

        Menu menus0 = new Menu();
        menus0.menusId = 1;
        menus0.menuName ="palav";
        menus0.ingredients = ingredientsForPalav;


        Menu menus1 = new Menu();
        menus1.menusId = 2;
        menus1.menuName ="tea";
        menus1.ingredients = ingredientsFortea;


        Menu menus[] = new Menu[2];
        menus[0] = menus0;
        menus[1] =menus1;
        hotel.menus = menus;   //association {has a relationship}

    hotel.getHotelInfo();
    menus0.menuDetails();
    menus1.menuDetails();
    System.out.println("main ended");
    }

}
