package 이찬진;

import java.util.Scanner;

public class C20230817 {

	
	//가위바위보 게임을 하려고합니다. 다음 조건을 만족하는 게임 생성하는 생성자를 작성해라
	
	//1. 컴퓨터와 플레이어가 가위,바위,보 중 하나를 선택합니다.
	//2. 두선택지를 비교하여 누가 이겼는지 출력합니다.
	//3. 승패여부와 관계없이 플레이어와 컴퓨터의 선택을 출력합니다.
	
	private String pc;
	private String cc;
	private String winner;
	
	public C20230817(String pc) {
		this.pc = pc;
		String[] options = {"가위","바위","보"};
		int index = (int) (Math.random()*options.length);
		this.cc = options[index];
		
		
		if(pc.equals(cc)) {
			this.winner = "비겼습니다";
		}else if((pc.equals("가위")&&cc.equals("보")) || (pc.equals("바위")&&cc.equals("가위")) || pc.equals("보")&& cc.equals("바위") ){
			this.winner = "플레이어 승!";
		}else {
			this.winner = "컴퓨터 승!";
		}
		
		System.out.println("플레이어의 선택 : " + this.pc);
		System.out.println("컴퓨터의 선택 : " + this.cc);
		System.out.println("결과 : "+this.winner);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위,바위,보 중 하나를 선택해봐 : ");
		String pc = sc.next();
		C20230817 game = new C20230817(pc);
	
	}
}
