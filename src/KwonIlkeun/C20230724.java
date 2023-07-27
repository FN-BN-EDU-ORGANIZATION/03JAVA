package KwonIlkeun;

public class C20230724 {

	public static void main(String[] args) {
		
		
		// toString() 메서드 정리
		
		// object는 모든 클래스의 부모 클래스이다. 개발자가 생성한 어떤 클래스도 object클래스를
		// 자동으로 상속하기 때문에 object클래스의 메소드를 사용할 수 있다.
		// 그 중에서 toString()메소드는 객체를 문자열로 리턴하는 메소드이다. 그리고 가장 많이 사용되는 메소드이다.
		
		//객체 출력 시 자바 컴파일러가 자동으로 toString()메소드를 호출한다.
//		System.out.println(객체);
//		System.out.println(객체.toString());	//객체만 출력한 것과 객체에 toString()메소드를 적용한 것의 출력결과가 같다
		//기본적으로 PrintStream클래스의 출력관련 메소드(print,println등)를 통해 객체를 출력하도록 하면 컴파일러가 내부적으로
		//toSring()메소드를 호출한다. 굳이 객체.toString()형태를 가질 필요가 없다.
		//내가 인스턴스 생성 시 설정한 객체의 값을 출력하고 싶다면 toString() 메소드를 재정의하면 된다.
		
		//자바는 객체 출력 시 자동으로 toString메소드를 호출하기 때문에 객체.toString과 같은 형태를 사용하지 않아도 된다.
		
		
		
	}

}
