package com.appliances.geyser;

import com.appliances.geyser.geyser.Geyser;

public class GeyserRunner {
    public static void main(String[] args) {
        Geyser geyser1 = new Geyser();
        geyser1.setBrand("AO Smith");
        geyser1.setCapacityLiters(25);
        geyser1.setIsInstant(false);
        geyser1.setPowerSource("Electric");
        geyser1.setPowerConsumption(2.0);
        geyser1.setMaterial("Stainless Steel");
        geyser1.setPrice(8999.99);

        Geyser geyser2 = new Geyser();
        geyser2.setBrand("Bajaj");
        geyser2.setCapacityLiters(15);
        geyser2.setIsInstant(true);
        geyser2.setPowerSource("Electric");
        geyser2.setPowerConsumption(3.0);
        geyser2.setMaterial("Plastic");
        geyser2.setPrice(6599.50);

        Geyser geyser3 = new Geyser();
        geyser3.setBrand("Venus");
        geyser3.setCapacityLiters(10);
        geyser3.setIsInstant(true);
        geyser3.setPowerSource("Gas");
        geyser3.setPowerConsumption(1.5);
        geyser3.setMaterial("Copper");
        geyser3.setPrice(7299.75);

        Geyser geyser4 = new Geyser();
        geyser4.setBrand("Havells");
        geyser4.setCapacityLiters(20);
        geyser4.setIsInstant(false);
        geyser4.setPowerSource("Electric");
        geyser4.setPowerConsumption(2.5);
        geyser4.setMaterial("Glass-Lined");
        geyser4.setPrice(8450.25);

        Geyser geyser5 = new Geyser();
        geyser5.setBrand("Crompton");
        geyser5.setCapacityLiters(6);
        geyser5.setIsInstant(true);
        geyser5.setPowerSource("Gas");
        geyser5.setPowerConsumption(1.8);
        geyser5.setMaterial("Aluminium");
        geyser5.setPrice(5599.00);

        geyser1.details();
        geyser2.details();
        geyser3.details();
        geyser4.details();
        geyser5.details();
    }
}