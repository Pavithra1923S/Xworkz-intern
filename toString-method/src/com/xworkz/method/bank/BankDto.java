package com.xworkz.method.bank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankDto {
    private int bankId;
    private String bankName;
    private String branch;
    private double interestRate;
    private String location;

    @Override
    public String toString() {
        return "BankDto: \nbankId = " + this.bankId +
                " ," + "\nbankName = " + this.bankName +
                " ," + "\nbranch = " + this.branch +
                " ," + "\ninterestRate = " + this.interestRate +
                " ," + "\nlocation = " + this.location;
    }
}
