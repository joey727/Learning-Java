package iopackage;
import java.io.*;
import java.util.Scanner;

class Book implements Serializable {
    String title;
    int bookNum;
    double price;

    Book(String title, int bookNum, double price) {
        this.title = title;
        this.bookNum = bookNum;
        this.price = price;
    }

    @SuppressWarnings("unused")
    Book() {} // default constructor

    @Override
    public String toString() {
        return "Book [title=" + title + ", bookNum=" + bookNum + ", price=" + price + "]";
    }
}

public class SerializationDemo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Accepting user inputs
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book number: ");
        int bookNum = scanner.nextInt();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("book.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            Book book = new Book(title, bookNum, price);
            out.writeObject(book);
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("book.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Book book1 = (Book) in.readObject();
            System.out.println("Deserialized Book: " + book1);
        }

        scanner.close();
    }
}

