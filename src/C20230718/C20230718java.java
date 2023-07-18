package mystudy02_interface;

public class Myjava01_Undersea {

	public static void main(String[] args) {
		 	Dolphin d1 = new Dolphin();
		 	//초기화
		 	d1.setAge(3);
		 	d1.setName("남대희");
		 	d1.setSpecies("고대종");
		 	
		 	//호출
		 	d1.swim();
		 	d1.sendFrequency();
		 	
		 	
		 	d1.GiveBirthBaby();
		 	d1.NurtureBaby();
		 	d1.FeedBaby();
		 	
		 	//다형성은 인터페이스에서도 적용된다//이부분 복습할것
		 	//의문점 1 에서 의거 Swimmalbe 특징을 가진 객체를 생성하는데 걸림돌이된다.
		 	Swimmable s = new Dolphin();
		 	Hertzable h = new Dolphin();
		 	
		 	s.swim();
		 	h.sendFrequency();
		 	
		 	if(s instanceof Dolphin)
		 		((Dolphin)(s)).setAge(2);
		 		((Dolphin)(s)).GiveBirthBaby();
		 		
		 		
		 		
		 	Swimmable[] fishes = new Swimmable[2];
		 	fishes[0] =s;
		 	fishes[1] = new Dolphin();
	}	

}
