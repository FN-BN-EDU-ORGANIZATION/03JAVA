package HOMEWORK2;

	//의문점
	//정리
		//제어자 관련 개념정리!
	//예제1 : 제어자(1)
		//클래스, 변수, 메서드의 선언부에 함께 사용되어 부가적 의미 부여 (접근제어자 / 그 외의 제어자)
		//접근제어자 : public protected default private
		//그 외	  : static final abstract native transient synchronized volatile strictfp

		//static 
			//멤버변수에 static을 붙일 경우에 모든 인스턴스에 공통적으로 사용되는 클래스변수가 된다. 클래스변수는 인스턴스를 생성하지 않아도 사용 가능하다.
			//메서드에 static을 붙일 경우에는 인스턴스를 생성하지 않아도 호출이 가능한 메서드가 된다. static메서드 내에서는 인스턴스멤버들을 직접 사용할 수는 없다
		class StaticTest{
			static int width = 200;		//클래스변수가 됨
			static int height = 120;	//클래스변수가 됨
			
			static {}	//클래스 초기화 블럭
			
			static int max(int a, int b) {	//클래스메서드
				return a > b ? a : b;
			}
		}
		
		//final
			//변수에 사용되면 상수가 되고 메서드에 사용하면 오버라이딩을 할 수 없고 클래스에 사용하면 자손클래스를 정의하지 못한다.
		final class FinalTest{			//상속불가능한 클래스
			final int MAX_SIZE = 10;	//값을 변경할 수 없는 멤버변수(상수)
			
			final void getMaxSize() {	//오버라이딩 불가능한 메서드(변경불가)
				final int LV = MAX_SIZE;
				return MAX_SIZE;
			}
		}

		//abstract
			//메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용된다.
			//추상클래스에서는 인스턴스를 생성할 수 없다. 
		abstract class AbstractTest{	//추상클래스(추상메서드를 포함하는 클래스!)
			abstract void move();		//추상메서드(구현부가 없음)
		}
		
		
	//예제2 : 제어자(2)
		//접근 제어자는 클래스, 멤버변수, 메서드, 생성자에 사용될 수 있다. 기본 제어자는 Default
		//private - 같은 클래스 내에서만 접근 가능
		//default - 같은 패키지 내에서만 접근 가능
		//protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근 가능
		//public - 접근제한 전혀 없음
public class C20230717 {
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
//		t.hour = 13; //hour은 제어자가 private이기 때문에 접근 불가! 멤버변수로 직접 접근이 불가하므로 메서드를 통해 접근!
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

	class Time{
		private int hour, minute, second;		//private는 같은 class 내에서만 접근 가능하다!
		
		Time(int hour, int minute, int second){	//해당 변수들로 접근하기 위해서는 메서드를 통해 접근해야 함!
			setHour(hour);
			setMinute(minute);
			setSecond(second);
		}
		
		public int getHour() {return hour;}
		public void setHour(int hour) {
			if(hour < 0 || hour > 23) return;
			this.hour = hour;
		}
		
		public int getMinute() {return minute;}
		
		public void setMinute(int minute) {
			if(minute < 0 || minute > 59) return;
			this.minute = minute;
		}
		
		public int getSecond() {return second;}
		
		public void setSecond(int second) {
			if(second < 0 || second > 59) return;
			this.second = second;
		}
		
		public String toString() {
			return hour + ":" + minute + ":" + second;
		}
	}
	