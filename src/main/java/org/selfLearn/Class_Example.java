package org.selfLearn;

public class Class_Example {

    public int add(int n1, int n2){
        return n1+ n2;
    }
}

class Demo {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Class_Example cal = new Class_Example();
        System.out.println(cal.add(num1, num2));
    }
}
