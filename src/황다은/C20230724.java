package 황다은;
//생성자-기본생성자
//생성자란?	
// : 인스턴스 초기화 메서드(인스턴스변수들을 초기화 하는 메서드)이다.
//생성자는 클래스 내에 선언되며 리턴값이 없다.

//생성자 조건
//1. 생정자의 이름은 클래스의 이름과 같아야 한다.
//2. 생성자는 리턴값이 없다.(생성자도 메서드이기때문에 리턴값이 없다는 의믜의 void를 붙여야 하지만
//					 ,모든 생성자는 리턴갑이 없으므로 void생략항다.
//3. 모든 클래스는 반드시 생성자를 가져야 한다.


//생성자 정의 예시
class Card{
	Card(){	//매게변수가 없는 생성자(기본생성자)
		//...
	}
	Card(String k, int num){	//매개변수가 있는 생성자
		//...
	}
}

//기본생성자(default constructor
//: 매개변수가 없는 생성자
//	생성자가 하나도 없을때 만 컴파일러가 자동 추가

//기본생성자 예시
class Data_1{
	int value;
}
class Data_2{
	int value;
	
	Data_2(int x){		//매개변수 있는 생성자
		value = x;
	}
}
//매게변수 있는 생성자
//생성자도 메서드처럼 매개변수를 선언하여 호출 시 값을 넘겨받아 인스턴스의 초기화 작업에 사용가능

//매개변수생성자 ㅇㅖㅅ;
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}	//기본생성자
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
public class C20230724 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();//생성자가 하나도 없으므로 자동으로 추가되어서 사용 가능
		//Data_2 d2 = new Data_2();//컴파일에러
		//에러인 이유 : 기본생성자를 생성하지 않고 매개변수있는 생성자만 있어 기본생성자가 자동으로 추가가 안되므로
		//			인스턴스가 생성되지 않는다. 에러가 나지 않게 하려면 기본생성자를 추가하거나
		Data_2 d2 = new Data_2(13);// 이런식으로 매개변수값을 주면 에러가 생기지 않는다.
		
		
		Car c = new Car("Black", "auto", 4);
		System.out.println("Car의 색상 "+c.color);
		
	}
}
