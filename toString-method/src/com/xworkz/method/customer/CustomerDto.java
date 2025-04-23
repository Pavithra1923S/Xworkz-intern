package com.xworkz.method.customer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDto {
    private int customerId;
        private String customerName;
        private String email;
        private String phoneNumber;
        private String address;

        @Override
        public String toString() {
            return "CustomerDto: \ncustomerId = " + this.customerId +
                    " ," + "\ncustomerName = " + this.customerName +
                    " ," + "\nemail = " + this.email +
                    " ," + "\nphoneNumber = " + this.phoneNumber +
                    " ," + "\naddress = " + this.address;
        }
    }


