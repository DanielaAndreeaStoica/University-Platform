import javax.swing.*;
import java.sql.*;

public class DBConnect {
    static Connection connect = null;
    static Statement statement = null;
    static String host = "jdbc:mysql://localhost:3306/proiect?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String userName = "root";
    static String userPass = "Boxu64481";
    static ResultSet resultSet = null;

    public static void main(String[] args) throws SQLException {
        connect = DriverManager.getConnection(host, userName, userPass);
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from informatii_logare");
        LogIn window = new LogIn(connect,statement);
        window.frameLogIn.setVisible(true);
    }
}



