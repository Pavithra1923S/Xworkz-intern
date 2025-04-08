package com.xworkz.myntra;

import com.xworkz.myntra.checkReg.MyntraRegCheck;
import com.xworkz.myntra.myntraDto.MyntraDto;
import com.xworkz.myntra.constant.Gender;
import com.xworkz.myntra.constant.PaymentMethod;

public class MyntraRunner {
    public static void main(String[] args) {

        MyntraDto myntraDto = new MyntraDto();
        myntraDto.setName("Pavithra");
        myntraDto.setEmailAddress("pavi@gmail.com");
        myntraDto.setPhoneNo(8888889999L);
        myntraDto.setPassword("Biryani");
        myntraDto.setAge(22);
        myntraDto.setGender(Gender.FEMALE);
        myntraDto.setDob("06/07/2001");
        myntraDto.setLocation("Bangalore");
        myntraDto.setAddress("Ganghinagar");
        myntraDto.setPaymentMethod(PaymentMethod.CREDIT);


        MyntraRegCheck myntraRegCheck = new MyntraRegCheck();
        myntraRegCheck.userRegistered(myntraDto);
    }
}
