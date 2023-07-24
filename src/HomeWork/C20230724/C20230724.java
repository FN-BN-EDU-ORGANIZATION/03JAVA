package HomeWork.C20230724;

import java.util.Scanner;

public class C20230724 {
	
	public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
	
	
	public static String capitalizeFirstLetter(String input) {
        StringBuilder result = new StringBuilder();
        boolean makeUppercase = true;

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                makeUppercase = true;
            } else if (makeUppercase) {
                ch = Character.toUpperCase(ch);
                makeUppercase = false;
            }
            result.append(ch);
        }

        return result.toString();
    }
	
	
	
	public static void main(String[] args) {
		
		
		//사용자에게 입력받은 문자열을 거꾸로 뒤집어서 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		String reverseString = reverseString(str);
		System.out.println("뒤집힌 문자열 : " + reverseString);
		
		//사용자에게 문자열을 입력받아 모든 단어의 첫 글자를 대문자로 변환하여 출력하는 프로그램을 작성하세요. (단어는 공백으로 구분됨)
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String inputString = scanner.nextLine();

        String capitalizedString = capitalizeFirstLetter(inputString);

        System.out.println("첫 글자가 대문자로 변환된 문자열: " + capitalizedString);
		
		
		
	}
}
