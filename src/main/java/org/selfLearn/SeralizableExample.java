package org.selfLearn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeralizableExample {


    public static void main(String[] args) {
        User user = new User();
        user.name = "Bro";
        user.password = "I <3 You";

        try{
            FileOutputStream file = new FileOutputStream("SavedInfo.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Object Saved succesfully");

    }

}
