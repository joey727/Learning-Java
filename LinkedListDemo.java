import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        try (Scanner scan = new Scanner(System.in)) {
            String input;
            
            while (true) {
                System.out.println("Enter a number (or type 'exit' to quit): ");
                input = scan.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    int number = Integer.parseInt(input);
                    lst.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
            
            System.out.println("Final list: " + lst);
        }
    }
}
