package iopackage;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String args) throws IOException {
        FileInputStream filestreamin = new FileInputStream("file.txt");
        System.out.println("File opened successfully");
        filestreamin.close();
    }
}


