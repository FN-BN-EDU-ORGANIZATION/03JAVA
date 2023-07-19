package study;

import java.util.Scanner;

public class C0719 {

	public static void main(String[] args) {
		
		
		예제1(); // 백준 27866번 - 문자와 문자열
		예제2(); //백준 2743번 - 단어 길이 재기

	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] a = sc.next().split("");	//문자열을 입력 받아서 "" 기준으로 분리해서 a에 저장
		int num = sc.nextInt(); //입력 값을 num에 저장
		
		System.out.println(a[num - 1]);		//num에서 1을 뺀 값 (입력한 문자에서 num번 째 값, 배열은 0부터 시작하기 때문에) 
											//a[num] 값 출력
		

	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();	// 입력 값 한줄 a에 저장
		System.out.println(a.length()); //문자열 a의 길이 출력
		sc.close();
		
	}

}
