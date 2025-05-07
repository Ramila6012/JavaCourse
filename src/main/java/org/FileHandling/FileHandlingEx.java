package org.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingEx {
    public static void main(String[] args) {

            File f= new File("Myfile.txt");
        try {
            if (f.createNewFile()){
                System.out.println("File Myfile.txt is created" + f.getName());
            }
        } catch (IOException e) {
            System.out.println("This is a catch block");
        }

    }
}
