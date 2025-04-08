package com.xworkz.zeptoapp;
import com.xworkz.zeptoapp.userdata.ZeptoUserDto;
import com.xworkz.zeptoapp.signup.Zepto;
public class ZeptoRunner
{
    public static void main(String[] args) {
        ZeptoUserDto user1 = new ZeptoUserDto();
        user1.setEmail("pavithrasgowda@gmail.com");
        user1.setPhoneNumber("9876543210");
        user1.setName("Pavithra");
        user1.setPassword("Biryani@01");
        user1.setAddress("Bangalore");

        Zepto zepto = new Zepto();
        if (zepto.userSignUp(user1)) {
            System.out.println("Zepto User Registration Successful");
        } else {
            System.out.println("Zepto User Registration Failed");
        }
    }
}
