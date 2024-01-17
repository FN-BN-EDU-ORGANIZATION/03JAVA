package 황다은;

class MyMath2{
	long a, b;
	
	long add() {//인스턴스메서드, 매게변수안씀
		return a+b;	//여기서 a,b는 인스턴스변수
	}
	static long add(long a, long b) {//클래스메서드(static메서드) 매개변수사용
		return a + b;	//지역변수사용! 인스턴스변수사용안함
	}
}

class TestClass2{
	int iv;			// 인스턴스 변수(객체 생성 후 사용가능)
	static int cv;	//클래스 변수(언제나 사용가능)
	
	void instanceMethod() {		//인스턴스 메서드(인스턴스메서드는 객체를 생성후 호출 가능하다)
		System.out.println(iv);	//인스턴스 변수를 사용할수 있다.
								//(인스턴스메서드자체가 객체를 생성후 호출가능하므로 사용할 수 있다.)
		System.out.println(cv);	//클래스 변수 사용가능
	}
	static void staticMethod() {	//static메서드(객체생성없이 항상 호출가능)
		//System.out.println(iv);	//에러! 인스턴스변수를 사용할 수 없다(왜냐면 static메서드는 객체생성없이 호출가능하므로...)
		System.out.println(cv);		//클래스 변수는 사용할 수 있다.
	}
}

//static메서드는 인스턴스메서드를 호출할 수 없다.
class TestClass{
	void instanceMethod() {}		// 인스턴스 메서드
	static void staticMethod() {}	// static메서드

	void instanceMethod2() {	// 인스턴스메서드
		instanceMethod();		// 다른 인스턴스메서드 호출가능
		staticMethod();			// static메서드 호출가능(static이므로 언제든지 호출가능)
	}
	static void staticMethod2() {	//static메서드
		staticMethod();				// static메서드 호출가능
		//instanceMethod();			//에러!! 인스턴스메서드를 호출할 수 없다.
		
		//객체 생성후는 사용가능하네
//		TestClass tc = new TestClass();
//		tc.instanceMethod();
	}
}
public class C20230718 {
	

	public static void main(String[] args) {
		// Static메서드와 인스턴스 메서드 정리
		
		// 인스턴스 메서드
		//	인스턴스 생성후, '참조변수.메서드이름()'으로 호출
		//	인스턴스 멤버(iv,im)와 관련된 작업을 하는 메서드
		//	메서드 내에서 인스턴스 변수(iv)사용가능
		
		// Static 메서드(클래스메서드)
		//	객체생성없이 '클래스이름.메서드이름()'으로 호출
		//	인스턴스 멤버와 관련없는 작업을 하는 메서드
		//	메서드 내에서 인스턴스 변수 사용불가~
		
		//예시
		System.out.println(MyMath2.add(200L, 100L));	//클래스 메서드 호출(객체생성없이가능)
		MyMath2 mm = new MyMath2();	//인스턴스 생성
		mm.a= 300L;
		mm.b= 150L;
		System.out.println(mm.add());	//인스턴스메서드 호출
		
		//static메서드 사용할때는 인스턴스변수 사용안할때 사용하기
		//즉 iv사용여부로 인스턴스메서드와 클래스메서드차이임
		//객체는 iv묶음(인스턴스변수묶음)
		
		//Static을 그러면 언제붙이느냐~?
		//변수일때
		//속성(멤버변수) 중에서 공통속송에 static을 붙인다
		//예시
		/*
		class Card{
			String kind;	//무늬(카드의 무늬는 개별속성이므로 static안씀)
			int number;		//숫자(카드번호도 다 개별이므로...)
			
			static int width = 100;	//폭 (카드의 폭과 넓이는 대체적으로 공통적임)
			static int height = 250;	//높이
		}*/
		
		//메서드일때
		//인스턴스 멤버(iv,im)을 사용하지 않는 메서드(명령문집합)에 static을 붙인다
		

	}

}
