package KwonIlkeun;

public class C20230714 {

	public static void main(String[] args) {
		//문제1. 변수num의 값중에서 백의자리 이하를 버리는 코드를 작성하시오
		//ex) 456 -> 400, 111 -> 100
		
//		int num = 456;
//		System.out.println(num/100*100);
	
		
		
		//문제2. 사과를 담는데 필요한 바구니의 수를 구하는 코드를 작성하시오.
		//ex) 사과 123개이고, 바구니에 사과10개를 담을 수 있다면 필요한 바구니는 13개입니다.
//		int numOfApples = 123;	//사과의 갯수
//		int sizeOfBucket = 10;	//바구니의 크기
//		int numOfBucket = Math.round(numOfApples / sizeOfBucket + 0.5f);
//		//소수점 첫째자리에 0.5를 더하면 , Math.round는 값을 무조건 올림하여 반환
//		System.out.println("필요한 바구니의 수 : "+ numOfBucket);
		
		
		//문제3. 변수num의 값에 따라 양수,음수,0을 출력하는 코드를 작성하시오.(삼항연산자를 2번 사용)
		int num = 10;
		System.out.println((num>0)? "양수" : (num<0)?"음수":"0");

	}

}
