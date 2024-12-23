
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if (prime(n)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("Number is not prime");
            }
        }
    }

    static boolean prime (int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
