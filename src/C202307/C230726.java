package C202307;

import java.util.Scanner;

public class C230726 {
	//주어진 문자열에서 가장 빈도가 높은 문자를 출력하는 함수(대소문자를 구분하지 않고, 동일한 빈도가 있는 경우 ASCII 코드가 작은 문자를 출력)
    public static char mostFrequentCharacter(String input) {
        int[] charCount = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char lowerChar = Character.toLowerCase(input.charAt(i));
            charCount[lowerChar]++;
        }

        int maxCount = 0;
        char maxChar = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }
    //선택된 열의 합계 계산
    public static int columnSum(int[][] matrix, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (columnIndex < matrix[i].length) {
                sum += matrix[i][columnIndex];
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
		//주어진 문자열에서 가장 빈도가 높은 문자를 출력하는 함수(대소문자를 구분하지 않고, 동일한 빈도가 있는 경우 ASCII 코드가 작은 문자를 출력)
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("문자열을 입력하세요:");
//        String input = scanner.nextLine();
//        char mostFrequentChar = mostFrequentCharacter(input);
//
//        System.out.println("가장 빈번하게 사용된 문자: " + mostFrequentChar);
//        scanner.close();
        
        //선택된 열의 합계 계산
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            Scanner sc = new Scanner(System.in);
            System.out.println("계산하려는 열의 인덱스를 입력하세요:");
            int columnIndex = sc.nextInt();
            int sum = columnSum(matrix, columnIndex);
            System.out.println("열의 합계: " + sum);

            sc.close();
        
    }

}
