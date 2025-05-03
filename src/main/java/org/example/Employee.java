package org.example;

public class Employee {

    String name = "Roshani";
    int empId = 560078;
    String Address = "Plano";
    String Department = "Operations";
    Department d = null;

    public Employee() {
        System.out.println("I am a constructor");
    }

    public void display() {
        System.out.println(" I am from a display method");
    }

    public String display(String message) {
        return "Hi " + message;
    }

    public Employee(int eID, String sName, String sAddress, String sDept) {
        this.name = sName;
        this.empId = eID;
        this.Address = sAddress;
        this.Department = sDept;
    }

    public Employee(int eEID, String sName) {
        this.empId = eEID;
        this.name = sName;
    }


    public void annualSalary() {
        System.out.println("Annual Salary");
    }

    public String annualSalary(int n)
    {
        return "My total salary is " + n;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.d = new Department ("Biology", 1001, "California");
        Employee e1 = new Employee(9876, "Ramila", "New York", "Finance");
        Employee e2 = new Employee(5555, "Shisir", "Richardson", "IT");
        Employee e3 = new Employee(9999, "Niranjan");
        System.out.println(e1.name);
        System.out.println(e1.empId);
        System.out.println(e1.Address);
        System.out.println(e1.Department);

        System.out.println(e2.name);
        System.out.println(e2.empId);
        System.out.println(e2.Address);
        System.out.println(e2.Department);

        System.out.println(e3.name);
        System.out.println(e3.empId);
         e1.annualSalary();
         System.out.println(e1. annualSalary(1000));
        System.out.println(e.d.deptName);
        System.out.println(e.d.deptAddress);
        System.out.println(e.d.deptID);

    }
}
