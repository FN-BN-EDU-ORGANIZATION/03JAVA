package C202308;

import java.util.Scanner;

public class C230802 {

	public static void main(String[] args) {
		//1~100사이의 정수 중에 3의 배수는 "Fizz"로 출력하고, 5의 배수는 "Buzz"로 출력하며, 
		//3과 5의 공통 배수는 "FizzBuzz"로 출력하는 프로그램을 작성
		for(int i=1; i<=100; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0) {
                System.out.println("Fizz");
            }
            else if(i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
        
        //사용자로부터 숫자 두 개를 입력받아 각 연산값을 출력하는 간단한 계산기 프로그램을 작
        //사용자로부터 문자열 한 줄을 입력받아, 해당 문자열의 길이를 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        float divide = (float)num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int strLength = str.length();
        System.out.println("Length: " + strLength);
	}

}
