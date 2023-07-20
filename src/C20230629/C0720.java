package study;

import java.util.Scanner;

public class C0720 {

	public static void main(String[] args) {
		
		예제1(); // 백준 2562번 - 최댓값
		예제2(); // 프로그래머스 홀짝 구분하기

	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];	//길이가 9인 arr배열 생성
		int max = arr[0];	//arr의 0번째 max
		int index = 0;	//index=0;
		
		for(int i=0;i<arr.length;i++)	//int i=0부터 arr의 길이보다 작을 때까지 반복
		{
			arr[i] = sc.nextInt();	//for문 내부에서 정수를 입력받아 arr의 i에 저장
			if(max<arr[i])		//max보다 arr[i]가 크면
			{
				max = arr[i];	//max는 arr[i]
				index = i+1;	//1부터 시작하는 형태로 표시하기 위해서 +1
			}
		}
		System.out.println(max);		//max출력
		System.out.println(index);		//index출력
		
	}
	public static void 예제2() {
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%2==0)		//a를 2로 나눴을 때 나머지가 0이면 짝수
            System.out.println(a + " is even");
        else		//아니면 홀수
            System.out.println(a + " is odd");
		
	}

}
