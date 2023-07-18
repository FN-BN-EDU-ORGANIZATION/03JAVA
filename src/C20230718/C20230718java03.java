package mystudy02_interface;
		//마우스 add ~ // 추상메서드를  상속하고 interface를 가져온다 // 이후 마우스 dolphin
		//이렇게 다중상속하는 이유가뭔지 고찰?// 깜빡 메서드를 잊은경우 추가적으로 가능
		//다중상속은 불가능하지만 , 인터페이스는 여러개 붙일수있다
		//의문점 1. 그러면 인터페이스를 만들지말고 여기다가 메서드를 추가하면 안돼냐? .. 문제발생 
		//1. 다른종을 추가햇을 경우에 불편하다 에를들어 돌고래가아닌 큰 혹등고래나 큰 범고래같은경우에 
		//interface를 추가해서 특징을 추가하면 되는데 다시 직접적어야하는 불편함이 생긴다
public class Dolphin extends Mammal implements Hertzable,Swimmable{
			
		
			//Swimmalbe 인터페이스 메서드
			@Override
			public void swim() {
				System.out.println("돌고래처럼 헤엄친다");
			}
			
			//interface Hertzable , sendFrequency 메서드 가져옴
			@Override
			public void sendFrequency() {
				
				System.out.println("돌고래처럼 초음파발싸");
			}
			
			
			
			//Mammal 상속 메서드
			@Override
			public void GiveBirthBaby() {
				System.out.println(getAge()+"출산");
				
			}
			@Override
			public void NurtureBaby() {
				System.out.println(getName()+"아기를 돌봐요");
						
			}
			@Override
			public void FeedBaby() {
				System.out.println(getSpecies()+"종은 아이를 먹입니다.");
				
			}
		
}
