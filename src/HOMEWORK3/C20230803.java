package HOMEWORK3;

import java.util.ArrayList;

//의문점
	//정리
		//Generics는 다양하게 사용되고 있기 때문에 확실히 알아두어야 한다..
		//당장 프로젝트를 할 때만 해도 많이 사용하고 있었기 때문에~
	//예제1 : Generics
		//다양한 타입의 객체들을 다루는 메서드나 클래스에 컴파일 시 타입체크를 해주는 기능
		//객체의 타입 안정성을 높이고 형변환의 번거로움을 줄인다.
		//참조변수와 매개변수화된 타입이 일치해야 한다.
//class Fruit{
//	public String toString() {return "Fruit";}
//}
//
//class Apple extends Fruit{
//	public String toString() {return "Apple";}
//}
//
//class Grape extends Fruit{
//	public String toString() {return "Grape";}
//}
//
//class Toy {
//	public String toString() {return "Toy";}
//}
//
//class Box<T>{
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) {list.add(item);}
//	T get(int i) {return list.get(i);}
//	int size() {return list.size();}
//	public String toString() {return list.toString();}
//}


	//예제2 : Generics
		//매개변수 T에 지정할 수 있는 타입의 종류를 제한할 수 있다!
		//제네릭타입에 extends를 사용하면 특정 타입의 자손들만 대입할 수 있게 제한할 수 있다.
class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit{
	public String toString() {return "Apple";}
}

class Grape extends Fruit{
	public String toString() {return "Grape";}
}

class Toy {
	public String toString() {return "Toy";}
}

interface Eatable{}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
//인터페이스를 구현해야할 때에도 implements가 아니고 extends를 쓴다!

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}


public class C20230803 {
	public static void main(String[] args) {
	//예제1 출력
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();
////		Box<Grape> grapeBox = new Box<Apple>(); - 타입 불일치로 에러!
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple()); //상속관계이기 때문에 매개변수 가능!
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
////		appleBox.add(new Toy()); //Box<Apple>에는 Aplple만 담을 수 있다!
//		
//		toyBox.add(new Toy());
////		toyBox.add(new Apple()); //Box<Toy>에는 Toy만 담을 수 있다!
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);		
		
	//예제2 출력
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); - 타입 불일치로 에러!
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); - FruitBox는 Fruit 클래스와 Eatable 인터페이스를 상속받는데, Toy는 Fruit클래스를 상속받고 있지 않기 때문에 에러!
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //상속관계이기 때문에 매개변수 가능!
		fruitBox.add(new Grape()); 
		appleBox.add(new Apple()); 
//		appleBox.add(new Grape()); //Grape는 Apple을 상속받지 않기 때문에 불가능~
		grapeBox.add(new Grape()); 
		
		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);		
	}

}
