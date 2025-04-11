package com.xworkz.inheritance.pharmacy;


public class PharmacyRunner {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.dispenseMedicine();
        pharmacy.checkStock();

        MedicalStore store = new MedicalStore();
        store.dispenseMedicine();
        store.checkStock();

        Pharmacy pharmacy1 = new MedicalStore();
        System.out.println(pharmacy1);

        MedicalStore medicalStore =(MedicalStore) pharmacy1;
        System.out.println(medicalStore);
    }
}
