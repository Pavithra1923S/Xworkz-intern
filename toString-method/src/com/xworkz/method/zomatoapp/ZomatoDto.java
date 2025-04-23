package com.xworkz.method.zomatoapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZomatoDto {

        private int foodId;
        private String foodName;
        private String restaurantLocation;
        private String customerContact;
        private double deliveryCharge;

        @Override
        public String toString() {
            return "ZomatoDto: \nfoodId = " + this.foodId +
                    " ," + "\nfoodName = " + this.foodName +
                    " ," + "\nrestaurantLocation = " + this.restaurantLocation +
                    " ," + "\ncustomerContact = " + this.customerContact +
                    " ," + "\ndeliveryCharge = " + this.deliveryCharge ;
        }
    }



