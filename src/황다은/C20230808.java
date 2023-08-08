package 황다은;

//생성자 this(), 참조변수 this
//같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능
//단, 두 조건만족 시켜야함
//1. 생성자의 이름으로 클래스이름 대신 this를 사용
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능

//class Car{
//	String color;		// 색상
//	String gearType;	// 변속기 종류 
//	int door;			// 문의 개수
//	
//	Car(){
//		this("white","auto",4); //Car(String color, String gearType, int door)를 호출
//	}
//	Car(String color){
//		this(color,"auto",4);
//	}
//	Car(String color, String gearType, int door){
//		this.color=color;
//		this.gearType=gearType;
//		this.door=door;
//	}
//}
// 위와 보이는거같이 this를 사용하면 코드가 더 간략해 진다.
// 같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 이처럼 서로 호출하도록 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있다.
// 수정이 필요한 경우에도 보다 적은 코드만을 변경하면 되므로 유지보수가 쉬워진다.

public class C20230808 {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		Car c2 = new Car("blue");
		
		//참조변수 this
		// this 인스턴스 자신을 가르키는 참조변수, 인스턴스의 주소가 저장되어 있다.
		// 모든 인스턴스메서드에 지역변수로 숨겨진채로 존대
		// this(),this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
	}

}
