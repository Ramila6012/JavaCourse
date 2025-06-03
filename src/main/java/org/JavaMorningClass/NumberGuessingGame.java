package org.JavaMorningClass;

import java.util.Locale;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int num= (int) (Math.random()*10);
        System.out.println(num);
        Scanner input = new Scanner(System.in);
        boolean keepGuessing = true;
        while(keepGuessing){
            System.out.println("Please enter your number you want to guess:");
            double yourNum= input.nextDouble();
            if (yourNum == num){
                System.out.println("Your guess is right");
                break;
            }
            else {
                System.out.println("Oops you guessed it wrong, Do you want to try different number!(Y/N)");
                String c = input.nextLine().toLowerCase();
                if (c.equals("y")) {
                    keepGuessing = true;
                    System.out.println("Thank you for playing");
                }
                }
            }
            }
    }
