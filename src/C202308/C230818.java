package C202308;

import java.util.Scanner;

public class C230818 {

	public static void main(String[] args) {
		//구구단의 결과를 2차원 배열로 저장하고, 이를 이용하여 행과 열을 입력받아 해당 위치의 값을 출력하는 프로그램을 작성
		int[][] table = new int[9][9];

        // 구구단 배열 초기화
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // 입력받은 위치의 값 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("행: ");
        int row = scanner.nextInt() - 1;  // 배열 인덱스는 0부터 시작하므로 1을 빼줌

        System.out.print("열: ");
        int column = scanner.nextInt() - 1;

        System.out.println((row + 1) + " * " + (column + 1) + " = " + table[row][column]);
        
        //사용자로부터 키를 입력받아 BMI를 계산하는 자바 프로그램을 작성
        Scanner scanner2 = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("키(m)를 입력하세요: ");
        height = scanner2.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        weight = scanner2.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

	}

}
