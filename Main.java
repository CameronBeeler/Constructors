package com.cambeeler;

public class Main {

    public static void main(String[] args) {

        BankAccount CamsAcct = new BankAccount();
        BankAccount WAcct = new BankAccount("Wyatt Beeler", "wyattwbeeler@gmail.com", "4792505466");
        BankAccount AniAcct = new BankAccount( "123456789", 500.25, "Ani", "analiese.beeler", "4792505466");


//        BankAccount CamsAcct = new BankAccount( 550239624,
//                                                1234567,
//                                                "Cameron Beeler",
//                                                "cameron.beeler@gmail.com",
//                                                "4792505466");


        CamsAcct.printAccountInfo();
        WAcct.printAccountInfo();
        AniAcct.printAccountInfo();

        VIPCustomer Cam = new VIPCustomer("Cameron", "cameron.beeler@gmail.com", 10_000);
        VIPCustomer Kim = new VIPCustomer("Kim", "Kimncamnfam@gmail.com", 5_000);
        VIPCustomer Shiloh = new VIPCustomer("Shiloh", "shurtugal@gmail.com");
        VIPCustomer testName = new VIPCustomer("Test");
        VIPCustomer notName = new VIPCustomer();


        Cam.printAccountInfo();
        Kim.printAccountInfo();
        Shiloh.printAccountInfo();
        testName.printAccountInfo();
        notName.printAccountInfo();

        String cName = Cam.getName();
        String kEmail = Kim.getEmailAddress();
        double sCreditLimit = Shiloh.getCreditLimit();

        System.out.println(
                "\nCam Name:            " + cName + "\n" +
                "Kim Email:           " + kEmail + "\n" +
                "Shiloh Credit Limit: " + String.format("%,.2f",sCreditLimit));

//        CamsAcct.setCustomerName("Cameron Beeler");
//        CamsAcct.setAccountNumber("550239624");
//        CamsAcct.setAccountBalance(42_527.27);
//        CamsAcct.setEmailAddress("cameron.beeler@gmail.com");
//        CamsAcct.printAccountInfo();



//        System.out.println("Withdrawal status:  " + CamsAcct.withdraw(18_043.73));
//        CamsAcct.printAccountInfo();
//
//        System.out.println("Deposit status:  " + CamsAcct.deposit((long)5_000.77));
//        CamsAcct.printAccountInfo();

    }
}
