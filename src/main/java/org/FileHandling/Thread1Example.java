package org.FileHandling;

public class Thread1Example implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() +  ": " + i);
        }
    }

    public static void main(String[] args) {
        Thread1Example thr = new Thread1Example();
        Thread th = new Thread(thr);
        th.start();
        for(int i=50; i<100; i++){
            System.out.println(Thread.currentThread().getName() +  ": " + i);
        }
    }

}
