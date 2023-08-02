package 이찬진;

import java.util.Scanner;

public class C20230802 {

	public static void main(String[] args) {

		
		//예제1
		//피라미드모양 별찍기
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//예제2
		
		System.out.print("홀수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// 위쪽 영역
		     {
		        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *찍기
		     }
		     else if (i>num/2) //아래쪽 영역
		     {
		        if (i-j>=num/2+1) //왼쪽 밑 공백
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *찍기
		     }
		  }
		  System.out.println();//줄바꿈
		}
		
		
	}

}
