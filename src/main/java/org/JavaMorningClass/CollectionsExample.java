package org.JavaMorningClass;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("NewYork");
        list.add("Texas");
        list.add("California");
        list.add("Hawaiii");

        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
    });

        for(String s: list){
            System.out.println(s);
        }
    }
}
