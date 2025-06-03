package org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Texas");
        list.add("NewYork");
        list.add("California");
        Collections.sort(list);
        System.out.println(list);
    }
}
