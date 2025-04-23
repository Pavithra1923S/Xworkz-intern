package com.xworkz.method.hotel;

public class HotelRunner {
    public static void main(String[] args) {
        HotelDto hotelDto = new HotelDto();
        hotelDto.setHotelId(321);
        hotelDto.setHotelName("leelaPalace");
        hotelDto.setCity("Bangalore");
        hotelDto.setStarRating(5);
        hotelDto.setRoomPrice(12000.50);

        System.out.println(hotelDto.toString());
    }
}
