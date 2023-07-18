package study;

import java.util.Scanner;

public class C0718 {

	public static void main(String[] args) {

		예제1(); // 백준 2525번 - 오븐 시계
		예제2(); //백준 2480번 - 주사위 세개

	}

	public static void 예제1() {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt(); // 14
		int m = sc.nextInt(); // 30
		int time = sc.nextInt(); // 20

		int min = 60 * h + m; // 시 -> 분
		min += time; // min에 time을 더한다.

		int hour = (min / 60) % 24; // 구했던 분을 다시 시간 단위로 변환
		int minute = min % 60; // 남은 분 계산

		System.out.println(hour + " " + minute);

	}

	public static void 예제2() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a != b && b != c && a != c) { // 모든 변수가 다른 경우
			
			int max;
			
			if (a > b) { // 만약 a > b 라면
				if (c > a) { // c > a > b 라면
					max = c; // 최대값은 c
				}
				else { // a > (b, c)
					max = a;
				}
			}
			else { // b > a 라면
				if (c > b) { // c > b > a 라면
					max = c;
				}
				else {		// b > (a, c)
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		else { 		// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
			if (a == b && a == c) {   	// 3개의 변수가 모두 같은 경우
				System.out.println(10000 + a * 1000);
			} else {
				if (a == b || a == c) { // a가 b혹은 c랑만 같은 경우
					System.out.println(1000 + a * 100);
				}
				else {		// b가 c랑 같은 경우
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
