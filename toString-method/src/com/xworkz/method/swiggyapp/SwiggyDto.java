package com.xworkz.method.swiggyapp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class SwiggyDto {

        private int orderId;
        private String restaurantName;
        private String customerName;
        private String deliveryAddress;
        private double totalPrice;

        @Override
        public String toString() {
            return "SwiggyDto: (orderId = " + this.orderId +
                    " ," + "\nrestaurantName = " + this.restaurantName +
                    " ," + "\ncustomerName = " + this.customerName +
                    " ," + "\ndeliveryAddress = " + this.deliveryAddress +
                    " ," + "\ntotalPrice = " + this.totalPrice + ")";
        }
    }



