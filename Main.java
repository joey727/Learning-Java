import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner nums = new Scanner(System.in)) {
            System.out.println("Enter and number: ");
            int x = nums.nextInt();

            System.out.println("Enter another number: ");

            int y = nums.nextInt(); 


            int sum = x + y;
            System.out.println("The sum of both numbers is: " + sum);
        }  catch (InputMismatchException e) {
            System.out.println("Make sure you entered a number");
        } finally {
            System.out.println("Good Work Done!");
        }
    }
}

