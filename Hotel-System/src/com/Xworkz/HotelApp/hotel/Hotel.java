package com.Xworkz.HotelApp.hotel;

import com.Xworkz.HotelApp.menu.Menu;

public class Hotel {
    public int hotelId;
    public String location;
    public String hotelName;
    public String branches[];
    public Menu[] menus;



    public void getHotelInfo(){
        System.out.println("Hotel id : " +hotelId);
        System.out.println("hotelname :"  +hotelName);
        System.out.println("Location : " +location);
        for(String branch : branches)
            System.out.println("branches : " +branch);
        for(Menu menu : menus)
            System.out.println( " menu :" +menu);

    }
}
