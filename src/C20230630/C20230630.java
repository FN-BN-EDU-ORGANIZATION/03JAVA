package C20230630;

import java.util.Scanner;

public class C20230630 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	
	int a,b,c;
	int max=0;
	
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	
//	if(a>b && a>c)
//		max = a;
//	else if(b>a && b>c)
//		max = b;
//	else if(c>a && c>b)
//		max = c;

			
	max = (a>b && a>c) ? a : (b > a && b > c) ? b : (c > a && c> b) ? c : (a > b) ? a : b;
	
	System.out.println("최댓값 : "+max);
	
	int i = 0;
		
	}

}
