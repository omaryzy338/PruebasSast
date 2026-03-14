import java.sql.*;

public class SecureSQL {
    public static void main(String[] args) throws Exception {
        String userInput = "admin' OR '1'='1"; // entrada maliciosa simulada
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");

        // ✅ Seguro: uso de PreparedStatement con parámetros
        String query = "SELECT * FROM users WHERE username = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, userInput);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.println("User: " + rs.getString("username"));
        }
    }
}
