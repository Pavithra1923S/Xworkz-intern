package com.xworkz.meeshoapp;
import com.xworkz.meeshoapp.userdata.MeeshoUserDto;
import com.xworkz.meeshoapp.signup.Meesho;
public class MeeshoRunner
{

        public static void main(String[] args) {
            MeeshoUserDto user1 = new MeeshoUserDto();
            user1.setEmail("pavithrasgowda1923@gmail.com");
            user1.setPhoneNumber("998765432");
            user1.setPassword("Biryani");
            user1.setFullName("Pavithra");
            user1.setBusinessName("Collaborations");

            Meesho meesho = new Meesho();
            if (meesho.userSignUp(user1)) {
                System.out.println("Meesho Registration Successful!");
            } else {
                System.out.println("Meesho Registration Failed!");
            }
        }
    }


