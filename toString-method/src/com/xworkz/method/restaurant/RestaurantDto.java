package com.xworkz.method.restaurant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantDto {
    private int restaurantId;
        private String restaurantName;
        private String location;
        private String cuisine;
        private int rating;

        @Override
        public String toString() {
            return "RestaurantDto: \nrestaurantId = " + this.restaurantId +
                    " ," + "\nrestaurantName = " + this.restaurantName +
                    " ," + "\nlocation = " + this.location +
                    " ," + "\ncuisine = " + this.cuisine +
                    " ," + "\nrating = " + this.rating;
        }
    }



