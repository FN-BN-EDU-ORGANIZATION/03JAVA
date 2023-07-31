package C202307;

import java.util.Scanner;

public class C230727 {
	 public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter two integers: ");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    int sum = num1 + num2;
	    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

	}
	
	 public double divide(int a, int b) {
		    if (b == 0) {
		      throw new IllegalArgumentException("Cannot divide by zero.");
		    }
		    return (double) a / b;

}
