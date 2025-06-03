package org.selfLearn;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public void display(){
        System.out.println("Say Hello to " + name);
    }
}
