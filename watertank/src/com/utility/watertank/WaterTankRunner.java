package com.utility.watertank;

import com.utility.watertank.watertank.WaterTank;

public class WaterTankRunner {
    public static void main(String[] args) {
        WaterTank tank1 = new WaterTank();
        tank1.setBrand("Sintex");
        tank1.setCapacityInLiters(1000);
        tank1.setMaterial("Plastic");
        tank1.setColor("Black");
        tank1.setInsulated(true);
        tank1.setHeight(1.2);
        tank1.setDiameter(1.5);

        WaterTank tank2 = new WaterTank();
        tank2.setBrand("Plasto");
        tank2.setCapacityInLiters(750);
        tank2.setMaterial("HDPE");
        tank2.setColor("Blue");
        tank2.setInsulated(false);
        tank2.setHeight(1.0);
        tank2.setDiameter(1.2);

        WaterTank tank3 = new WaterTank();
        tank3.setBrand("Supreme");
        tank3.setCapacityInLiters(500);
        tank3.setMaterial("PVC");
        tank3.setColor("White");
        tank3.setInsulated(true);
        tank3.setHeight(0.9);
        tank3.setDiameter(1.0);

        WaterTank tank4 = new WaterTank();
        tank4.setBrand("Vectus");
        tank4.setCapacityInLiters(1500);
        tank4.setMaterial("Plastic");
        tank4.setColor("Green");
        tank4.setInsulated(false);
        tank4.setHeight(1.5);
        tank4.setDiameter(1.8);

        WaterTank tank5 = new WaterTank();
        tank5.setBrand("Storex");
        tank5.setCapacityInLiters(2000);
        tank5.setMaterial("LLDPE");
        tank5.setColor("Yellow");
        tank5.setInsulated(true);
        tank5.setHeight(1.7);
        tank5.setDiameter(2.0);

        tank1.details();
        tank2.details();
        tank3.details();
        tank4.details();
        tank5.details();
    }
}