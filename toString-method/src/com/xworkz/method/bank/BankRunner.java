package com.xworkz.method.bank;

public class BankRunner {
    public static void main(String[] args) {
        BankDto bankDto = new BankDto();
        bankDto.setBankId(10);
        bankDto.setBankName("SBI");
        bankDto.setBranch("Main Branch");
        bankDto.setInterestRate(6.75);
        bankDto.setLocation("Rajajinagar");

        System.out.println(bankDto.toString());
    }
}
