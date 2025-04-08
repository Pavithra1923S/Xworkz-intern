package com.xworkz.bobworldapp;
import com.xworkz.bobworldapp.userdata.BobWorldUserDto;
import com.xworkz.bobworldapp.signup.BobWorld;
public class BobWorldRunner
{


        public static void main(String[] args) {
            BobWorldUserDto user = new BobWorldUserDto();
            user.setEmail("pavithrasgowdA1923@gmail.com");
            user.setMobileNumber("9880456789");
            user.setPassword("Biryani1");
            user.setFullName("pavi");
            user.setAadharNumber("123456789012");
            user.setAccountType("Current");

            BobWorld bob = new BobWorld();
            if (bob.userSignUp(user)) {
                System.out.println("BOB World Registration Successful!");
            } else {
                System.out.println("BOB World Registration Failed!");
            }
        }
    }

   


