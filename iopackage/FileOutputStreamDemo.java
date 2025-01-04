package iopackage;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream filestream = new FileOutputStream("file.txt")) {
            String stm = "Hello World!";
            filestream.write(stm.getBytes());
            System.out.println("File written successfully");
        }
        
    }
}
