package study;

import java.util.Scanner;

public class C0717 {

	public static void main(String[] args) {
		
		예제1(); //백준 14681번 - 사분면 고르기
		예제2(); //백준 2884번 - 알람시계
		

	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		
		if(a > 0 && b >0)		// a와b가 0보다 크면 1사분면
		{
			System.out.println("1");
		}
		else if(a < 0 && b > 0)	// a가 0보다 작고 b가 0보다 크면 2사분면
		{
			System.out.println("2");
		}
		else if(a < 0 && b < 0)	// a와b가 0보다 작으면 3사분면
		{
			System.out.println("3");
		}
		else if(a > 0 && b < 0)	// a가 0보다 크고 b가 0보다 작으면 4사분면
		{
			System.out.println("4");
		}
		
	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();			// 시
		int m = sc.nextInt();			// 분
		sc.close();
		
		if(m < 45)				//분이 45 미만이면
		{
			h--;				// 시 1감소 (시,분을 11시 40분으로 설정하면 45분 일찍 깨워야하기 때문에)
			m = 60 - (45 - m);	// 입력한 분에서 45분을 뺀 분
			if(h < 0)			//시가 0보다 작으면
			{
				h = 23;			//시 = 23
			}
			System.out.println(h + " " + m);  // h와 60 - (45 - m) 출력 
		}
		else
		{
			System.out.println(h + " " + (m - 45));		//분이 45미만 아니면 m - 45를 한 결과 출력 
		}
		
		
		
		
		
	}

}
