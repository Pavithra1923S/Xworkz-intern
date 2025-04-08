package com.stationery.marker;

import com.stationery.marker.marker.Marker;

public class MarkerRunner {
    public static void main(String[] args) {
        Marker marker1 = new Marker();
        marker1.setBrand("Camlin");
        marker1.setColor("Black");
        marker1.setLength(14.5);
        marker1.setRefillable(true);
        marker1.setTipType("Chisel");
        marker1.setInkType("Permanent");
        marker1.setPrice(25.0);

        Marker marker2 = new Marker();
        marker2.setBrand("Faber-Castell");
        marker2.setColor("Blue");
        marker2.setLength(13.0);
        marker2.setRefillable(false);
        marker2.setTipType("Bullet");
        marker2.setInkType("Dry-Erase");
        marker2.setPrice(30.0);

        Marker marker3 = new Marker();
        marker3.setBrand("Luxor");
        marker3.setColor("Red");
        marker3.setLength(15.0);
        marker3.setRefillable(true);
        marker3.setTipType("Fine");
        marker3.setInkType("Wet-Erase");
        marker3.setPrice(28.5);

        Marker marker4 = new Marker();
        marker4.setBrand("Cello");
        marker4.setColor("Green");
        marker4.setLength(14.0);
        marker4.setRefillable(false);
        marker4.setTipType("Brush");
        marker4.setInkType("Water-Based");
        marker4.setPrice(20.0);

        Marker marker5 = new Marker();
        marker5.setBrand("Staedtler");
        marker5.setColor("Purple");
        marker5.setLength(13.5);
        marker5.setRefillable(true);
        marker5.setTipType("Calligraphy");
        marker5.setInkType("Gel-Based");
        marker5.setPrice(35.0);

        marker1.details();
        marker2.details();
        marker3.details();
        marker4.details();
        marker5.details();
    }
}