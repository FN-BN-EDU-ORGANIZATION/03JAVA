package 황다은;

public class C20230721 {
	//오버로딩 (사전적의미 : 과적하다, 많이 싣는 것)
	//: 한 클래스내에 같은 이름의 메서드를 여러 개 정의하는 것
	
	//대표적인 예시로는 println메서드이다.
	//void println()
	//void prinltln(boolean x)
	//void prinltln(char x)
	//void prinltln(int x)...등등등
	//이와 같이 매개변수에 따라 println의 메서드호출이 달라진다.
	
	//오버로딩이 성립하기 위한 조건 3가지
	//1. 메서드 이름이 같아야 한다.
	//2. 매개변수의 개수 또는 타입이 달라야 한다.
	//3. 반환 타입은 영향없다.
	
	//예시
	//오버로딩이 맞는 것은?
	//<보기1>
//	int add(int a, int b) {return a+b;}
//	int add(int x, int y) {return x+y;}
	//<보기2>
	//int add(int a, int b) {return a+b;}
	//long add(int a, int b) {return (long)(a+b);}
	//<보기3>
	//long add(int a, long b) {return a+b;}
	//long add(long a, int b) {return a+b;}
	//답은 보기3! 보기1은 매개변수의 타입이 같으므로 오버로딩이 아니라 메소드 중복정의
	// 보기2는 반환타입과 매개변수의 타입이 같으르모 오버로딩 아님
	
	//오버로딩의 올바른 예 - 매개변수는 다르지만 같은의믜의 기능 수행
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("long add(long a, long b) -");
		return a+b;
	}
	int add(int[] a) {
		System.out.println("int add(int[] a) -");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
	
	//오버로딩의 장점
	//하나의 메서드이름으로 여러개의 메서드를 정의할 수 있으므로 메서드의 이름을 절약할 수 있다.
	
}
