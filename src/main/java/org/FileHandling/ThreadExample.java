package org.FileHandling;

public class ThreadExample extends Thread {

    @Override
    public void run(){
        for(int i=0; i<100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample th = new ThreadExample();
        th.start();
        for(int i=0; i<100; i++){
            if(i%2 == 0){
            System.out.println(Thread.currentThread().getName() +  ": " + i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
