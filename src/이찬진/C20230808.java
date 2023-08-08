package 이찬진;

import java.util.Scanner;

public class C20230808 {

	public static void main(String[] args) {

		
		//예제1
		//알람시계
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//		sc.close();
//		
//		if(h<=24) {
//			if(m>=0 && m<=60) {
//				if(m<45) {
//					h--;
//					m=(m+60)-45;
//					
//					if(h<0){
//						h =23;
//					}
//					System.out.println(h+""+m);
//				}
//			}else {
//				System.out.println(h + ""+(m-45));
//			}
//				
//		}
		
		//예제2
		  Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        sc.close();

	        if(x>= -1000 && x<=1000 && x!=0) {
	            if (y >= -1000 && y <= 1000 && y != 0) {
	                if(x>0 && y>0)
	                    System.out.println("1");
	                else if(x<0 && y>0)
	                    System.out.println("2");
	                else if(x<0 && y<0)
	                    System.out.println("3");
	                else if(x>0 && y<0)
	                    System.out.println("4");
	            }
	        }
		
		
		
	}

}
