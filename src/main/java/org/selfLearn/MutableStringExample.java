package org.selfLearn;

public class MutableStringExample {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Navin");
        System.out.println(str);
        str.append("Reddy");
        System.out.println(str);
        String str1 = new String("Ramila");
        System.out.println(str1);
         str1= str1 + "Chaulagain";
        System.out.println(str1);


    }
}
