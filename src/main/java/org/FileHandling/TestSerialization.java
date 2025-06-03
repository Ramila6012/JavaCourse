package org.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

    public static void main(String[] args) {
        User us = new User(12, "Chad");
        String filename= "MyFile.txt";
        try{
            FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(us);
            o.close();
            f.close();
            System.out.println("Seralization is successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
