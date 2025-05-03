package org.example;

class Human {

    public Human() {
        System.out.println("object created");
    }
    public void show(){
        double f = 2.3;
        System.out.println("I am in a show method" + " " + f);
    }
}

 public class Demo {
     public static void main(String[] args) {
         new Human(); //anonymous object
         new Human().show();
     }
 }

