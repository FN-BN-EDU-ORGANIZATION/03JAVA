package C20230717;

import mystudy02_interface.*; //가져와


public class 실습test01 {

	public static void main(String[] args) {
			
		//1) 유니콘을 만들어보세요 환상의 생물이므로 별도의  class를 만들지 않습니다.
		Mammal unicon = new Mammal() {

			@Override
			public void GiveBirthBaby() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void NurtureBaby() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void FeedBaby() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Fliable unicon2 = new Fliable() {

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void FlapWing() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		MagicOak mm = new MagicOak();
		mm.magic();
		
		Unicon u = new Unicon();
		u.fly();
		
		TigerDolphin t  = new TigerDolphin();
		t.swim();

	}

}
