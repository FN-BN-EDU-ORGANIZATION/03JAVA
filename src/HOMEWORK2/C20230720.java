package HOMEWORK2;
	//의문점
	//정리
		//상속은 다중상속이 불가능 / 인터페이스는 다중상속 가능!
	//예제1 : 인터페이스
		//일종의 추상클래스. but 추상클래스보다 추상화정도가 높아 추상메서드와 상수만 멤버로 가질 수 있다.
		//인터페이스는 다중상속 가능하다! 
		//인터페이스 구현해보기
//	class Fighter extends Unit implements Fightable{ //Unit클래스와 Fightable인터페이스를 상속받는 Fighter클래스
//		public void move(int x, int y) {} //메서드 구현
//		public void attack(Unit u) {} //메서드 구현
//	}
//	
//	class Unit{
//		int currentHP;
//		int x;
//		int y;
//	}
//	
//	interface Fightable extends Movable, Attackable{} //movable, attackable 인터페이스를 상속받는 fightable인터페이스
//	interface Movable {void move(int x, int y);}
//	interface Attackable{void attack(Unit u);}
	
	
	//예제2 : 인터페이스의 장점!
		//개발시간 단축, 표준화, 관계없는 클래스들 관계 맺어줄 수 있음, 독립적 프로그래밍 가능
	interface Repairable{} //수리관련 인터페이스 구현
	
	class Unit{
		int hitPoint;
		final int MAX_HP;
		Unit(int hp){
			MAX_HP = hp;
		}
	}
	
	class GroundUnit extends Unit{ //unit클래스를 상속받는 groundunit 클래스 생성
		GroundUnit(int hp){ //조상클래스의 생성자 호출
			super(hp);
		}
	}
	
	class AirUnit extends Unit { //unit클래스를 상속받는 airunit 클래스 생성
		AirUnit(int hp){ //조상클래스의 생성자 호출
			super(hp);
		}
	}
	
	class Tank extends GroundUnit implements Repairable{ //groundunit클래스와 repairable인터페이스를 상속받는 tank 클래스 생성
		Tank(){	//조상클래스의 생성자 호출
			super(150);
			hitPoint = MAX_HP;
		}
		
		public String toString() {
			return "Tank";
		}
	}
	
	
	class Dropship extends AirUnit implements Repairable{ //airunit클래스와 repairable인터페이스를 상속받는 dropship 클래스 생성
		Dropship(){	//조상클래스 생성자 호출
			super(125);
			hitPoint = MAX_HP;
		}
		
		public String toString() {
			return "Dropship";
		}
	}
	
	class Marine extends GroundUnit{ //groundunit클래스를 상속받는 marine클래스 생성
		Marine(){	//조상클래스 생성자 호출
			super(40);
			hitPoint = MAX_HP;
		}
	}
	
	class SCV extends GroundUnit implements Repairable{	//groundunit클래스와 repairable인터페이스를 상속받는 SCV클래스 생성
		SCV(){	//조상클래스 생성자 호출
			super(60);
			hitPoint = MAX_HP;
		}
		
		void repair(Repairable r) {	//repairable인터페이스의 참조변수를 매개변수로 하는 repair메서드 생성
			if(r instanceof Unit) {
				Unit u = (Unit)r;	//다운캐스팅
				while(u.hitPoint != u.MAX_HP) {
					u.hitPoint++;
				}
				System.out.println(u.toString() + "의 수리가 끝났습니다.");
			}
		}
	}
public class C20230720 {
	public static void main(String[] args) {
	//예제1 출력
//		Fighter f = new Fighter();
//		
//		if(f instanceof Unit) {
//			System.out.println("f는 Unit클래스의 자손입니다.");
//		}
//		if(f instanceof Fightable) {
//			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
//		}
//		if(f instanceof Movable) {
//			System.out.println("f는 Movable인터페이스를 구현했습니다.");
//		}
//		if(f instanceof Attackable) {
//			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
//		}
//		if(f instanceof Object) {
//			System.out.println("f는 Object클래스의 자손입니다.");
//		}
		
	//예제2 출력
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); 불가능! Marine객체를 받는 marine변수는 repairable 인터페이스를 상속받지 않기 때문!
	}
}
