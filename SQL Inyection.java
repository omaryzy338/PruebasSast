import java.sql.*;

public class VulnerableSQL {
    public static void main(String[] args) throws Exception {
        String userInput = "admin' OR '1'='1"; // entrada maliciosa
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();

        // ❌ Vulnerable: concatenación directa de variables en la consulta
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("User: " + rs.getString("username"));
        }
    }
}
