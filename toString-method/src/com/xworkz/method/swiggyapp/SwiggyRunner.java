package com.xworkz.method.swiggyapp;

import lombok.Setter;

@Setter
public class SwiggyRunner {

        public static void main(String[] args) {
            SwiggyDto swiggyDto = new SwiggyDto();
            swiggyDto.setOrderId(101);
            swiggyDto.setRestaurantName("Meghana Foods");
            swiggyDto.setCustomerName("Pavithra");
            swiggyDto.setDeliveryAddress("Rajajinagar");
            swiggyDto.setTotalPrice(450.50);

            System.out.println(swiggyDto.toString());
        }
    }


