package org.selfLearn;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        File f = new File("TestFile.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
