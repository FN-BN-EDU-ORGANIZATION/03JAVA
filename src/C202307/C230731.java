package C202307;

import java.util.Scanner;

public class C230731 {

	public static void main(String[] args) {
		 int[] numbers = new int[5];
		    Scanner scanner = new Scanner(System.in);

		    for (int i = 0; i < numbers.length; i++) {
		      System.out.println("Enter number " + (i + 1) + ": ");
		      numbers[i] = scanner.nextInt();
		    }

		    int max = numbers[0];
		    for (int num : numbers) {
		      if (num > max) {
		        max = num;
		      }
		    }

		    System.out.println("The maximum number is " + max);
		    
		    int n = 10; // nth term to calculate
		    int result = fibonacci(n);
		    System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
		  }

		  public static int fibonacci(int n) {
		    if (n <= 1) {
		      return n;
		    } else {
		      return fibonacci(n - 1) + fibonacci(n - 2);
		    }
	}

}
