package org.inheritance;

public class BMW extends User implements Vehicle {
    @Override
    public void engineType() {
        System.out.println("This is a Fuel Engine");
    }
}


