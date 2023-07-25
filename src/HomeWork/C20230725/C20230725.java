package HomeWork.C20230725;

import java.util.Scanner;

public class C20230725 {
	
	public static void main(String[] args) {
		
		//문제: 1부터 100까지의 숫자를 출력하는 프로그램을 작성하세요. 다음 조건을 따라서 출력하세요.

		//숫자가 3의 배수이면 숫자 대신에 "Fizz"를 출력합니다.
		//숫자가 5의 배수이면 숫자 대신에 "Buzz"를 출력합니다.
		//숫자가 3의 배수이면서 5의 배수이면 숫자 대신에 "FizzBuzz"를 출력합니다.
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {		// 순서가 아래에 있으면 출력이 되지 않으므로 위로 올라와야한다.
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println("숫자는" + i);
			}
		}
		
		//문제: 사용자로부터 자연수 n을 입력받아 n개의 문자열을 배열에 저장한 후, 
		//각 문자열의 길이를 계산하여 가장 긴 문자열과 가장 짧은 문자열을 출력하는 자바 프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);

        // 사용자로부터 자연수 n을 입력받음
        System.out.print("정수 n을 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // n개의 문자열을 저장할 배열 생성
        String[] strings = new String[n];

        // 사용자로부터 n개의 문자열 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 문자열을 입력하세요: ");
            strings[i] = scanner.nextLine();
        }

        // 가장 긴 문자열과 가장 짧은 문자열을 찾기 위한 변수 초기화
        String longestString = strings[0];
        String shortestString = strings[0];

        // 배열에 저장된 문자열들을 순회하며 가장 긴 문자열과 가장 짧은 문자열 찾기
        for (int i = 1; i < n; i++) {
            if (strings[i].length() > longestString.length()) {
                longestString = strings[i];
            }
            if (strings[i].length() < shortestString.length()) {
                shortestString = strings[i];
            }
        }

        // 결과 출력
        System.out.println("가장 긴 문자열: " + longestString);
        System.out.println("가장 짧은 문자열: " + shortestString);

        scanner.close();
		
		
		
		
	}
}
