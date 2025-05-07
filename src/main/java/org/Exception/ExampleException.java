package org.Exception;

public class ExampleException {

    public static void main(String[] args) {
        try {
            int array[] = new int[1];
            System.out.println(array[3]);
        }
        catch (Exception e){
            System.out.println("Handled exception");
        }
        System.out.println("This program is over");
    }
}
