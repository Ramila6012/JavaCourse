package org.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestDeserializationExample {
    public static void main(String[] args) {
        User u= null;
        try{
            FileInputStream f = new FileInputStream("MyFile.txt");
            ObjectInputStream o = new ObjectInputStream(f);
            u = (User)o.readObject();
            System.out.println(u.personId);
            System.out.println(u.personName);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
