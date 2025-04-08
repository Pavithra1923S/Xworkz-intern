package com.xworkz.twitterapp;

import com.xworkz.twitterapp.checkreg.TwitterRegCheck;
import com.xworkz.twitterapp.twitterdto.TwitterDto;

public class TwitterRunner {
    public static void main(String[] args) {

        TwitterDto twitterDto = new TwitterDto();
        twitterDto.setFirstName("pavithra");
        twitterDto.setLastName("S");
        twitterDto.setUsername("pavi@2003");
        twitterDto.setEmailId("pavi@outlook.com");
        twitterDto.setPassword("pavi123");
        twitterDto.setPhoneNumber(999999L);
        twitterDto.setCaptcha("jskj832");


        TwitterRegCheck twitterRegCheck = new TwitterRegCheck();
        twitterRegCheck.userRegistered(twitterDto);
    }
}
