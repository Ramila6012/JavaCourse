package org.selfLearn;

public class ThreadRunnableExample implements Runnable{

    @Override
    public void run(){
        for (int i= 0;i<5;i++){
            System.out.println("Hi" + ":" + i);
        }
    }

    public static void main(String[] args) {
        ThreadRunnableExample thread = new ThreadRunnableExample();
        Thread th= new Thread(thread);
        th.start();
        for(int i= 0; i<=5; i++){
            System.out.println("Hello" + ":" + i);
        }
    }
}
