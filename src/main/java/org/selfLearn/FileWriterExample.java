package org.selfLearn;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("TestFile.txt");
            FileWriter obj1 = new FileWriter("TestFileWriter.txt");
            obj.write("Let's test if the data is included in this file");
            obj.close();
            obj1.write("This is another file where we are writing some random thing");
            obj1.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
