package org.FileHandling;

import java.io.Serializable;

public class User implements Serializable {
    public int personId;
    public String personName;

   public User(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }



}
