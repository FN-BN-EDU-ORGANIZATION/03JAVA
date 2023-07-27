package 황다은;

import java.util.Random;
import java.util.Scanner;

public class C20230727 {

	public static void main(String[] args) {
		//문제1) 1부터 100까지의 숫자를 보여주되, 3과 5로 모두 나누어지는 경우 "짝!!뽀숑!!", 
		//3으로 나눠지는 경우 "짝!!" 5로 나눠지는 경우 "뽀숑!!"이 숫자 대신 나오는 코드 작성
//		for(int i=1;i<=100;i++) {
//			
//			if(i%3==0&&i%5==0) {
//				System.out.println("짝!!뽀숑!!");
//			}
//			else if(i%3==0) {
//				System.out.println("짝!!");
//			}
//			else if(i%5==0) {
//				System.out.println("뽀숑!!");
//			}else
//				System.out.println(i);
//		}
		//문제2)주사위를 여러번 던져서 각각의 숫자가 나오는 확률을 계산하려고 합니다. 다음 요구사항을 만족하는 프로그램을 작성해보세요.
//		Random rand = new Random();
//		int num = 0;	//주사위 번호
//		int count = 0;	//주사회 굴린 횟수 변수지정
//		int dice[] = new int[7];
//		double dicePer[] = new double[7]; //확률지정배열
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주사위를 굴릴 횟수를 입력하세요 :");
//		count = sc.nextInt();
//		for (int i = 1; i <= count; i++) {
//		num = rand.nextInt(6) + 1;
//		dice[num]++;
//		}
//		for (int i = 1; i <= 6; i++) {
//		System.out.printf("%d의 횟수: %d\n", i, dice[i]);
//		}
//		for (int i = 1; i <= 6; i++) {
//		dicePer[i] = ((double) dice[i] / count) * 100;
//		System.out.printf("%d의 확률: %.2f%%\n", i, dicePer[i]);
//		
//		}
		
		//다른 풀이
//		Random random = new Random();
//	      Scanner sc = new Scanner(System.in);
//
//	      int dice[] = { 0, 0, 0, 0, 0, 0 };
//
//	      System.out.println("주사위 던질 수를 입력해주세요");
//	      int t = sc.nextInt();
//	      for (int i = 0; i < t; i++) {
//	         int r = random.nextInt(6) + 1;
//	         System.out.println(r);
//	         if (r == 1) {
//	            dice[0]++;
//	         } else if (r == 2) {
//	            dice[1]++;
//	         } else if (r == 3) {
//	            dice[2]++;
//	         } else if (r == 4) {
//	            dice[3]++;
//	         } else if (r == 5) {
//	            dice[4]++;
//	         } else if (r == 6) {
//	            dice[5]++;
//	         }
//	      }
//
//	      System.out.println("1번 빈도 : " + dice[0]);
//	      System.out.println("2번 빈도 : " + dice[1]);
//	      System.out.println("3번 빈도 : " + dice[2]);
//	      System.out.println("4번 빈도 : " + dice[3]);
//	      System.out.println("5번 빈도 : " + dice[4]);
//	      System.out.println("6번 빈도 : " + dice[5]);
//
//	      System.out.println("1번 확률 : " + (double) dice[0] / t * 100);
//	      System.out.println("2번 확률 : " + (double) dice[1] / t * 100);
//	      System.out.println("3번 확률 : " + (double) dice[2] / t * 100);
//	      System.out.println("4번 확률 : " + (double) dice[3] / t * 100);
//	      System.out.println("5번 확률 : " + (double) dice[4] / t * 100);
//	      System.out.println("6번 확률 : " + (double) dice[5] / t * 100);
//	   }

		

	}

}
