package com.xworkz.method.parmacy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PharmacyDto {
    private int pharmacyId;
    private String name;
    private String area;
    private boolean available;
    private int medicinesInStock;

    @Override
    public String toString() {
        return "PharmacyDto: \npharmacyId = " + this.pharmacyId +
                " ," + "\nname = " + this.name +
                " ," + "\narea = " + this.area +
                " ," + "\navailable = " + this.available +
                " ," + "\nmedicinesInStock = " + this.medicinesInStock;
    }
}
