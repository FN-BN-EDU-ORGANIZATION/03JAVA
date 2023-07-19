package Practice_07;




public class C20230719 {
	public static void main(String[] args) {

//		07/19



		

		

//		예제1) JSP끝나서 마무리가 되지않은 게시판 Controller, Service, Dao, Dto 작업하기 전에 MVC 복습(Controller)



//		if(serviceNo==1) {

//		serviceNo가 1이라면

	

//			//1 파라미터 추출(생략)

//			String sid = (String)param.get("sid");

//			String id = (String)param.get("id");

//			sid, id를 각각 sid, id라는 변수에 할당(String값으로)

	

//			//2 입력값 검증(생략)

//			if(sid==null||id==null) {

//				System.out.println("[ERROR]Data Validation Check Error!");

//				return null;

//			}

//			sid 또는 id 중 하나라도 null인경우 오류메세지 보냄

	

//			//3 서비스 실행(서비스모듈작업 이후 처리)

//			boolean result = false;

//			result 초기값을 false로 지정

	

//			try {

//				result = qnaService.memService(sid,id);

//			} catch(Exception e) {

//				e.printStackTrace();

//			}

//			qnaService의 memService에서 Sid, id를 result에 저장

//			예외처리

//			

//			//4 View로 전달

//			System.out.println("Member_Service Block!");

//			Map<String,Object> resultMap = new HashMap<>();			

//			resultMap.put("result", result);

//			return resultMap;

//		}

	

//			result를 resultMap에 저장

	

//		예제2) 로그인 회원만 글작성 수정 삭제 할 수 있는거 작성(간단한거라 좀더 추가필요)

		

//		public class QnAService{

//			private boolean isLoggedIn;

//			private String loggedInuser;

//		}

//		isLoggedIn을 boolean으로 true, false로 상태구분

	

//		public void login{

//			isLoggedIn = true;

//			loggedInuser = username;

//		}

//		true상태라면 로그인하고 username을 loggedInuser에 저장

	

//		

//		public void logout{

//			isLoggedIn = false;

//			loggedInuser = null;

//		}

//		false라면 logout상태로 판단 

	

//		

//		public void Post(String title, String content) {

//			if(isLoggedIn) {

//				System.out.println("글작성");

//				System.out.println("제목 : " + title);

//				System.out.println("내용 : " + content);

//				System.out.println("작성자 : " + loggedInUser);

//	

//			}

//		로그인 상태라면 title, content를 String 형태로 가져올수있음



//			else {

//				System.out.println("로그인 고고")

//			}

//		아니라면 로그인 고고 메세지 보냄

	

//		}
		
		
		
		
		
	}	
		
	
}
