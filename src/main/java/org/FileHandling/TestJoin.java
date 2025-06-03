package org.FileHandling;

public class TestJoin {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();
        try {
            System.out.println(Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException e) {
        }
      t2.start();
        try {
            System.out.println(Thread.currentThread().getName());
            t2.join();
        } catch (InterruptedException e) {
        }
        t3.start();
        try {
            System.out.println(Thread.currentThread().getName());
            t3.join();
        } catch (InterruptedException e) {
        }
    }
}
