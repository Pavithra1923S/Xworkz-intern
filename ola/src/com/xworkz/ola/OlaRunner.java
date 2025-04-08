package com.xworkz.ola;

import com.xworkz.ola.checkReg.OlaRegCheck;
import com.xworkz.ola.olaDto.OlaDto;
import com.xworkz.ola.constant.PaymentMethod;

public class OlaRunner {
    public static void main(String[] args) {

        OlaDto olaDto = new OlaDto();
        olaDto.setFirstName("pavithra");
        olaDto.setLastName("S");
        olaDto.setEmailAddress("Pavithra@test.com");
        olaDto.setPhoneNo(8766554332L);
        olaDto.setPassword("pavi@2003");
        olaDto.setDob("06/07/2001");
        olaDto.setLocation("Bangalore");
        olaDto.setAddress("Subhashnagar");
        olaDto.setPaymentMethod(PaymentMethod.CREDIT);
        olaDto.setCaptcha("xyz123");


        OlaRegCheck olaRegCheck = new OlaRegCheck();
        olaRegCheck.userRegistered(olaDto);
    }
}
