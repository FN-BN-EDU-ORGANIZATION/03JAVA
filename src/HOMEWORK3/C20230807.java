package HOMEWORK3;

	//의문점
	//정리
		//어떤 흐름으로 사용자의 요청이 전달되고 수행되고 다시 사용자에게로 가는지 흐름은 파악했다!
		//그런데 이 흐름을 이해하는 것과는 별개로 어떤 코드를 짜야 사용자로부터 다시 사용자에게 가는 것까지 잘 흘러갈 수 있을지는 아직 모르겠다.
		//많은 코드를 보고 또 많이 짜봐야 그나마 이해가 좀 더 갈 것 같다.
		//혼자서 만드는 게시판이나 투두리스트 같은 것을 미니프로젝트로 해보면 어떨까 생각 중이다!
public class C20230807 {
	//예제1 : MVC2패턴 흐름 이해하기

	//Model, View, Controller의 구성요소로 이루어져 있음.
	//모델은 데이터와 비즈니스 로직 관리. DB에서 정보를 가져오거나 저장, 데이터를 가공하고 조작.
	//뷰는 사용자에게 정보를 보여주는 부분. 모델에 저장된 데이터를 표시하고 사용자와 상호작용.
	//컨트롤러는 뷰에서 입력받은 것을 처리하고 분석하여 데이터를 모델에서 가져오거나 변경하고 결과를 뷰에 전달하여 사용자에게 제공.
		//모델 - 뷰의 상호작용 조정, 비즈니스로직의 흐름 제어

	//뷰에서 동작 수행 -> 컨트롤러로 전달.
	//컨트롤러에서 요청 분석 -> 모델 활용(모델에서는 DB와 상호작용).
	//모델에서 데이터 처리 -> 컨트롤러가 처리 결과 받기 -> 뷰로 전달.

	
	//예제2 : Servlet 진행한 프로젝트로 MVC2패턴 흐름 이해하기
	
	//로그인의 경우~
	//jsp파일로 만들어진 loginpage에서 사용자가 아이디와 비밀번호를 입력하고 제출.
	//FrontController가 뷰에서 전달된 내용을 LoginController로 전달.
	//POST방식으로 사용자가 뷰단에서 입력한 아이디와 비밀번호를 받아옴.
	//아이디와 비밀번호가 공백은 아닌지 먼저 유효성 체크.
	//유효성체크를 통과한 다음 service단(모델부분)에서 loginService 실행 후 다시 controller로 전달
	//controller로 전달된 결과를 뷰로 내보냄.


}