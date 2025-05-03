package org.inheritance;

public class House {
    int houseId;
    String address;
    String houseType;
    static String STATE = "Texas";

    public House(int houseId, String address, String houseType){
        System.out.println(House.STATE);
        this. houseId = houseId;
        this. address = address;
        this. houseType = houseType;
    }
    public static void demo(){
        System.out.println("This is a demo method");
    }

    public static void main(String[] args) {
        House h1 = new House(3, "Plano", "Apartment");
        House.STATE = "New York";
        House h2 = new House(10, "Euless", "Home");
        House.demo();
    }
}
