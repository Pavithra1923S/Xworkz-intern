package com.xworkz.foodpandaapp;
import com.xworkz.foodpandaapp.userdata.FoodPandaUserDto;
import com.xworkz.foodpandaapp.signup.FoodPanda;
public class FoodPandaRunner
{

        public static void main(String[] args) {
            FoodPandaUserDto user1 = new FoodPandaUserDto();
            user1.setEmail("pavithra@gmail.com");
            user1.setPhoneNumber("1234567890");
            user1.setPassword("Biryani@01");
            user1.setFullName("Pavithra");
            user1.setAddress("Bangalore");

            FoodPanda foodpanda = new FoodPanda();
            if (foodpanda.userSignUp(user1)) {
                System.out.println("Foodpanda Registration Successful!");
            } else {
                System.out.println("Foodpanda Registration Failed!");
            }
        }
    }


