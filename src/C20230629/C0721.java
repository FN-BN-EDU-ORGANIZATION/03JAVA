package study;

import java.util.Scanner;

public class C0721 {

	public static void main(String[] args) {
		
		
		예제1(); // 프로그래머스 - 문자열 돌리기
		예제2(); // 프로그래머스 - 문자열 붙여서 출력하기

	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int z = a.length(); //문자열 길이를 z에 저장
        
        for(int i=0;i<z;i++) //0부터 z까지 반복
        {
        	System.out.println(a.charAt(i));	//a의 i번째 문자를 새 줄에 출력
        }
        
        
		
	}
	public static void 예제2() {
		
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); 	//띄어쓰기 기준으로 데이터 입력
        String b = sc.next();
        
        System.out.println(a+b); // 입력한 데이터 합치기
		
	}
}
