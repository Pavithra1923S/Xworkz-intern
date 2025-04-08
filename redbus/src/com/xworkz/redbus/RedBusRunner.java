package com.xworkz.redbus;

import com.xworkz.redbus.checkReg.RedBusRegCheck;
import com.xworkz.redbus.redbusDto.RedBusDto;
import com.xworkz.redbus.constant.Gender;
import com.xworkz.redbus.constant.PaymentMethod;

public class RedBusRunner {
    public static void main(String[] args) {

        RedBusDto redBusDto = new RedBusDto();
        redBusDto.setFirstName("Pavitra");
        redBusDto.setLastName("S");
        redBusDto.setEmailAddress("pavithra@test.com");
        redBusDto.setPhoneNo(888888L);
        redBusDto.setPassword("pavi@2003");
        redBusDto.setGender(Gender.female);
        redBusDto.setDob("06/07/2001");
        redBusDto.setLocation("Bangalore");
        redBusDto.setAddress("R Tnagar");
        redBusDto.setPaymentMethod(PaymentMethod.CREDIT);

        RedBusRegCheck redBusRegCheck = new RedBusRegCheck();
        redBusRegCheck.userRegistered(redBusDto);
    }
}
