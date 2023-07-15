package study;

import java.util.Arrays;
import java.util.Scanner;

public class C0714 {

	public static void main(String[] args) {
		예제1(); //백준 1978번 소수찾기

		예제2(); //백준 10818번 최소,최대



	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		int num;
		
		for(int i=0;i<a;i++)	// i=0부터 a보다 작을 때까지 반복
		{
			num = sc.nextInt();		
			for(int j=2;j<=num;j++)	// j=2부터 num까지 반복
			{
				if(j == num)	// j와 num이 같다면 count 증가
					count++;
				if(num == 0)	// num이 0과 같다면 break;
					break;
			}
			
		}
		System.out.println(count);	//count 출력
		
		
	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
        
		int a = sc.nextInt();
		int[] arr = new int[a];		//크기가 a인 배열 arr 선언
        
		for (int i = 0; i < a; i++) {	// i=0부터 a보다 작을 때까지 반복
			arr[i] = sc.nextInt();		// a개의 정수 값을 받아 arr에 저장
		}
        
		sc.close();
		Arrays.sort(arr);		//arr 오름차순
		System.out.print(arr[0] + " " + arr[a - 1]);		// 가장 작은 값과 가장 큰 값 출력
	}


}
