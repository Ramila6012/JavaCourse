package org.inheritance;

public class Animal {
    private String animalName;
    int animalId = 345;
    String animalColor = "Black";

    public String makeSound(){
        return "Roar";
    }

    public String makeSound(String volume){
        return "The sound is " + volume + " loud";
    }

    public Animal(){
        System.out.println(" I am from AnimaL Class");
    }
}
