package HomeWork.C20230721;

import java.util.Scanner;

public class C20230721 {
	
	public static boolean isFibonacci(int n) {
		if(n==1||n==2) {
			return true;
		}
		
		int first = 1;
		int second = 1;
		int current = first + second;
		
		while(current <= n) {
			if (current == n) {
				return true;
			}
			
			first = second;
			second = current;
			current = first + second;
		}
		return false;
	}
	
	public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받아 해당 숫자가 피보나치 수열(Fibonacci sequence)에 속하는지 판별하는 프로그램을 작성하세요. 
		//피보나치 수열은 첫 번째와 두 번째 숫자가 1이며, 세 번째 숫자부터는 바로 앞의 두 숫자의 합으로 이루어지는 수열입니다.
		
		System.out.println("정수를 입력하시오 : ");
		int no = sc.nextInt();
		
		boolean isFibonacci = isFibonacci(no);
		
		if(isFibonacci) {
			System.out.println(no + " 은/는 피보나치 수열에 속함.");
		}else {
			System.out.println(no + " 은/는 피보나치 수열에 속하지 않음.");			
		}
		System.out.println("------------------------------------------------------------------------");
		
		//양의 정수를 입력받아, 해당 숫자의 약수(divisor)들을 출력하는 프로그램을 작성하세요. 약수는 해당 숫자를 나누어 떨어지게 하는 수를 의미합니다.
		System.out.println("정수를 입력하시오 : ");
		int no1 = sc.nextInt();
		System.out.println(no1 + "의 약수");
		printDivisors(no1);
		
	
	}
	
	
}
