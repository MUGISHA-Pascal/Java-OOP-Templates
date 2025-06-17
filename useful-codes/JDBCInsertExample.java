import java.sql.*;

public class JDBCInsertExample {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        String sql = "INSERT INTO users (id, name) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 2);
        ps.setString(2, "Bob");
        ps.executeUpdate();
        conn.close();
    }
}