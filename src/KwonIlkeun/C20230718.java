package KwonIlkeun;

public class C20230718 {
//try catch에 대한 내용
	public static void main(String[] args) {
		//두 개의 수를 나누는 sw가 있다.
				//분모가 0이면 오류가 난다.
				//이 것에 대한 예외처리를 어떻게 할것인가?
				int a = 10;
				int b = 0;
//				int c = a/b;
//				System.out.println(c);
				
				//예외처리1. if문
				if(b==0)
					System.out.println("분모가 0입니다.");
				else
					System.out.println(a/b);
				//if문 예외 처리: 프로그래머가 어디에서 예외가 발생할 지 
				//콕 찝어서 알고 있어야지만 대비할 수 있다.
				
				//예외처리2. try catch
				//try : 시도하다
				//catch : 잡다
				//try구문안에 있는 코드를 시도하고, 잘 되면 그냥 넘어가고
				//오류가 날 것 같으면 catch부분으로 빠진다음, 그 다음 코드를 계속 실행
				
				int num1 = 10;
				int num2 = 0;
				//int num3 =  num1/num2;//프로그램이 강제 종료한다(=프로그램이 죽는다)
				System.out.println("프로그램 종료합니다.");
				
				try {
				int num11 = 10;
				int num22 = 0;
				int num33=num1/num2;//프로그램이 강제 종료한다(=프로그램이 죽는다)
				System.out.println("num33="+num33);
				}catch(Exception e) {
					System.out.println("캐치");
					e.printStackTrace();
					return; //프로그램이 여기서 끝나버림
				}
				System.out.println("프로그램 종료합니다.");
			}

		}