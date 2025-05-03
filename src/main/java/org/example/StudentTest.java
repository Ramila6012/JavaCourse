package org.example;

public class StudentTest {
    int rollNo = 01;
    String name = "Karrisa";
    String address = "Mickenny";
    String course = "BCA";

    public void display(){
        System.out.println( "This is the example of method");
    }

    public static void main(String[] args) {
        int Grade = 100;
        StudentTest s = new StudentTest();
        System. out.println(s.rollNo);
        System. out.println(s. address);
        System.out.println(Grade);
        s.display();
    }

}
