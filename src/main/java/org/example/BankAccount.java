package org.example;

public class BankAccount {
    String branchName = "Kormangala";
    int pinCode = 75075;
    String address = "Banepa";
    String ifscCode = "RAM45OP";

    public void deposit(){
System.out.println("Let's deposit money");
    }

    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();
        System.out.println(b.branchName);
        System.out.println(b.pinCode);
        System.out.println(b.address);
        System.out.println(b.ifscCode);
        b.deposit();

    }
}
