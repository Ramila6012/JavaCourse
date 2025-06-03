package org.JavaMorningClass;

import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your currency amount : ");
        double curr_value1 = input.nextDouble();
        System.out.print("Enter the Exchange rate : ");
        double ExchangeRate = input.nextDouble();
        double USD = (curr_value1/ExchangeRate);
        System.out.printf("Your converted USD amount is %.2f", USD);
    }
}
