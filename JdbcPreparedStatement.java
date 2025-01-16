import java.sql.*;
import java.util.Scanner;

public class JdbcPreparedStatement {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = scan.nextLine();
        System.out.println("Enter the roll number of the student: ");
        int roll = scan.nextInt();
        System.out.println("Enter the age of student: ");
        int age = scan.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into student values(?, ?, ?)");
            stmt.setInt(1, roll);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.executeUpdate();
            System.out.println("Data inserted successfully");
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
