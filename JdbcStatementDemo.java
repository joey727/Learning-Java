import java.sql.*;

public class JdbcStatementDemo {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            System.out.println("Connection established successfully");
            
            Statement stmt = con.createStatement();

            stmt.execute("create table student(id int, name varchar(20), age int(2))");
            System.out.println("Table created successfully");
            
            stmt.executeUpdate("insert into student values(101, 'John', 14)");
            stmt.executeUpdate("insert into student values(104, 'Grace', 20)");
            stmt.executeUpdate("insert into student values(107, 'Joey', 24)");
            stmt.executeUpdate("insert into student values(109, 'Ann', 19)");
            System.out.println("Data inserted successfully");
            

            int n = stmt.executeUpdate("update student set age=21");
            System.out.println(n + " row(s) updated successfully");

            stmt.executeUpdate("delete from student where age=21");
            System.out.println("Data deleted successfully");

            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
