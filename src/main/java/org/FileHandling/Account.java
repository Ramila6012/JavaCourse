package org.FileHandling;

public class Account {
    boolean accountAccess = false;

    public synchronized void withdrawThroughAtm() {
        System.out.println("Withdrawing from ATM");
        accountAccess = true;
        System.out.println("Thread t1 about to surrender the lock");
        notify();
    }

    public synchronized void withdrawFromBranch() {
        while (!accountAccess) {
            try {
                System.out.println("Thread t2 is waiting");
                wait();
                System.out.println("Thread t2 is running again");
            } catch (Exception e) {
            }

        }
        System.out.println("Withdraw is successful, Enjoy!");
    }

    public static void main(String[] args) {
        Account a = new Account();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.withdrawThroughAtm();            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.withdrawFromBranch();            }
        });
        t2.start();
        t1.start();
    }
}