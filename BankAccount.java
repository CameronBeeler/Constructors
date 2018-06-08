package com.cambeeler;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


    public BankAccount(){

        this("000000000",
                0.0,
                "Customer Name dflt",
                "default@bank.com",
                "(800) 800-8000");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public BankAccount(double accountBalance, String customerName, String emailAddress, String phoneNumber) {
        this("99999", accountBalance, customerName, emailAddress, phoneNumber);
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this("99999", 0.0, customerName, emailAddress, phoneNumber);
    }


    // SETTERS
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
// GETTERS


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String withdraw(double withdraw){
        String returnString;
        if((withdraw <= accountBalance) && (withdraw > 0)){
            this.accountBalance -= withdraw;
            returnString = "$ " + String.format("%,.2f",withdraw) + " withdrawal successful";
            return returnString;
        }
        else {
            returnString = "$ " + String.format("%,.2f",withdraw) + " is an Invalid withdraw request";
            return returnString;
        }
    }

    public String deposit(double deposit){
        String returnString;
        if (deposit > 0){
            this.accountBalance += deposit;
            returnString = "$ " + String.format("%,.2f",deposit) + " Deposit successful";
            return returnString;
        }
        else {
            returnString = "$ " + String.format("%,.2f",deposit) + " is an invalid deposit amount";
            return returnString;
        }
    }

    public void printAccountInfo(){
        System.out.println("\n\nCustomer Name     " + this.customerName + "\n"
        +                      "Account Nbr       " + this.accountNumber + "\n"
        +                      "Account Balance $ " + String.format("%,.2f",this.accountBalance) + "\n");
    }
}
