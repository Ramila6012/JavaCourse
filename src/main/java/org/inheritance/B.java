package org.inheritance;

public class B extends A {

    @Override
    public void display() {
        System.out.println("This is the display method from B class");
    }

    public B(){
        System.out.println("This is a constructor from class B");
    }


    public static void main(String[] args) {
        B b = new B();
        b.display();
        System.out.println(b.demo());
    }
}
