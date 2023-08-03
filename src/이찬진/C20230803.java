package 이찬진;

import java.util.Scanner;

public class C20230803 {

	public static void main(String[] args) {
		
		
		//예제1
		//문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 
		//입력받은 문자를 이어서 출력하는 프로그램
		
//		Scanner sc = new Scanner(System.in);
//		
//		char[] arr = new char[10];
//		int i;
//		
//		for(i=0;i<10;i++) {
//			arr[i]=sc.next().charAt(0);
//			System.out.print(arr[i]);
//		}
		
		
		//예제2
		//최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int i, cnt =0;
		
		for(i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==0) {
				break;
			}
			cnt++;
		}
		for(i=1;i<cnt;i+=2) {
			System.out.print(arr[i]+" ");
		}

	}

}
