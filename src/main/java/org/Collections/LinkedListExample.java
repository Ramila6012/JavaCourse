package org.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add("Reshma");
        list.add('C');
        list.add(true);
        list.add(12345678);
        list.add(56.90890);
        list.add('C');
        list.add(12345678);
        list.add(12345678);
        list.add("Reshma");
        list.add(56.90890);
        System.out.println(list);


        /*Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());*/
    //}
    }
}
