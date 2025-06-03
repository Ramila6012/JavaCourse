package org.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapExample {
    public static void main(String[] args) {
        Map<Object, Object> m = new TreeMap<>();
        m.put(12, "Shamphoo");
        m.put(14, "Conditioner");
        m.put(89, "BodyWash");
        m.put(89, "BodyWash");
        m.put(89, "BodyWash");

        for (Map.Entry<Object, Object> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
