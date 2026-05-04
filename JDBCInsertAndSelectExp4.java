import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Inser code
public class InsertDataExp4 {

    static final String DB_URL = "jdbc:mysql://localhost/database"; //db name 
    static final String USER = "user";
    static final String PASS = "password";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            System.out.println("Inserting records into the table...");

            String sql = "INSERT INTO Registration VALUES (100, 'Sachin', 'Tendulkar', 18)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO Registration VALUES (101, 'Virat', 'Kohli', 25)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO Registration VALUES (102, 'Mahendra Singh', 'Dhoni', 30)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO Registration VALUES (103, 'Rohit', 'Sharma', 28)";
            stmt.executeUpdate(sql);

            System.out.println("Inserted records successfully...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//Select code
class SelectDataExp4 {

    static final String DB_URL = "jdbc:mysql://localhost/dbname";
    static final String USER = "user";
    static final String PASS = "password";

    static final String QUERY = "SELECT id, first, last, age FROM Registration";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {

            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
