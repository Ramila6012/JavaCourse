package org.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ReadaFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try{
            writer = new FileWriter("MyFileWriter.txt");
            writer.write("Write method");
        } catch (IOException e) {
           e.printStackTrace();
        }
        finally {
            writer.close();
            System.out.println("File closed successfully");
        }
    }
}
