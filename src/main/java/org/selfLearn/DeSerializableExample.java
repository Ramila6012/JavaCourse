package org.selfLearn;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableExample {
    public static void main(String[] args) {
        User user = null;
        try{
            FileInputStream file = new FileInputStream("SavedInfo.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            user = (User) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user.name);
        System.out.println(user.password);
        System.out.println("This is your saved information details");
    }
}
