package com.xworkz.method.parmacy;

public class PharmacyRunner {
    public static void main(String[] args) {
        PharmacyDto dto = new PharmacyDto();
        dto.setPharmacyId(333);
        dto.setName("Apollo Pharmacy");
        dto.setArea("Rajajinagar");
        dto.setAvailable(true);
        dto.setMedicinesInStock(3200);

        System.out.println(dto.toString());
    }
}
