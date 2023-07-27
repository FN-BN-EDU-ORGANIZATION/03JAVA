package C20230629;

import java.util.Scanner;

public class Star_Triangle {

	public static void main(String[] args) {
		
	
		int i=0;
		int j=0;
		int h=0;
		
		Scanner s = new Scanner(System.in);
		
		h = s.nextInt();
		
		
		for(i=0; i<h;i++)
		{
			for(j=0;j<h-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i*2+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
