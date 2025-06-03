package org.FileHandling;

import java.sql.SQLOutput;

public class Restaurant {
    boolean foodReady = false;

    public synchronized void prepareFood(){
        System.out.println("Food is getting prepared");
        foodReady = true;
        System.out.println("Food is prepared, please collect it");
        notify();
    }

    public synchronized void serveFood(){
        while(!foodReady){
            System.out.println("Waiting for the food to be prepared");
            try {
                wait();
            } catch (InterruptedException e) {

            }
            System.out.println("Food is ready, I am going to serve the food");
        }
        System.out.println("Food served to the customer");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                r.prepareFood();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                r.serveFood();
            }
        });
        t2.start();
        t1.start();
    }

}
