package HomeWork.C20230817;

import java.util.Random;
import java.util.Scanner;

public class C20230817 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"가위", "바위", "보"};

        System.out.println("가위바위보 게임을 시작합니다!");

        while (true) {
            System.out.print("가위, 바위, 보 중 하나를 선택하세요: ");
            String userChoice = scanner.next();

            if (!isValidChoice(userChoice)) {
                System.out.println("올바른 선택이 아닙니다. 다시 입력하세요.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("컴퓨터: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            System.out.print("계속 하시겠습니까? (y/n): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("게임을 종료합니다. 감사합니다!");
                break;
            }
        }

        scanner.close();
    }

    public static boolean isValidChoice(String choice) {
        return choice.equals("가위") || choice.equals("바위") || choice.equals("보");
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "무승부입니다!";
        } else if (
            (userChoice.equals("가위") && computerChoice.equals("보")) ||
            (userChoice.equals("바위") && computerChoice.equals("가위")) ||
            (userChoice.equals("보") && computerChoice.equals("바위"))
        ) {
            return "당신이 이겼습니다!";
        } else {
            return "컴퓨터가 이겼습니다!";
        }
	}
}
