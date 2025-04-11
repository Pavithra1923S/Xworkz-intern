package com.xworkz.inheritance.vtu;


public class VtuRunner {
    public static void main(String[] args) {
        VTU vtu = new VTU();
        vtu.conductExam();
        vtu.publishResults();

        Vkit vkit = new Vkit();
        vkit.conductExam();
        vkit.publishResults();

        VTU vtu1 = new Vkit();
        System.out.println(vtu1);

        Vkit vkit1 =(Vkit) vtu1;
        System.out.println(vkit1);
    }
}
