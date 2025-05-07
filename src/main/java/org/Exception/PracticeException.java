package org.Exception;

public class PracticeException {


    public void display() throws ArithmeticException{

        int a=10;
        int b= 0;
        if (b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        int result = a/b;
        System.out.println( "Result: " + result) ;

    }

    public static void main(String[] args) throws ArithmeticException {
        PracticeException obj= new PracticeException();
        obj.display();
    }
}
