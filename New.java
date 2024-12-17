
import java.time.LocalDate;
import java.time.Period;


public class New {
    String name;
    LocalDate age;

    int birthday() {
        return Period.between(this.age, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        New user1 = new New();
        user1.name = "Harry Potter";
        user1.age = LocalDate.parse("2001-08-15");

        System.out.printf("%s is %s years old.", user1.name, user1.birthday());

        
    }
}

