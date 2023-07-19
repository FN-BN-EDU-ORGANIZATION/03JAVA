package LEEJUHYUN;

import java.util.Scanner;

public class C20230719 {

	
	public static void main(String[] args) {
		
		//예제 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = scanner.nextInt(); // 사용자로부터 첫 번째 숫자 입력받기
//
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = scanner.nextInt(); // 사용자로부터 두 번째 숫자 입력받기
//
//        System.out.print("세 번째 숫자를 입력하세요: ");
//        int num3 = scanner.nextInt(); // 사용자로부터 세 번째 숫자 입력받기
//
//        int max = num1; // 가장 큰 수를 저장할 변수 초기화
//
//        if (num2 > max) { // num2가 max보다 큰 경우
//            max = num2; // num2를 max로 설정
//        }
//
//        if (num3 > max) { // num3가 max보다 큰 경우
//            max = num3; // num3를 max로 설정
//        }
//
//        System.out.println("가장 큰 수는 " + max + "입니다."); // 가장 큰 수 출력
//
//        scanner.close(); // Scanner 객체 닫기
        
        
        
        //예제 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 숫자를 더할까요? ");
        int count = scanner.nextInt(); // 숫자 개수 입력받기

        int sum = 0; // 합을 저장할 변수 초기화

        for (int i = 0; i < count; i++) {
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt(); // 숫자 입력받기

            sum += num; // 입력받은 숫자를 sum에 더하기
        }

        System.out.println("입력한 숫자들의 합은 " + sum + "입니다.");

        scanner.close(); // Scanner 객체 닫기
        
    }
}
