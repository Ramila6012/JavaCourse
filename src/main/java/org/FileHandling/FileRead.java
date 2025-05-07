package org.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
            File f = new File("Myfile.txt");
            Scanner s = new Scanner(f);
            while(s.hasNext()){
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
