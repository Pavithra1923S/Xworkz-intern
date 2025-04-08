package com.xworkz.ubereatsapp;
import com.xworkz.ubereatsapp.userdata.UberEatsUserDto;
import com.xworkz.ubereatsapp.signup.UberEats;
public class UberEatsRunner
{

        public static void main(String[] args) {
            UberEatsUserDto user1 = new UberEatsUserDto();
            user1.setEmail("pavithra.com");
            user1.setPhoneNumber("9880456087");
            user1.setFullName("Pavithra");
            user1.setPassword("Biryani");
            user1.setDeliveryAddress("Chanpatna");

            UberEats uberEats = new UberEats();
            if (uberEats.userSignUp(user1)) {
                System.out.println("UberEats Registration Successful!");
            } else {
                System.out.println("UberEats Registration Failed!");
            }
        }
    }


