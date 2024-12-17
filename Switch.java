import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a Character: ");
            char ch = s.next().toLowerCase().charAt(0);

            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Given character is a vowel");
                default -> System.out.println("Character entered is a consonant");
            } 
        }
    } 
}

