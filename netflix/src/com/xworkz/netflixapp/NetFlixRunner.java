package com.xworkz.netflixapp;
import com.xworkz.netflixapp.netflix.NetflixDto;
import com.xworkz.netflixapp.signin.NetflixUserSignin;

public class NetFlixRunner {
        public static void main(String[] args) {

            NetflixDto user = new NetflixDto();
            user.setUserId("pavithra@gmail.com");
            user.setUserName("pavi");
            user.setEmail("pavithra@gmail.com");
            user.setPassword("Biryani");
            user.setConfirmPassword("Biryani");
            user.setMobileNumber(9999999999L);

            NetflixUserSignin login = new NetflixUserSignin();
            boolean status = login.attemptLogin(user);

            System.out.println("Login status: " + status);
        }
    }


