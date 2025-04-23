package com.xworkz.method.zomatoapp;

public class ZomatoRunner {

        public static void main(String[] args) {
            ZomatoDto zomatoDto = new ZomatoDto();
            zomatoDto.setFoodId(5001);
            zomatoDto.setFoodName("Paneer Butter Masala");
            zomatoDto.setRestaurantLocation("Indiranagar");
            zomatoDto.setCustomerContact("9876543210");
            zomatoDto.setDeliveryCharge(45.75);

            System.out.println(zomatoDto.toString());
        }
    }


