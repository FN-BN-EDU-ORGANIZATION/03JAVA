package Practice_07;



public class C20230726 {
	public static void main(String[] args) {


//		
//		07/26
//
//		@Override
//		public void execute(HttpServletRequest req, HttpServletResponse resp) {
//			System.out.println("MemberDeleteController execute!");
//		http에서 요청 응답이라는 두개의 매개변수를 받는다
		
//			try {
//		예외부분스타트
//				String Id = req.getParameter("id");
//		http에서 요청으로부터 id를 받는다
//				MemberDao memberDao = MemberDaoImpl.getInstance();
//		MemberDao의 인스턴스를 생성한다. 
//				int result = memberDao.delete(Id);
//				memberDao에서 id삭제한다 result 인수로 반환
//				if(result>0) {
//		result가 >0보다 크다는 것은 행에서 삭제가 되었다는것을 의미하기때문에 성공
//					HttpSession session = req.getSession();
//					session.setAttribute("deleteMessage", "아웃!!");
//					System.out.println("아웃");
//					resp.sendRedirect(req.getContextPath()+"/mypage.do");
//				}else {
//					System.out.println("실패다...");
//					resp.sendRedirect(req.getContextPath()+"/mypage.do");
//				}
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		삭제에 성공하면 아웃메세지, 실패하면 실패다... 메세지를 출력한다
		
//		인스턴스란 객체 지향 프로그래밍에서 클래스를 기반으로 생성된 구체적인 개별 객체를 의미한다
//		자동차설계가 클래스라면 인스턴스는 만들어진 자동차를 뜻한다. 설계만 있으면 형태가 없기떄문에
//		인스턴스필요하다
		
		
	}	
		
	
}
