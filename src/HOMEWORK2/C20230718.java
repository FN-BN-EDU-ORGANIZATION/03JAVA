package HOMEWORK2;
	//의문점
	//정리
		//다운캐스팅과 업캐스팅 헷갈리지 말기!
		//상속관계에서만 다운캐스팅과 업캐스팅 가능.
		//업캐스팅은 자손타입이 조상타입 / 다운캐스팅은 조상타입이 자손타입으로 형변환! 다운캐스팅이 실행될 때는 형변환표시를 해주어야한다!
		//조상타입이 자손타입보다 더 크기 때문에 형변환 표시를 해주어야 한다~
	//예제1 : 다형성(1)
		//여러가지 형태를 가질 수 있는 능력! 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하는 것.
//	class Tv{
//		boolean power;
//		int channel;
//		
//		void power() {power = !power;}
//		void channelUp() {++channel;}
//		void channelDown() {--channel;}		
//	}
//	
//	class CaptionTv extends Tv{ //CaptionTv와 Tv는 상속관계에 있다.
//		String ext;
//		void caption() {}
//	}

	
	//예제2 : 다형성(2)
		//업캐스팅 다운캐스팅!!!!!!
		//상속관계에 있는 클래스 사이에서 가능!
		//자손타입에서 조상타입으로 형변환 하는 경우 : 업캐스팅
		//조상타입에서 자손타입으로 형변환 하는 경우 : 다운캐스팅(형변환 생략불가!!)
	class Car{
		String color;
		int door;
		
		void drive() {
			System.out.println("drive, Brrr~");
		}
		void stop() {
			System.out.println("stop!!!!");
		}
	}
	
	class FireEngine extends Car{
		void water() {
			System.out.println("water!!!");
		}
	}
	
public class C20230718 {
	//예제1 출력
	//조상클래스타입의 참조변수로 자손클래스의 인스턴스를 참조하도록 하는 것도 가능하다.
//	CaptionTv c = new CaptionTv(); //참조변수 c는 CaptionTv의 멤버 모두를 사용할 수 있다!
//	Tv t = new CaptionTv(); //but 참조변수 t는 CaptionTv의 멤버중 tv클래스에서 상속받은 멤버만 사용할 수 있다!
//	CaptionTv c2 = new Tv(); //!!자손클래스의 참조변수로는 조상클래스 인스턴스를 참조할 수 없다!!


	//예제2 출력
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 자손타입이 조상타입으로 형변환 업캐스팅!!!!
//		car.water(); car 참조변수로는 water() 호출 불가
		fe2 = (FireEngine)car; //조상타입이 자손타입으로 형변환(형변환 생략 불가) 다운캐스팅!
		fe2.water();
		
	}

}
