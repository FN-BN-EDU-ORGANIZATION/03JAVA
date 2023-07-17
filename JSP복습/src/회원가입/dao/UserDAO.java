package 회원가입.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import 회원가입.vo.UserVo;

public class UserDAO {

	Connection conn; // 외부 저장소인 DBMS를 드라이버를 통해 가져온 객체
	PreparedStatement pstm; // 문자열 안에 있는 SQL문을 객체로 저장, 변수가 들어갈 자리에 알맞는 값을 넣어줌, SQL 실행
	ResultSet rs; // SElECT의 결과를 담는 객체

	public void join(UserVo user) { //UserVo 객체를 매개변수로 회원가입 정보를 데이터베이스에 저장 하는 메서드
		String query = "INSERT INTO TBL_USER VALUES(SEQ_USER.NEXTVAL,?,?,?,?,?,?,?,?,?)";
		//tbl_user에 각각의 컬럼에 맞는 값 저장
		try {
			conn = DBConnecter.getconnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, user.getId());
			pstm.setString(2, user.getName());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getGender());
			pstm.setString(5, user.getZipcode());
			pstm.setString(6, user.getAddress());
			pstm.setString(7, user.getAddress_detail());
			pstm.setString(8, user.getAddress_etc());
			
			pstm.executeUpdate(); //데이터 삽입
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //예외처리 이후에 반드시 실행 되어야 하는 코드
			try {
			if(pstm != null) {
				pstm.close(); // PreparedStatement 객체 닫기 
			}
			if(conn != null) {
				conn.close(); //Connection 객체 닫기
			}
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}}