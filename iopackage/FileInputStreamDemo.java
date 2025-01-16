package iopackage;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String args) throws IOException {
        try (FileInputStream filestreamin = new FileInputStream("file.txt")) {
            System.out.println("File opened successfully");
            // Read from the file (for example, read the first byte)
            int data = filestreamin.read();
            System.out.println("First byte of the file: " + data);
        }
    }
}


