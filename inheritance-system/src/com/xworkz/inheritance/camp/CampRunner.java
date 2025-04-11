package com.xworkz.inheritance.camp;

public class CampRunner {
    public static void main(String[] args) {
        Camp camp = new Camp();
        camp.registerParticipants();
        camp.arrangeTents();

        NccCamp ncc = new NccCamp();
        ncc.registerParticipants();
        ncc.arrangeTents();
    }
}
