package 이헌지;

//2.4 화면에서 입력받기 - Scanner
//지금까지는화면에 출력만 해왔는데,이제 화면으로부터 입력받는 방법에 대해서 배워보자.
//자바에서 화면으로 부터 입력받는 방법은 여러 가지가 있으며,점점 간단하고 편리한 방향으로 발전해 왔다.
//최신 방법은 JDK1.6부터 추가된 Console클래스를 이용하는 것인데,이 클래스는 이클립스와 같은 IDE에서 잘 동작하지 않으므로,
//이와 유사한 Scanner클래스를 이용해서 화면으로부터 입력받는 방법을 배워보자.

//|참고| 화면으로 부터 입력받는 방법드은 근본적으로 모두 같으므로 차이를 비교할 필요는 없다. 
//그저 상황에 맞는 편리한 것을 선택해서 사용하면 된다.

//화면에으로 부터 입력받는 방법은 아직 배우지 않은 것들을 알아야 하는데도 불구하고 본인이 직접 입력을 하면 자칫 지루해 질 수 있는
//내용들이 좀 더 재미있어지지 않을까하는 생각에서 미리 소개 하게 되었다.나중에 자세히 배울 테니 지금은 이해하기보다는
//가져다 사용하는 정도로만 활용해 주었으면 한다. 먼저 Scanner클래스를 사용하려면,아래의 한 문장을 추가해줘야 한다.

//import java.util,*;  // Scanner클래스를 사용하기 위해 추가

//그 다음엔 Scanner클래스의 객체를 생성한다.

//Scanner scanner = new Scanner(System.in);  // Scanner클래스의 객체를 생성

//그리고 nextLine()이라는 메서드를 호출하면,입력대기 상태에 있다가 입력을 마치고'엔터키(Enter)'를 누르면 입력한 내용이
//문자열로 반환된다.
/*
 String input = scanner.nextLine();  // 입력받은 내용을 input에 저장
 int num = Integer.parseInt(input);  // 입력받은 내용을 int타입의 값으로 변환
*/
//만일 입력받은 문자열을 숫자로 변환하려면, Integer.parseInt()라는 메서드를 이용해야 한다.
//이 메서드는 문자열을 int타입의 정수로 변환한다.

//|참고| 만일 문자열을 float타입의 값으로 변환하길 원하면,Float.parseFloat()를 사용해야한다. 
//다른 타입으로 의 변환은 p.493을 참고하자.

//사실 Scanner클래스에는 nextInt()나 nextInt()와 같이 변환없이 숫자로 바로 입력받을 수 있는 메서드들이 있고,
//이 메서드들을 사용하면 문자열을 숫자로 변환하는 수고는 하지 않아도 된다.

//int num + scanner.nextInt(); // 정수를 입력받아서 변수 num에 저장

//그러나 이 메서들은 화면에서 연속적으로 값을 입력받아서 사용하기에 까다롭다.
//차라리 모든 값을 nextLine()으로 입력받아서 적절히 변환하는 것이 더 낫다.
/*
public class Ch03형식화된출력{
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);   //입력받은 문자열을 숫자로 변환 
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
	}
}
     출력값 : 두자리 정수를 하나 입력해주세요.>22
            입력내용 :22
            num=22
*/
//만일 숫자가 아닌 문자 또는 기호를 입력하면, 입력받은 문자열을 숫자로 변환하는 과정인 Integer.parseInt()에서 에러가 발생한다.
//특히 공백을 입력하지 않도록 주의하자.