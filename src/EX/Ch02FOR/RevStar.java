package EX.Ch02FOR;

import java.util.Scanner;

public class RevStar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int num;

	      System.out.print("정수를 입력하시오 >> ");
	      num = sc.nextInt();
	      
	      for(int i=0; i<num; i++) {
	         for(int j=0; j<num-i; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      
	      sc.close();

	}

}
