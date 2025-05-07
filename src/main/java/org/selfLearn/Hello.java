package org.selfLearn;

public class Hello {

    public static void main(String[] args) {
         try {
             int str = 100/0;
             System.out.println(str);
         }
         catch (NullPointerException e){
             System.out.println("Null Pointer");
         }
         catch (ArithmeticException e){
        System.out.println("Math Error");
         }
    }
}
