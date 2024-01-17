package 황다은;

public class C20230719 {
	// 메모리구조
	//stack영역에 초기화진행되지 않는 예시
	public void method() {
		int localVar=0;	// 스택영역에서 저장된 지역변수, 초기화 되지 않음
		System.out.println(localVar);//초기화 되지않은 변수이므로 에러!!
	}
	
	//힙영역 예시
	public static void main(String[] args) {
		int [] a= null; // int형 배열은 stack영역 공간에 할다 됨
		System.out.println(a);// null
		
		a= new int [10]; //힙영역에 10개의 연속된 공간이 할당되고
						 //변수 a에 참조값을 할당하고 리턴받는다
		System.out.println(a);//참조값이 16진수로 나온다.
							// stack영역공간에서 실제데이터가 저장된 heap영역의 참조값을
							// new연산자를 통해 리턴
		
		
		String add1 = new String("Hwang");
		String add2 = new String("Hwang");
		
		if(add1 == add2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		/*
		 * if (add1.equals(add2)) {
    System.out.println("같음");
} else {
    System.out.println("다름");
}
		 * */		
		//결과는 다름 나옴 왜그러냐면 heap영역의 주소값이 서로 달라서 그럼
		
		System.out.println("add1의 주소값 : " + System.identityHashCode(add1));
		// 결과 값 : 1485955886
		System.out.println("add1의 주소값 : " + System.identityHashCode(add2));
		// 결과 값 : 212921632
	}

}
