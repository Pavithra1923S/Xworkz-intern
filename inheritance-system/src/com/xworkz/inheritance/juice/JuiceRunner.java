package com.xworkz.inheritance.juice;

public class JuiceRunner {
    public static void main(String args[]) {

        Juice juice = new Juice();
        juice.taste();
        juice.cool();

        Maaza maaza = new Maaza();
        maaza.taste();
        maaza.cool();

        Juice juice1 = new Maaza();
        System.out.println(juice1);

        Maaza maaza1 =(Maaza) juice1;
        System.out.println(maaza1);
    }
}
