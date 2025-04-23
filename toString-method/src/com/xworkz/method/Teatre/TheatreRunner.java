package com.xworkz.method.Teatre;

public class TheatreRunner {
    public static void main(String[] args) {
        TheatreDto dto = new TheatreDto();
        dto.setTheatreId(1);
        dto.setName("PVR Orion");
        dto.setScreenType("IMAX");
        dto.setTotalSeats(220);
        dto.setAcAvailable(true);

        System.out.println(dto.toString());
    }
}
