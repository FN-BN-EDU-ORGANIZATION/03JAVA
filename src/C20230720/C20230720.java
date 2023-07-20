package mystudy02_exception;

public class myjava02_HandlingException {

	public static void main(String[] args) {
		//두 개의 수를 나누는 sw가 있다
		//분모가 0이면 오류가 난다
		//이 것에 대한 예외처리를 어떻게 할것인가
		//무한대를 표현할수없음 그래서 에러발생 
		//예외처리하는 방법 try catch사용
		int a =10;
		int b=0;
//		int c=1/b; //Java에서는 0으로 나누는 연산은 수학적으로 정의되지 않으므로 예외가 발생//
//		System.out.println(c);
		
		
		
		//가장쉬운 예외처리 예시 1 //단점//프로그래머가 어디에서 예외가 발생할지 콕찝어서 알고 있어야지만 대비할수있다
		//
		if(b==0)
			System.out.println("분모가 0입니다");
		else
			System.out.println(a/b);
		
		
		
		
		//예외 처리 2 . try catch   // 시도하다 //잡다
		//try 구문안에 있는 코드를 시도하고 , 잘되면 그냥 넘어가고
		//오류가 날 것 같으면 catch 부분으로 빠진 다음 , 그다음 코드를 실행한다
		int num1= 10;
		int num2= 0;
//		int num3= num1/num2; //프로그램이 강제종료한다(== 프로그램이 디진다)
//		System.out.println("종료합니다");
		
		
		
		
		
		//try 컨트롤 스페이스 ㄱ  //try  안에 처넣기 //살려는 드릴게 // 
		//자주쓰니까 알아둘것.
		try {
			int num11= 10;
			int num22= 0;
			int num33= num11/num22; //프로그램이 강제종료한다(== 프로그램이 디진다)
			System.out.println("num33="+num33);  //마찬가지로 디져야하지만? try 안에
			
		} catch (Exception e) {
			System.out.println("에러캐치");
			e.printStackTrace(); //에러정보를 띄워주는 명령어 어디서 에러가 발생하는지 ? 44번  
//			return;  // 프로그램이 여기서 끝나버린다 //여기서 종료하고싶을때 조기종료 강제종료가능 //주석
		}
		System.out.println("종료합니다");  //return 떄문에 살행 x
		
		
		
		//try catch //finally//finally 이부분은 꼭실행한다
	}

}
