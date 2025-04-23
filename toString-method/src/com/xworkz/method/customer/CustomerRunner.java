package com.xworkz.method.customer;

public class CustomerRunner {
    public static void main(String[] args) {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustomerId(501);
            customerDto.setCustomerName("Pavithra");
            customerDto.setEmail("pavithra@gmail.com");
            customerDto.setPhoneNumber("9880478053");
            customerDto.setAddress("peenya");

            System.out.println(customerDto.toString());
        }
    }


