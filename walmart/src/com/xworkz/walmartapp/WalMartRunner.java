package com.xworkz.walmartapp;

import com.xworkz.walmartapp.login.UserLogIn;
import com.xworkz.walmartapp.walmart.WalMartDto;

public class WalMartRunner {
    public static void main(String[] args) {


        WalMartDto walMartDto = new WalMartDto();
        walMartDto.setEmailId("booby6993@gmail.com");
        walMartDto.setFirstName("pavithra");
        walMartDto.setLastName("S");
        walMartDto.setPhoneNumber("1234567890");
        walMartDto.setPassWord("Biryani@01");

        UserLogIn userLogIn = new UserLogIn();
        boolean ref = userLogIn.customerProfileValidation( walMartDto);

        if(ref == true){
            System.out.println("login successful");
        }
        else{
            System.out.println("login unsuccessful");
        }
    }
}
