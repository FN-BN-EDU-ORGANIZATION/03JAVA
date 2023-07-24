package 이찬진;

import java.util.Scanner;

public class C20230724 {
	public static void main(String[] args) {
		
		
		// 예제
		// 배열을 이용하여 7명의 IQ를 입력받아 최대 IQ와 최소 IQ를 출력하는 프로그램을 만들어보세요.

		int people = 7;
		int[] iqArray = new int[people];
		Scanner sc = new Scanner(System.in);

		System.out.println("7명의 IQ를 입력하세요 : ");

		// IQ입력받기
		for (int i = 0; i < people; i++) {
			System.out.print("IQ " + (i + 1) + ":");
			iqArray[i] = sc.nextInt();
		}
		// 최대IQ 최소 IQ 찾기
		int maxIQ = iqArray[0];
		int minIQ = iqArray[0];

		for (int i = 1; i < people; i++) {
			if (iqArray[i] > maxIQ) {
				maxIQ = iqArray[i];
			}
			if (iqArray[i] < minIQ) {
				minIQ = iqArray[i];
			}
		}
		System.out.println("최대 IQ : " + maxIQ);
		System.out.println("최소 IQ : " + minIQ);

	}
}
