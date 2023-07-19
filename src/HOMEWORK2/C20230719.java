package HOMEWORK2;
	//의문점
	//정리
	//예제1 : 다형성(3) 
		//다형성은 메서드의 매개변수에도 적용된다!
		//메서드 사용을 위해 모든 클래스의 참조변수를 생성하여 매개변수로 만드는 것이 아니라 
		//자손클래스를 상속하는 조상클래스의 참조변수 하나로 모든 자손클래스를 매개변수로 받을 수 있다!
class Product{	//조상클래스
	int price;			//제품가격
	int bonusPoint;		//제품구매포인트
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
//자손클래스
class TV extends Product {
	TV(){
		super(100);	//조상클래스의 생성자 호출. TV가격 100
	}
	
	public String toString() {return "TV";}
}
class Computer extends Product{
	Computer(){
		super(200); //조상클래스의 생성자 호출. Computer가격 200
	}
	
	public String toString() {return "Computer";}
}

//예제2 - 객체의 배열을 위해 Audio 클래스 추가 
class Audio extends Product {
	Audio(){
		super(50);	//Audio의 가격 50
	}
	
	public String toString() {return "Audio";}
}
	

class Buyer {	//고객
	int money = 1000;	//고객이 가진 금액
	int bonusPoint = 0;		//고객의 구매포인트
	
	//예제2 : 다형성(4)
		//객체를 배열로 다루기
		//위의 예제에 배열을 추가하여 코드를 진행한다.
	Product[] item = new Product[10];
	int i = 0;	//위 멤버변수에 사용될 index
	
	//각각의 자손클래스들의 매개변수를 각각 정의하는 것이 아니라 조상클래스의 참조변수로 매개변수를 구성하면
	//조상클래스를 상속받는 자손클래스의 참조변수 어느 것이라도 매개변수로 받을 수 있다!
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;	//Product의 가격만큼 고객의 금액에서 빼기
		bonusPoint += p.bonusPoint;	//Product의 구매포인트만큼 고객의 구매포인트에 추가
		item[i++] = p;	//구매한 제품을 Product[] item에 저장
		System.out.println(p+"구매 완료");
	}
	
	//배열에 담은 제품들의 목록과 가격을 출력하기 위한 메서드 생성
	void summary() {	//구매한 제품 요약
		int sum = 0;	//구매한 제품 가격합계
		String itemList = "";	//구매한 제품 목록
		
		for(int i=0;i<item.length;i++) { //반복문 사용
			if(item[i]==null)
				break;
			sum += item[i].price;	//item배열에 들어간 제품들의 가격 더하기
			itemList += item[i] + ", ";	//구매한 제품들 item배열에 추가하고 itemList 출력할 수 있도록 하기
		}
		System.out.println("구입하신 제품들의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품들은 " + itemList + "입니다.");
	}
}



public class C20230719 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new TV()); //TV클래스 객체를 buy메서드의 매개변수로 넣기
		b.buy(new Computer()); //Computer클래스 객체를 buy메서드의 매개변수로 넣기 
		b.buy(new Audio());	//Audio클래스 객체를 buy메서드의 매개변수로 넣기
		b.summary(); //summary메서드 실행
		
//		System.out.println("현재 남은 금액은 " + b.money + "만원입니다.");
//		System.out.println("현재 구매포인트는 " + b.bonusPoint + "점 입니다.");
	}
}
