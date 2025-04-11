package com.xworkz.inheritance.mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile basic = new Mobile();
        basic.makeCall();
        basic.sendMessage();

        Smartphone smart = new Smartphone();
        smart.makeCall();
        smart.sendMessage();
    }
}
