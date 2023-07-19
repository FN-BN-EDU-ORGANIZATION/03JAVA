package HomeWork.C20230719;

import java.util.Scanner;

public class C20230719 {
	
	public static void main(String[] args) {
		
		// 원의 넓이 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하시오 : ");
		double radius = sc.nextDouble();
		
		//원의 넓이 계산 : 넓이=파이*반지름*반지름
		final double PI = 3.14;
		double circle = PI*radius*radius;
		
		System.out.println("원의 넓이는 : " + circle);

		
		// 정수를 입력받아 해당 숫자가 소수인지 판별하는 코드작성
		// 소수는 1과 자기 자신만으로 나누어지는 수를 의미
		
		System.out.println("정수를 입력하세요: ");
		int no = sc.nextInt();
		
		boolean isPrime = checkPrime(no);
		
		if(isPrime) {
			System.out.println(no + "은(는) 소수입니다.");
		}else {
			System.out.println(no + "은(는) 소수가 아닙니다.");
		}
		sc.close();
		
	}
	// 소수 판별 메서드
	public static boolean checkPrime(int number) {
	    if (number <= 1) {
	        return false; // 1 이하의 숫자는 소수가 아님
	    }

	    // 2부터 number-1까지의 숫자로 나누어 떨어지는지 확인
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) {
	            return false; // 나누어 떨어지는 수가 있으면 소수가 아님
	        }
	    }

	    return true; // 나누어 떨어지는 수가 없으면 소수임
	}
}
