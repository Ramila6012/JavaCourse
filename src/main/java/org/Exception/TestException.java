package org.Exception;

import java.sql.SQLOutput;

public class TestException {
    public void withdraw(int money) throws InsufficientFundsException {
        if (money < 100) {
             throw new InsufficientFundsException("No funds available");
            /*try {
                throw new InsufficientFundsException("No funds available");
            }
            catch (InsufficientFundsException e) {
                throw new RuntimeException(e);
            }
            finally {
                System.out.println("This is from finally block");
            }*/
        }
    }
    public static void main(String[] args)  {
        TestException test = new TestException();
        try {
            test.withdraw( 100);
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("This is from finally block");
        }
        System.out.println("Withdraw successful");
    }
}
