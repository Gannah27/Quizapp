import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quizapp";
    private static String DB_USER ;
    private static  String DB_PASSWORD;
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                System.out.println("Connected to the database successfully!");
            } catch (SQLException e) {
                throw new RuntimeException("Failed to connect to the database.", e);
            }
        }
        return connection;
    }

    public static String getDbUser() {
        return DB_USER;
    }
    public static String getDbUrl() {
        return DB_URL;
    }
    public static void setDbUser(String dbUser) {
        DB_USER = dbUser;
    }

    public static String getDbPassword() {
        return DB_PASSWORD;
    }

    public static void setDbPassword(String dbPassword) {
        DB_PASSWORD = dbPassword;
    }

}
