package myjava04_MVC;

import java.util.Scanner;

//입력 및 출력만 함
public class View {
	
	//입력받고, 결과를 보여주는 부분
	//Scanner를 직접 컨트롤은 못 함.
	//View를 생성해야지만 in을 쓸 수 있다.
	private Scanner in = null;
	
	//화면을 만들어야지만 입력이 가능해짐
	public View() {
		in = new Scanner(System.in);
	}
	
	//정수 입력받는 기능 //메서드 만들고// 호출은 컨트롤러에서
	public int numInput() {
		System.out.println("숫자 입력해");//출력
		return Integer.parseInt(in.nextLine());
	}
	//부호 입력받는 부분
	public char charInput() {
		System.out.println("부호 입력해");
		//입력한 문자열의 가장 첫번째 글자
		//"Hello" -> 'H'를 의미
		//charAt(1) -> 'e'를 의미
		return in.nextLine().charAt(0);
	}
	//연산은 Model에서 수행
	//Controller에서 Model을 호출할 것
	//절대 View가 Model을 직접 건드리지 않음
	void showResult(int value) {
		System.out.println("--결과--");
		System.out.println("값 : " + value);
	}

}
