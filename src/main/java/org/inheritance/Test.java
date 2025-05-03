package org.inheritance;

public class Test {

    public static void main(String[] args) {
        Audi v = new Audi();
        v.engineType();
        System.out.println(v.userName);
        BMW obj = new BMW();
        obj.engineType();
        System.out.println(obj.userName);
        Vehicle.VEHICLE_TYPE = "Fuel";
        System.out.println(Vehicle.VEHICLE_TYPE);

    }
}
