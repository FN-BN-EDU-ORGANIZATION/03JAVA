package 이찬진;

public class C20230720 {

	public static void main(String[] args) {

		
		//예제1
//		A씨는 게시판 프로그램을 작성하고 있다.
//		A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//		입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//		출력 : 총페이지수
//		A씨가 필요한 프로그램을 작성하시오.
		
//		int m = 74896;
//		int n = 13;
//		
//		int quotient = m/n;
//		int remainder = m%n;
//		
//		int quotientPlusOne = quotient +1;
//		
//		System.out.println("총 게시물 수는 " + m + "입니다.");
//		System.out.println("한 페이지의 게시물 수는 " + n + "입니다.");
//		if(remainder==0) {
//			System.out.println("총 게시물 수는 " + quotient + "입니다.");
//		}else {
//			System.out.println("총 페이지 수는 " + quotientPlusOne + "입니다.");
//		}
		
		
		//예제2
		//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23
		//1000미만의 자연수에서 3,5의 배수의 총합을 구하라
		
		//1000 아래의 3과 5의 배수의 합을 구하시오.
		
		int sum = 0;
		for(int i = 1; i<1000; i++) {
			if(i%3 ==0 || i%5==0) {
				sum += i;
			}
		}
		System.out.println("3과 5의 배수 합 : " + sum);
	}

}
