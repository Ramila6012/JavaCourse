package org.example;

public class Student {

    String studentName = "Niru";
    int studentId = 1001;
    int studentClass = 10;
    String studentAddress = "Bangalore";
    Address address = null;
    Department d = null;


    public Student() {
        System.out.println("I am constructor");
    }

    public Student(int sId, String sName, String sAddress, int sClss) {
      studentId = sId;
        studentAddress = sAddress;
        studentClass = sClss;
        studentName = sName;
    }

    public void Study() {
        System.out.println("All Subjects");
    }

    public Student(int sId, String studentName) {
        this.studentId = sId;
        this.studentName = studentName;
    }

    public void display() {
        System.out.println("I am from Bangalore");

    }

    public String display(String message) {
        return "Hi " + message;

    }

    public static void main(String[] args) {
        Student S = new Student();
        S.address = new Address(12, "Texas", 75075);
        S.d = new Department ("Biology", 1001, "California");
        Student S1 = new Student(1, "Ram", "Bangalore", 10);
        Student S2 = new Student(4, "Sam", "Bangalore", 9);
        Student S3 = new Student(6, "Gopal");
        System.out.println(S1.studentName);
        System.out.println(S1.studentId);
        System.out.println(S1.studentClass);
        System.out.println(S1.studentAddress);
        System.out.println(S2.studentName);
        System.out.println(S2.studentId);
        System.out.println(S2.studentClass);
        System.out.println(S2.studentAddress);
        S.display();
        System.out.println(S.display("Java"));
        System.out.println(S.address.addressId);
        System.out.println(S.address.cityName);
        System.out.println(S.address.zipCode);

    }
}

