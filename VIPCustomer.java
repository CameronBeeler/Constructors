package com.cambeeler;

public class VIPCustomer {

    private String name;
    private String emailAddress;
    private double creditLimit;

    public VIPCustomer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }


    public VIPCustomer(String name, String emailAddress){
        this(name, emailAddress, 0.0);
    }

    public VIPCustomer(String name){
        this(name, "N/A", 0.0);
    }

    public VIPCustomer(){
        this(   "Default",
                "default@gmail.com",
                0.0);
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void printAccountInfo(){
        System.out.println(            "\nCustomer Name:      " + this.name + "\n"
                +                      "Email Address:      " + this.emailAddress + "\n"
                +                      "Credit Limit $      " + String.format("%,.2f",this.creditLimit));
    }

}
