package com.xworkz.customer.customer;



import com.xworkz.customer.bankaccount.BankAccount;
    public class Customer {
        public int customerId;
        public String customerName;
        public String location;
        public BankAccount bankAccounts[];
        public void displayCustomerInfo() {
            System.out.println("Customer ID: " + customerId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Location: " + location);
            for (BankAccount bankAccount : bankAccounts) {
                bankAccount.displayBankAccountInfo();
            }
        }
}
