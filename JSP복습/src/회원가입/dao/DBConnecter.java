package 회원가입.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	public static Connection getconnection() {//connection 객체 반환 메서드, 데이터 베이스 연결
		Connection conn = null;//연결 실패시 null 반환
		try {
		String url="jdbc:mysql://localhost:3306/jspuser";
		String id = "root";
		String pw = "1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//▲ Mysql 드라이버 클래스 호출, 데이터베이스 통신 관리
		
		conn = DriverManager.getConnection(url,id,pw);
		//▲ DriverManager클래스를 사용하여 데이터베이스에 연결 설정,
		//연결 성공시 Connection 반환
		
		//▼ 연결 실패시 예외처리
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}catch (Exception e) {
			e.printStackTrace();}
		return conn;
	}
}
