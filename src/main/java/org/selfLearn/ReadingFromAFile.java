package org.selfLearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) {
        File f = new File("TestFile.txt");
        File f1 = new File("TestFileWriter.txt");
        try {
            Scanner s = new Scanner(f);
            Scanner s1= new Scanner(f1);
            while(s.hasNext()){
                String data = s.nextLine();
                System.out.println(data);
            }
            System.out.println("-----------------------------------------");
            while(s1.hasNextLine()){
               String data1 = s1.nextLine();
                System.out.println(data1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
