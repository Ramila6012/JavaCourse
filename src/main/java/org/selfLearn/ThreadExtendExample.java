package org.selfLearn;

public class ThreadExtendExample extends Thread {
    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hi " + i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {

            }

        }
    }

    public static void main(String[] args) {
        ThreadExtendExample thread = new ThreadExtendExample();
        thread.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
            }
        }
    }
}
