package KwonIlkeun;

public class C20230713 {

	public static void main(String[] args) {
		//증감연산자
//		int i = 5;
//		int j = 5;
//		
//		System.out.println(i++);
//		System.out.println(++j);
//		
//		System.out.println("i = "+i+", j = "+j);
		
		
		//i는 값이 증가되기전에 참조되므로 println()에게 i에 저장된 값 5를 넘겨주고나서 i의
		//값이 증가하기 때문에 5가 출력되고, j의 경우 j에 저장된 값을 증가 시킨 후에 println()에게 값을
		//넘겨주므로 6이 출력된다. 결과적으로 i,j 모두 1씩 증가되어 6이 된다.
		
		byte b = 100;//ok  byte타입의 범위 (-128~127)의 값 대입
		b = (byte)100;//ok  byte타입으로 형변환 대입
		
		int i = 100;
		//b = i;	//에러가 나는 이유는 위에서는 100이 명확한 상수이기 때문에 에러가 안나지만 여기서는 i가 변수이기 때문에
		//컴파일러가 값을 확신할 수 없다.
		b = (byte)i;
		
		//b = 1000;//byte타입의 범위 (-128~127)를 벗어난 값 대입
		b = (byte)1000;//ok  그러나 값손실이 발생해서 b에는 -24가 저장됨
	}

}
