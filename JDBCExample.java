import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/java_flexi";
        String username = "root";
        String password = "root";

        // SQL query
        String query = "SELECT * FROM students";

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");

            // 3. Create Statement
            Statement st = con.createStatement();

            // 4. Execute Query
            ResultSet rs = st.executeQuery(query);

            // 5. Process Result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " - " + name);
            }

            // 6. Close resources
            rs.close();
            st.close();
            con.close();
            System.out.println("Connection Closed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}