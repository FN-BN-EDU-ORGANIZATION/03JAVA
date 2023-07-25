package C202307;

import java.util.Scanner;

public class C230725 {

	public static void main(String[] args) {
		//첫 글자 대문자로 변환하기
//		Scanner sc = new Scanner(System.in);
//	    System.out.print("문자열을 입력하세요: ");
//	    String input = sc.nextLine();
//	    sc.close();
//
//	    String[] words = input.split(" ");
//	    StringBuilder converted = new StringBuilder();
//	    for (String word : words) {
//	      converted.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
//	    }
//	       
//	    System.out.println("첫 글자 대문자로 변환: " + converted.toString().trim());
	    
	    //사용자로부터 정수 n을 입력받아, n이 소수인지 아닌지 판별하는 자바 프로그램을 작성
	    Scanner scn = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = scn.nextInt();
        scn.close();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + "은(는) 소수입니다.");
        } else {
            System.out.println(n + "은(는) 소수가 아닙니다.");
        }
	}
}
