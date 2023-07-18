package C202307;

import java.util.Scanner;

public class C230717 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9):");
        int num = sc.nextInt();  // 사용자로부터 숫자를 입력받는다.
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d ", i * num);  // 뒤에 공백을 포함하여 구구단의 숫자를 출력한다.
        }
		Scanner sc1 = new Scanner(System.in);
		System.out.print("입력해 주세요:");
		String userInput = sc1.nextLine();  // 사용자로부터 한 줄 입력을 받는다.
		String[] numbers = userInput.split(",");  // "," 구분자로 나눈다.
		int total = 0;
			for(String num1: numbers) {
				num1 = num1.trim();  // 숫자 문자의 공백을 제거한다.
				int n = Integer.parseInt(num1);  // 숫자 문자를 정수로 변환한다.
				total += n;
			}
			System.out.printf("총합은 %d 입니다.\n", total);
			
	}
}

