package org.selfLearn;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}


    class B extends Thread {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        }
    }

        public class ThreadPriorityAndSleepEx {
            public static void main(String[] args) {
                A a = new A();
                B b = new B();
                b.setPriority(Thread.MAX_PRIORITY);
                a.start();
                b.start();

            }
        }



