package com.xworkz.blinkitapp;
import com.xworkz.blinkitapp.userdata.BlinkitUserDto;
import com.xworkz.blinkitapp.signup.Blinkit;
public class BlinkitRunner
{

        public static void main(String[] args) {
            BlinkitUserDto user1 = new BlinkitUserDto();
            user1.setEmail("pavithrasgowda@gmail.com");
            user1.setPhoneNumber("9999999999");
            user1.setPassword("Biryani@01");
            user1.setFullName("Pavithra");
            user1.setDeliveryAddress("Bangalore");

            Blinkit blinkit = new Blinkit();
            if (blinkit.userSignUp(user1)) {
                System.out.println("Blinkit Registration Successful!");
            } else {
                System.out.println("Blinkit Registration Failed!");
            }
        }
    }


