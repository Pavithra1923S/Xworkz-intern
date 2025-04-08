package com.xworkz.flipkart;
import com.xworkz.flipkart.userdata.FlipKartUserDto;
import com.xworkz.flipkart.signup.FlipKart;
public class FlipKartRunner
{

        public static void main(String[] args) {
            FlipKartUserDto user1 = new FlipKartUserDto();
            user1.setEmail("Pavithra.com");
            user1.setPhoneNumber("9880478053");
            user1.setPassword("Biryani01");
            user1.setFullName("Pavithra");
            user1.setShippingAddress("chanpatna");

            FlipKart flipkart = new FlipKart();
            if (flipkart.userSignUp(user1)) {
                System.out.println("Flipkart Registration Successful!");
            } else {
                System.out.println("Flipkart Registration Failed!");
            }
        }
    }


