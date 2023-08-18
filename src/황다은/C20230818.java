package 황다은;

class 동물 {
	void 소리내기() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class 개 extends 동물 {
// 오버라이딩: 부모 클래스인 동물의 소리내기 메서드를 개 클래스에서 재정의
	void 소리내기() {
		System.out.println("멍멍!");
	}
}

class 고양이 extends 동물 {
// 오버라이딩: 부모 클래스인 동물의 소리내기 메서드를 고양이 클래스에서 재정의
	void 소리내기() {
		System.out.println("야옹!");
	}
}

public class C20230818 {
	/*
	 * 오버라이딩(Overriding) 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것을 오버라이딩이라고 한다. 상속받은
	 * 메소드를 그대로 사용할 수도 있지만, 자식 클래스에서 상황에 맞게 변경해야하는 경우 오버라이딩할 필요가 생긴다. 오버라이딩의 조건
	 * 오버라이딩은 부모 클래스의 메소드를 재정의하는 것이므로, 자식 클래스에서는 오버라이딩하고자 하는 메소드의 이름, 매개 변수, 리턴 값이
	 * 모두 같아야함
	 */

	/*
	 * 오버라이딩은 상속 관계에 있는 클래스에서 메서드를 재정의하는 것을 보여주고 있고, 오버로딩은 같은 클래스 내에서 인수의 수와 타입이 다른
	 * 메서드를 정의하는 것을 보여주고 있음. 이를 통해 코드를 보다 읽기 쉽고 유지 보수하기 좋게 만들 수 있음.
	 */

}
