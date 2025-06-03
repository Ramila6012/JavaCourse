package org.JavaMorningClass;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, List<String> > room  = new HashMap<>();

        List<String> puna = new ArrayList<>();
        puna.add("Mobile");
        puna.add("Charger");
        puna.add("Bath Tub");

        List<String> prasanna = new ArrayList<>();
        prasanna.add("prasannna");
        prasanna.add("alex");


        room.put(305, puna);

        room.put(490, prasanna);

        //room.clear();

        System.out.println(room);



    }
}
