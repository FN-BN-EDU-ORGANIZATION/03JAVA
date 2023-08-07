package Practice_07;



public class C20230801 {
	public static void main(String[] args) {


//		
//		08/01	
//		회원 가입 분명 계속 건들지만 잘안된다. 계속 false로 반환 이유불문... 말안듣는 프로그램
		
		//회원 가입하기
//				@Override
//				public boolean memberJoin(HttpServletRequest req, HttpServletResponse resp, MemberDto dto) throws Exception{
//		        Http에서 req, resp 을 매개변수로 받는다 memberjoin이라는 메서드로    
//					boolean pw = pwCheck(req,resp);
//					pwChck에서 req, resp 받을때 결과를 pw에 저장
//					System.out.println("폰 : " );
//					체크하기 위해 만듬
//				    boolean phone = isPhoneValid(req,resp);
//					전화번호 000-000-0000 양식에 맞는지 확인결과 phone에 저장
//					System.out.println("전화");
//				    if (pw && phone) {
//				        int result = dao.insert(dto);
//				        System.out.println("왜 될까?");
//				        return result>0;
//				    }
//					pw와 phone 이 true라면 dao의 insert를 dto에 입력
//					참이경우 true 반환
//				    System.out.println("안된다");
//				    return false;
//				}
//					아닐경우 false로 반환

		
		
		//회원 조회하기(전체조회) - 사서
//				@Override
//				public List<MemberDto> memberSearch(String sid) throws Exception{
//				memberSearch메서드에 sid를 받음
//					String role = this.getRole(sid);
//					Role이 관리자인지 멤버인지 확인
//					if(role.equals("ROLE_MANAGER")) 
//						return dao.select();			
//					return null;
//				}
//				ROLE이 매니저일경우 dao 검색 그게 아닐경우 null로 반환
	}	
		
	
}
