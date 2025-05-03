package org.inheritance;

public class Audi extends User implements Vehicle,EVVehicle {

    @Override
    public void engineType() {
        System.out.println("This is EV Engine");
    }
}
