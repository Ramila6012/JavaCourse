package org.inheritance;

public abstract class A {
    int i = 10;

    public abstract void display();

    public String demo(){

        return "This is a demo method";
    }

    public A(){
        System.out.println(" I am from class A constructor");
    }
}
