package org.inheritance;

public class Dog extends Animal {
    String dogName;
    int dogId;
    String dogColor;
    static Animal a;

     public String makeSound() {
        return "Bark";
    }


    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d.animalColor);
        System.out.println(d.makeSound());
        System.out.println(d.makeSound("very"));
    }
}
