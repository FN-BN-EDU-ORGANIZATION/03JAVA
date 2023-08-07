package Practice_07;



public class C20230803 {
	public static void main(String[] args) {


//		
//		08/03	
//		@Override
//		public void execute(HttpServletRequest req, HttpServletResponse resp) {
//			System.out.println("MemberDeleteController execute!");
//		Http서버에서 req, resp 매개변수로 받아서 실행
//			
//			try {
//				String id = req.getParameter("id");
//				파라미터로 아이디 받음			
//				
//				System.out.println("이름 : "+id);			
//				
//				boolean result = service.memberDelete(req);
//				service의 memberdelete에서 req로 받은 결과 result에 저장
//				if(result) {
//					HttpSession session = req.getSession();
//					session.setAttribute("deleteMessage", "아웃!!");
//					System.out.println("아웃");
//					resp.sendRedirect(req.getContextPath()+"/mypage.do");
//					만약 현재 세션이있으면 세션 없애고 아웃을 보냄
					
//					}else {
//					System.out.println("실패다...");
//					resp.sendRedirect(req.getContextPath()+"/mypage.do");
//					아닐경우 실패다... 메세지 보냄				
//		}
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			예외처리
		//		}
//	}
		
		
//		@Override
//		public void execute(HttpServletRequest req, HttpServletResponse resp) {
//			System.out.println("MemberAddController execute!");
//			Http서버에서 req, resp매겨변수로 받아서 실행
//			try {
//	            String id = req.getParameter("id");
//	            String name = req.getParameter("name");
//	            String pw = req.getParameter("pw");
//	            String pwc = req.getParameter("pwc");
//	            String address = req.getParameter("addr");
//	            String phone = req.getParameter("phone");
//	            String role = "ROLE_USER";
//	            String phoneRegex = "^\\d{3}-\\d{3,4}-\\d{4}$";
//	            boolean isPhoneValid = Pattern.matches(phoneRegex, phone);
//	            파라미터로 받고, role은 무조건 ROLE_USER로 저장 phoneRegex은 양식에 맞게 000-000-0000으로 저장
////	            // pw와 pwCheck가 일치하는지 검사 (클라이언트 측에서도 검사 가능하지만, 서버에서도 추가 검사를 수행하는 것이 좋음)
//	            
////	            String pwCheck = req.getParameter("pwc_input");
////	            if (!pw.equals(pwCheck)) {
////	                System.out.println("비밀번호 확인이 일치하지 않습니다.");
////	                resp.sendRedirect(req.getContextPath() + "/join.do");
////	                return;
////	            }
//					만약 비밀번호체크가 맞다면 비밀번호 확인 일치한다고 메세지보냄
////	            if (!isPhoneValid) {
////	                System.out.println("전화번호 형식이 올바르지 않습니다. (000-0000-0000 형식으로 입력하세요.)");
////	                resp.sendRedirect(req.getContextPath() + "/join.do");
////	                return;
////	            }
//					번호양식에 어긋난다면 오류메세지 보냄
//	            boolean pwresult = service.pwCheck(req, resp);
//	            System.out.println("pw"+pw);
//	            System.out.println("pwc"+pwc);
//	            비밀번호체크를 서비스에서 req, resp매개변수로 받아서 결과 pwresult에 저장
//	            boolean phoneresult = service.isPhoneValid(req,resp);
//	            System.out.println("phone : " + phone);
//	            전화번호 양식에맞는지 확인
//	            
//	            
//	            

//		           
//		            boolean result = service.memberJoin(req, resp, memberDto);
//		//            System.out.println("pw"+pw);
//					result에 memberjoin이 req, resp, memberDto 매개변수로 받아서 저장
//		            if (result) {
//		                HttpSession session = req.getSession();
//		                session.setAttribute("selectedMember", memberDto);
//		                System.out.println("삽입 완료 ID: " + id);
//		                resp.sendRedirect(req.getContextPath() + "/index.do");
//		                resp.setContentType("text/plain");
//		                resp.getWriter().write("true");	
//					result가 참이라면 삽입완료 메세지 보냄 응답을 true라고 view페이지로 보냄
//		            } else {
//		                System.out.println("회원 삽입 실패.");
//		                resp.sendRedirect(req.getContextPath() + "/join.do");	
//		                resp.setContentType("text/plain");
//		                resp.getWriter().write("false");
//		            }
//					 아닐경우 false라고 view페이지로 보내서 자바스크립트 실행
//	            
//	           
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//		}
//	}
		
		
	}	
		
	
}
