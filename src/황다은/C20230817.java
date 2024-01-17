package 황다은;

import java.util.Scanner;

class BMI {
	String name;
	double height;
	double weight;
	
	public BMI() {}
	
	public BMI(String name, double height, double weight) {
		this.name= name;
		this.height = height;
		this.weight = weight;
		double bmi;
		bmi = weight/((height/100)*(height/100));
		
		System.out.print(name+"님의 BMI 지수는 " + bmi +"이고 ");
		if(bmi>=0&&bmi<18.6) {
			System.out.println("저체중 입니다.");
		}else if(bmi>=18.6 && bmi<22.9) {
			System.out.println("정상 입니다.");
		}else if(bmi>=22.9 && bmi<24.9) {
			System.out.println("과체중 입니다.");
		}else if(bmi>=24.9 && bmi<30) {
			System.out.println("비만 입니다.");
		}else if(bmi>=30) {
			System.out.println("고도비만 입니다.");
		}
		
	}
}
class RockScissorsPaperGame{
	String player;
	String computer;
	String winner;
	
	RockScissorsPaperGame(String player){
		this.player = player;
		String[] options = {"가위","바위","보"};
		int index = (int)(Math.random()*options.length);
		this.computer= options[index];
		
		if(player.equals(computer)) {
			this.winner="비겼습니다.";
		}else if((player.equals("가위")&&computer.equals("보"))||(player.equals("바위")&&computer.equals("가위"))||(player.equals("보")&&computer.equals("바위"))) {
			this.winner="플레이어 승!";
		}else {
			this.winner="컴퓨터 승!";
		}
		
		
	}
	
}

public class C20230817 {
	public static void main(String[] args) {
		//3명의 이름, 키, 몸무게 입력받아 bmi지수를 계산하는 포로그램
		//멤버변수를 초기화할때 생성자 사용 		체중/신장*신장
		
		BMI bmi =new BMI("황다은",158.6,52.9);	
		
		//가위바위보게임
		//가위바위보게임을 하려고 합니다. 다음조건을 만족하는 게임 생성하는 생성자 작성
		//1. 컴퓨터와 플레이어와 가위, 바위, 보 중 하나를 선택
		//2. 두 선택지를 비교하여 누가 이겼는지 출력
		//3. 승패 여부와 관계없이 플레이어와 컴퓨터의 선택을 출력
		
		
		
		
		
	}
}
