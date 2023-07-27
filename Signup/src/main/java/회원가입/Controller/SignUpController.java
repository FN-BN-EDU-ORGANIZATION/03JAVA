package 회원가입.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import 회원가입.Dto.Member;
import 회원가입.dao.UserDAO;
import 회원가입.dao.DBConnecter;

@WebServlet("/register")
public class SignUpController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 클라이언트로부터 전송된 파라미터를 UTF-8로 인코딩해서 받도록 설정
        request.setCharacterEncoding("UTF-8");
        
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        String address = request.getParameter("addr");
        String role = request.getParameter("role");

        // Member 객체를 생성하고 회원 정보를 설정
        Member member = new Member();
        member.setId(userid);
        member.setPassword(password);
        member.setAddress(address);
        member.setRole(role);

        // UserDAO 클래스를 이용하여 회원 정보를 데이터베이스에 저장
        UserDAO dao = new UserDAO();
        boolean success = dao.join(member);

        if (success) {
            // 가입 성공 시 success.jsp로 리다이렉트
            response.sendRedirect("success.jsp");
        } else {
            // 가입 실패 시 error.jsp로 리다이렉트 또는 에러 메시지를 보여줄 수 있음
            response.sendRedirect("error.jsp");
        }
    }
}
