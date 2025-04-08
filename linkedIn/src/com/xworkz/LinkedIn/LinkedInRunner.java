package com.xworkz.LinkedIn;

import com.xworkz.LinkedIn.checkReg.LinkedInRegCheck;
import com.xworkz.LinkedIn.linkedinDto.LinkedInDto;
import com.xworkz.LinkedIn.constant.Country;

public class LinkedInRunner {
    public static void main(String[] args) {
        LinkedInDto linkedInDto = new LinkedInDto();
        linkedInDto.setFirstName("pavi");
        linkedInDto.setLastName("S");
        linkedInDto.setEmailAddress("pavi@outlook.com");
        linkedInDto.setPassword("pavi123");
        linkedInDto.setCountry(Country.INDIA);
        linkedInDto.setPhoneNo(999999999L);
        linkedInDto.setDob("01/01/2003");
        linkedInDto.setJobTitle("Student");
        linkedInDto.setLocation("Banglore");
        linkedInDto.setCaptcha("kkw765444");

        LinkedInRegCheck linkedInRegCheck = new LinkedInRegCheck();
        linkedInRegCheck.userRegistered(linkedInDto);
    }
}
