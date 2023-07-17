package HomeWork.C20230717;

import java.util.ArrayList;
import java.util.Random;

public class C20230717 {

	public static void main(String[] args) {

		// 자바(Java)의 기본 개념을 정리해보겠습니다:
		// 클래스(Class): 자바에서 모든 객체는 클래스로부터 생성됩니다. 클래스는 객체의 속성과 메서드를 정의하는 템플릿 역할을 합니다. 예를
		// 들어, "사람" 클래스는 이름, 나이 등의 속성과 "걷다", "먹다" 등의 메서드를 가질 수 있습니다.
		// 객체(Object): 클래스로부터 생성된 실체를 객체라고 합니다. 객체는 자신의 속성을 가지고 있으며, 클래스에서 정의된 메서드를 실행할
		// 수 있습니다. 예를 들어, "사람" 클래스의 객체로는 "철수"라는 객체가 있을 수 있으며, "철수" 객체는 이름이나 나이와 같은 속성을
		// 가지고 "걷다"나 "먹다"와 같은 메서드를 실행할 수 있습니다.
		// 메서드(Method): 클래스 내에서 특정 작업을 수행하기 위해 정의된 동작입니다. 메서드는 입력값을 받을 수도 있고, 결과값을 반환할
		// 수도 있습니다. 예를 들어, "자동차" 클래스의 "시동 켜기"라는 메서드는 아무런 입력값을 받지 않고, "차가 켜졌다"라는 결과값을 반환할
		// 수 있습니다.
		// 변수(Variable): 데이터를 저장하기 위해 사용되는 메모리 공간입니다. 변수는 데이터의 종류에 따라 다른 자료형을 갖습니다. 예를
		// 들어, 정수를 저장하기 위해서는 int 자료형 변수를 사용하고, 문자열을 저장하기 위해서는 String 자료형 변수를 사용할 수 있습니다.
		// 제어문(Control Statements): 프로그램의 흐름을 제어하는 데 사용되는 문장들입니다. 자바에서는 조건문(if-else문,
		// switch문)과 반복문(for문, while문)이 주로 사용됩니다. 조건문은 특정 조건에 따라 프로그램의 흐름을 분기하고, 반복문은 특정
		// 조건을 만족할 때까지 코드를 반복 실행합니다.
		// 패키지(Package): 클래스들을 그룹으로 묶기 위해 사용되는 폴더와 비슷한 개념입니다. 패키지는 클래스들의 이름 충돌을 방지하고,
		// 코드의 구조화와 관리를 용이하게 합니다. 패키지는 계층 구조로 구성되어 있으며, "com.example"와 같이 점으로 구분된 이름을
		// 가집니다.
		// 예외(Exception): 프로그램 실행 중에 발생하는 오류 상황을 처리하기 위해 사용됩니다. 예외는 예상치 못한 상황이나 잘못된 사용에
		// 대한 응답으로 발생할 수 있습니다. 자바에서는 예외 처리를 위한 try-catch 문을 사용하여 예외를 잡고 처리할 수 있습니다.
		// 인터페이스(Interface): 클래스가 구현해야 하는 메서드들의 명세를 정의하는 역할을 합니다. 인터페이스는 메서드의 이름, 매개변수,
		// 반환형을 정의하고, 클래스는 이러한 인터페이스를 구현하여 메서드들을 실제로 구현합니다. 인터페이스를 사용함으로써 클래스 간의 결합도를 낮출
		// 수 있고, 다형성을 구현할 수 있습니다.
		// 상속(Inheritance): 자바에서는 클래스들 간에 상속 관계를 맺을 수 있습니다. 상속은 이미 정의된 클래스의 속성과 메서드를 다른
		// 클래스에서 재사용하거나 확장하기 위해 사용됩니다. 부모 클래스(상위 클래스)의 특징을 자식 클래스(하위 클래스)가 상속받아 사용할 수
		// 있습니다.

		// 아직까지 기본적인 용어들이 확실하게 기억이 안나서 정리해봄.
		// 기존 코드들 보면서 복습해야겠다.
		
		//배열 테스트
		
		// 배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.
		int[] data = new int[10];

//				<E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
//				ArrayList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용한다.
//				랩퍼 클래스는 기본 자료형의 첫 문자만 대문자로 적으면 되고 Character와 Integer는 풀네임을 사용한다.
//				ArrayList list = new ArrayList();					// JDK 1.4 이전의 코딩 방법
//				ArrayList<Integer> list = new ArrayList<Integer>();	// JDK 1.5 이후의 코딩 방법
		ArrayList<Integer> list = new ArrayList<>(); // JDK 1.7 이후의 코딩 방법

		for (int i = 0; i < 10; i++) {
			data[i] = i + 1;
			list.add(i + 1);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("data[" + i + "] = " + data[i] + ", list.get(" + i + ") = " + list.get(i));
		}
		for (int i = 10; i < 20; i++) {
//					data[i] = i+1;
			list.add(i + 1);
		}
		for (int i = 10; i < 20; i++) {
//					System.out.println("data[" + i + "] = " + data[i]);
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}
		
		System.out.println("--------------------------------------------------");

		// 로또 추첨기
//		추첨기를 준비한다.
		int[] lotto = new int[45]; 
//		추첨기에 공을 넣는다.
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n=================섞기전===================== ");
		
//		추첨기의 공을 섞는다.
//		lotto[0]에 저장된 값과 lotto[1]~[44] 사이의 랜덤한 위치의 값을 교환한다.
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n=================섞은후===================== ");
		
		System.out.println("1등 번호 :");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
//			sleep() : 괄호 안에 지정된 시간(1/1000초) 만큼 프로그램을 잠깐 멈춘다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("보너스 : " + lotto[6]);
		
	}
}
