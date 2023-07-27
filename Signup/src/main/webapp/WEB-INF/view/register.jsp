<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
    <h2>회원가입</h2>
  <form action="${pageContext.request.contextPath}/register.do" method="post">

        <p>
            <label>아이디 : <input type="text" name="userid"></label>
        </p>
        <p id="result"></p>
        <p><label>비밀번호 : <input type="password" name="password"></label></p>
        <p><label>비밀번호 확인 : <input type="password" name="password_re"></label></p>
        <p><label>지역 : <input type="text" name="addr"></label></p>
        <p><label>Role : <input type="text" name="role"></label></p>
        <button>회원가입 완료</button>
    </form>
</body>
</html>
