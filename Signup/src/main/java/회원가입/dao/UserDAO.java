package 회원가입.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import 회원가입.Dto.Member;

public class UserDAO {

    public boolean join(Member member) {
        String query = "INSERT INTO tbl_profile VALUES(?,?,?,?)";
        try (Connection conn = DBConnecter.getConnection();
             PreparedStatement pstm = conn.prepareStatement(query)) {
            pstm.setString(1, member.getUserId());
            pstm.setString(2, member.getPassword());
            pstm.setString(3, member.getAddress());
            pstm.setString(4, member.getRole());

            int rowsAffected = pstm.executeUpdate(); // 데이터 삽입
            return rowsAffected > 0; // 가입 성공 여부를 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
