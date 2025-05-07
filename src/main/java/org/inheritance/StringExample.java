package org.inheritance;

public class StringExample {


    public static void main(String[] args) {
        String str ="ABC";
        String str1 = new String("ABC");
        StringBuilder s = new StringBuilder();
        s.append("Passing 1st value"). append(" and Passing 2nd value");
        System.out.println(s);
        if(str.equals(str1)){
            System.out.println("Both are equal");
        }
    }
}
