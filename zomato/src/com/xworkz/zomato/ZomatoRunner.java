package com.xworkz.zomato;

import com.xworkz.zomato.checkReg.ZomatoRegCheck;
import com.xworkz.zomato.zomatoDto.ZomatoDto;

public class ZomatoRunner {
    public static void main(String[] args) {

        ZomatoDto zomatoDto = new ZomatoDto();
        zomatoDto.setFirstName("pavi");
        zomatoDto.setLastName("S");
        zomatoDto.setEmailAddress("pavi@test.com");
        zomatoDto.setPhoneNo(98876543L);
        zomatoDto.setPassword("pavi@2003");
        zomatoDto.setDob("06-09-2003");
        zomatoDto.setLocation("Bangalore");
        zomatoDto.setAddress("rrnagar");


        ZomatoRegCheck zomatoRegCheck = new ZomatoRegCheck();
        zomatoRegCheck.userRegistered(zomatoDto);
    }
}
