package com.xworkz.inheritance.camp;

public class CampRunner {
    public static void main(String[] args) {
        Camp camp = new Camp();
        camp.registerParticipants();
        camp.arrangeTents();

        NccCamp ncc = new NccCamp();
        ncc.registerParticipants();
        ncc.arrangeTents();

        Camp camp1 = new NccCamp();
        System.out.println(camp1);

        NccCamp nccCamp = (NccCamp)camp1;
        System.out.println(nccCamp);
    }
}
