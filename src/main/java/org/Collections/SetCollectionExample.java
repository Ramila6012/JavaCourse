package org.Collections;

import org.FileHandling.Person;
import org.example.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetCollectionExample {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        /*set.add(4);
        set.add("texas");
        set.add(true);
        set.add('C');
        set.add(12345678);
        set.add(56.90890);
        set.add(true);
        set.add(true);
        set.add(true);
        set.add(12345678);*/

        /*Employee e = new Employee();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        set.add(e);
        set.add(e1);
        set.add(e2);
        set.add(e3);*/

        Person p = new Person("Max", 2);
        Person p1 = new Person("Maxime", 3);
        Person p2 = new Person("Nestor", 7);
        Person p3 = new Person("Viktoria", 90);
        Person p4 = new Person("Nestor", 7);

        set.add(p);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);


        System.out.println(set);
    }
}
