package org.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Object,Object> m = new HashMap<>();
        m.put(12,"Shamphoo");
        m.put(14,"Conditioner");
        m.put(89, "BodyWash");
        m.put(89, "BodyWash");
        m.put(89, "BodyWash");

        for(Map.Entry<Object,Object> entry : m.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());

        }
    }
}
