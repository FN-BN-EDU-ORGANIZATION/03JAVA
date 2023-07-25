package Practice_07;


public class C20230725 {
	public static void main(String[] args) {


//		
//		07/25
//
//		@Override
//		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			클라이언트 요청처리 
		
//	        req.setCharacterEncoding("UTF-8");
//	        resp.setCharacterEncoding("UTF-8");
//	        resp.setContentType("text/html; charset=UTF-8");
//	     	요청, 응답을 UTF-8로 설정
//			req.getRequestURI는 URI를 요청
		
		
//			System.out.println("FrontController's service Uri : " + req.getRequestURI());// 
//			
//			SubController controller = map.get(req.getRequestURI());
//			맵을 사용하여 요청
//			
//			controller.execute(req, resp);
//			controller 전달하여 실행
//			
//		}
//		
//		@Override
//		public void execute(HttpServletRequest req, HttpServletResponse resp) {
//		HttpServletRequest, HttpServletResponse를 매개변수 설정	
		
//			try { (예외처리)
//				HttpSession session = req.getSession();
//				String role = (String)session.getAttribute("ROLE");
//			HttpSession에서 Role을 가져옴
		
//				if(role.equals("ROLE_USER")){
//					req.getRequestDispatcher("/WEB-INF/view/member/user.jsp").forward(req, resp);
//				}else if(role.equals("ROLE_MEMBER")) {
//					req.getRequestDispatcher("/WEB-INF/view/member/member.jsp").forward(req, resp);
//			회원에게만 role을 부여하여 페이지 보여줌
		
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		
//			포워딩이라고하는데 잘몰라서 찾아봄 : 서버에서 다른 리소스(페이지)로 클라이언트의 요청을 전달하는기술
//			서버 내부에서 이루어지며 클라이언트에게는 보이지 않음, 역할에 따라 다른페이지 보여줌
		
		
		
		
	}	
		
	
}
