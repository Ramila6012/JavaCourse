package org.Collections;


import java.sql.SQLOutput;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Object> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Address");
        linkedSet.add("Emplyoee");
        linkedSet.add(5);
        linkedSet.add('C');
        linkedSet.add(123.98);
        linkedSet.add(45.90);
        linkedSet.add(45.90);

        System.out.println(linkedSet);

    }
}
