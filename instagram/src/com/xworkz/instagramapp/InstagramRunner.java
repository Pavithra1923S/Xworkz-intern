package com.xworkz.instagramapp;
import com.xworkz.instagramapp.userdata.UserDataDto;
import com.xworkz.instagramapp.signup.Instagram;

public class InstagramRunner
{
    public static void main(String[] args)
    {
        UserDataDto user1=new UserDataDto();
        user1.setEmail("pavithra@gmail.com");
        user1.setDob("12-12-2003");
        user1.setName("Pavithra");
        user1.setUserName("Pavithra");
        user1.setPassword("Biryani");

        Instagram user=new Instagram();
        if(user.userSignUp(user1))
            System.out.println("User Registration Successfull");
        else
            System.out.println("User Registration Unsuccessfull");

    }

}
