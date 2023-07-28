package 이찬진;

import java.util.Random;
import java.util.Scanner;

public class C20230728 {

	public static void main(String[] args) {

		//예제1

		      Random random = new Random();
		      Scanner sc = new Scanner(System.in);

		      int dice[] = { 0, 0, 0, 0, 0, 0 };

		      System.out.print("주사위 던질 수를 입력해주세요 : ");
		      int t = sc.nextInt();
		      for (int i = 0; i < t; i++) {
		         int r = random.nextInt(6) + 1;
		         System.out.println(r);
		         if (r == 1) {
		            dice[0]++;
		         } else if (r == 2) {
		            dice[1]++;
		         } else if (r == 3) {
		            dice[2]++;
		         } else if (r == 4) {
		            dice[3]++;
		         } else if (r == 5) {
		            dice[4]++;
		         } else if (r == 6) {
		            dice[5]++;
		         }
		      }

		      System.out.println("1번 빈도 : " + dice[0]);
		      System.out.println("2번 빈도 : " + dice[1]);
		      System.out.println("3번 빈도 : " + dice[2]);
		      System.out.println("4번 빈도 : " + dice[3]);
		      System.out.println("5번 빈도 : " + dice[4]);
		      System.out.println("6번 빈도 : " + dice[5]);

		      System.out.println("1번 확률 : " + (double) dice[0] / t * 100);
		      System.out.println("2번 확률 : " + (double) dice[1] / t * 100);
		      System.out.println("3번 확률 : " + (double) dice[2] / t * 100);
		      System.out.println("4번 확률 : " + (double) dice[3] / t * 100);
		      System.out.println("5번 확률 : " + (double) dice[4] / t * 100);
		      System.out.println("6번 확률 : " + (double) dice[5] / t * 100);
		   }


}

