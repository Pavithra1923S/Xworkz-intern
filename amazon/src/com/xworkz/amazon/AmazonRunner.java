package com.xworkz.amazon;

import com.xworkz.amazon.checkReg.AmazonRegCheck;
import com.xworkz.amazon.amazonDto.AmazonDto;
import com.xworkz.amazon.constant.Gender;
import com.xworkz.amazon.constant.PaymentMethod;

public class AmazonRunner {
    public static void main(String[] args) {

        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setName("Pavithra S");
        amazonDto.setEmailAddress("pavi@gmail.com");
        amazonDto.setPhoneNo(88888888L);
        amazonDto.setPassword("pavi@2003");
        amazonDto.setGender(Gender.FEMALE);
        amazonDto.setDob("06/07/2001");
        amazonDto.setLocation("Bangalore");
        amazonDto.setAddress("rajajinagar");
        amazonDto.setPaymentMethod(PaymentMethod.CREDIT);


        AmazonRegCheck amazonRegCheck = new AmazonRegCheck();
        amazonRegCheck.userRegistered(amazonDto);
    }
}
