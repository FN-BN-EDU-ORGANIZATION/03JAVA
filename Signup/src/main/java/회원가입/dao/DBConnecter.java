package 회원가입.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
    private static Connection conn; // 싱글톤으로 사용할 Connection 객체

    // private 생성자로 외부에서 인스턴스화 방지
    private DBConnecter() {
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/weather";
                String id = "root";
                String pw = "1234";
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, id, pw);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
