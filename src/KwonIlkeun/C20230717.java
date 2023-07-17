package KwonIlkeun;

import java.util.Scanner;

public class C20230717 {

	public static void main(String[] args) {
		// 중첩if문 예제
		
		int score = 0;
		char grade = 'C', opt = 0;
		
		System.out.println("점수를 입력해주세요.>");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.\n",score);
		
		if(score>=90) {//점수가 90점 이상이면 A학점
			grade = 'A';
			if(score >= 98) {//90점이상 중에서도 98점 이상은 A+
				opt = '+';
				
			}else if(score<94) {//90점이상 94점 미만은 A-
				opt = '-';
				
			}
		}else if(score>=80) {//80점 이상이면 B학점
			grade = 'B';
			if(score>=88) {//88점 이상이면 B+
				opt='+';
				
			}else if(score <84) {//80점이상 84점미만은 B-
				opt = '-';
				
			}
		}else {
			grade = 'C';//나머지는 C학점
		}
		System.out.printf("당신의 학점은 %c%c입니다.\n",grade,opt);
		
	}

}
