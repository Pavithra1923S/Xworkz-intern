package com.furniture.mattress;

import com.furniture.mattress.mattress.Mattress;

public class MattressRunner {
    public static void main(String[] args) {
        Mattress mattress1 = new Mattress();
        mattress1.setBrand("Sleepwell");
        mattress1.setType("Foam");
        mattress1.setThickness(6.0);
        mattress1.setLength(75.0);
        mattress1.setWidth(36.0);
        mattress1.setOrthopedic(false);
        mattress1.setPrice(8500);

        Mattress mattress2 = new Mattress();
        mattress2.setBrand("Wakefit");
        mattress2.setType("Memory Foam");
        mattress2.setThickness(8.0);
        mattress2.setLength(78.0);
        mattress2.setWidth(60.0);
        mattress2.setOrthopedic(true);
        mattress2.setPrice(12000);

        Mattress mattress3 = new Mattress();
        mattress3.setBrand("Kurlon");
        mattress3.setType("Spring");
        mattress3.setThickness(7.0);
        mattress3.setLength(72.0);
        mattress3.setWidth(48.0);
        mattress3.setOrthopedic(false);
        mattress3.setPrice(9500);

        Mattress mattress4 = new Mattress();
        mattress4.setBrand("Duroflex");
        mattress4.setType("Coir");
        mattress4.setThickness(5.0);
        mattress4.setLength(75.0);
        mattress4.setWidth(72.0);
        mattress4.setOrthopedic(true);
        mattress4.setPrice(11000);

        Mattress mattress5 = new Mattress();
        mattress5.setBrand("Sleepyhead");
        mattress5.setType("Hybrid");
        mattress5.setThickness(10.0);
        mattress5.setLength(78.0);
        mattress5.setWidth(72.0);
        mattress5.setOrthopedic(true);
        mattress5.setPrice(15000);

        mattress1.details();
        mattress2.details();
        mattress3.details();
        mattress4.details();
        mattress5.details();
    }
}