package com.xworkz.method.restaurant;

public class RestaurantRunner {
     public static void main(String[] args) {
            RestaurantDto restaurantDto = new RestaurantDto();
            restaurantDto.setRestaurantId(101);
            restaurantDto.setRestaurantName("The Pavithra paradice");
            restaurantDto.setLocation("basaveshwaranagar");
            restaurantDto.setCuisine("Indian");
            restaurantDto.setRating(4);

            System.out.println(restaurantDto.toString());
        }
    }


