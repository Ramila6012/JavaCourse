package org.Collections;

import java.util.*;
import java.util.stream.Collectors;


public class StreamAPIClassExample {
    public static void main(String[] args) {
        String s= "Ramila Chaulagain";
        List<String> list = Arrays.asList("Apple", "Banana", "Grapes", "Cherrys", "Papaya", "Avacado", "Apricoot");
        List<String> output = list.stream().filter(i-> i.startsWith("A")).collect(Collectors.toList());
        output.stream().forEach(i -> System.out.println(i));
        System.out.println(countDecide(s));
    }

    public static long countDecide(String fullName){
        return fullName.chars().filter(c-> c == 'a').count();
    }
}
