package org.FileHandling;

public class ThreadJoin extends Thread{
    @Override
    public void run(){
        for(int i=0; i<= 2;i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + ":  " + i);
            } catch (Exception e) {
            }
        }
    }
}
