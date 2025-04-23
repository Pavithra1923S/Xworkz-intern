package com.xworkz.method.ola;

public class OlaRunner {
    public static void main(String[] args) {
        OlaDto oladto = new OlaDto();
        oladto.setName("pavithra");
        oladto.setMailId("pavithrasgpwda@hmail.com");
        oladto.setPhno(9809890890L);
        oladto.setGender('F');
        oladto.setLocation("rajajinagar");


        System.out.println(oladto.toString());
    }
}
