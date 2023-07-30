package Practice_07;



public class C20230727 {
	public static void main(String[] args) {


//		
//		07/27
//
//		@Override
//		public void execute(HttpServletRequest req, HttpServletResponse resp) {
//			System.out.println("MemberAddController execute!");
//		http에서 요청과 응답을 매개변수로 받는다
//		시작하면 메세지를 보낸다
		
//			try {
//	            String id = req.getParameter("id");
//	            String pw = req.getParameter("pw");
//	            String name = req.getParameter("name");
//	            String address = req.getParameter("addr");
//	            String phone = req.getParameter("phone");
//				req에서 id,pw,name,addr,phone 파라미터로 가져온다
				
//	            // pw와 pwCheck가 일치하는지 검사 (클라이언트 측에서도 검사 가능하지만, 서버에서도 추가 검사를 수행하는 것이 좋음)
//	            String pwCheck = req.getParameter("pwc_input");
//				
		
//	            if (!pw.equals(pwCheck)) {
//	                System.out.println("비밀번호 확인이 일치하지 않습니다.");
//	                resp.sendRedirect(req.getContextPath() + "/join.do");
//	                return;
//	            }
//				
//
//	            MemberDto memberDto = new MemberDto();
//	            memberDto.setId(id);
//	            memberDto.setPw(pw);
//	            memberDto.setName(name);
//	            memberDto.setAddr(address);
//	            memberDto.setPhone(phone);
//
//	            MemberDao memberDao = MemberDaoImpl.getInstance();
//	            int result = memberDao.insert(memberDto);
//				memberDao의 인스턴스 생성
//				결과를 인수로 받는다(insert)
		
//	            if (result > 0) {
//	                HttpSession session = req.getSession();
//	                session.setAttribute("selectedMember", memberDto);
//	                System.out.println("삽입 완료 ID: " + id);
//	                resp.sendRedirect(req.getContextPath() + "/index.do");
//	            } else {
//	                System.out.println("회원 삽입 실패.");
//	                resp.sendRedirect(req.getContextPath() + "/join.do");
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//				추가가된다면 memberDto에 id,pw,name,address,phone을 추가
//				그러지않다면 실패라고 출력하고 join.do로 보낸다
		
		
//		try {
//			//2 입력값 검증
//			if (id.isEmpty() || pw.isEmpty()) {
//				System.out.println("[ERROR] Data Validation Check Error!");
//				req.setAttribute("msg", "[ERROR] ID나 PW가 공백입니다.");
//				req.getRequestDispatcher("/WEB-INF/view/loginpage.jsp").forward(req, resp);
//				return ;
//			}
//		id,pw라는 변수를 사용하여 아이디와 비번가져온다 -> 비어있는지 확인
//		만약 둘중 하나라도 비워지면 error메세지 출력
		
//			//3 서비스 실행
//			boolean isLogin=false;
//		
		
//			try {
//				isLogin = service.login(req);
//				HttpSession session = req.getSession();
//				session.getAttribute(id);
//				session.getAttribute(pw);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
//		login을 호출하여 로그인 서비스 실행 아이디 비번 검증하고 인증 여부 확인
//		islogin boolean변수로 선언
//		반환값저장
//		
		
		
		
	}	
		
	
}
