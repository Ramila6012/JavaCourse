package org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(4);
        list.add("texas");
        list.add(true);
        list.add('C');
        list.add(12345678);
        list.add(56.90890);
        //System.out.println(list);
        /*for(int i=0;i<=5;i++){
            System.out.println(list.get(i));
        }*/
        /*for(Object a: list){
            System.out.println(a);
        }*/

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            list.remove(4);
        }
    }
}
