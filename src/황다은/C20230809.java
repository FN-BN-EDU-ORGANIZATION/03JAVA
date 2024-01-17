package 황다은;

//재귀호출
//메서드 내부에서 메서드 자신을 다시 호출하는 것을 ‘재귀호출(recursive call)’이라 하고, 재귀호출을 하는 메서드를 ‘재귀 메서드’라고 한다.

//재귀 함수를 왜 사용하는가?

//재귀호출은 복잡하게 작성된 코드를 반복문과 조건문보다 단순한 구조로 바뀔 수 있기 때문!

//예를 들어, 이미 작업과정에서 반복문을 많이 사용하고 있거나, 동적으로 구성하기 때문에 얼마나 반복해야 할지 모르거나, 
//반복문보다 재귀함수가 가독성이 더 좋다고 생각된다면 재귀 함수를 사용한다.

public class C20230809 {
	public static void main(String[] args) {
//		method(5);
//		int result = factorial(4);
//		System.out.println(result);
	}
	

//	static void method(int n) {
//		if (n == 0)
//			return; // n의 값이 0일때, 메서드 종류
//		System.out.println(n);
//		method(--n); // 재귀호출. method(int n)을 호
//	}
	
	void method(int n) {
		while(n!=0) {
			System.out.println(n--);
		} // 위 method와 동일하다.
	}
	
	static int factorial(int n) {
		int result=0;
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1); // 다시 메서드 자신 호출
		return result;
	}
	
	
}
