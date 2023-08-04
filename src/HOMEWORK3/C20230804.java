package HOMEWORK3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
	//의문점
	//정리
		//갑자기 너무 어려워진 것 같은 느낌이다..
		//반은 이해하고 반은 이해를 못했으니까 한번 더.. 공부해봐야겠다..!
	//예제1 : Generic 와일드 카드(extends) - FruitBox의 요소들이 Fruit의 자손
		//제네릭 타입이 다른 것만으로는 오버로딩이 성립하지 않기 때문에 메서드 중복 정의가 된다.
		//이 때 와일드카드(?)를 사용하면 어떠한 타입도 될 수 있기 때문에 하나의 메서드를 정의하고 여러타입의 매개변수를 사용할 수 있게 된다.
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
//class Juice {
//	String name;
//	Juice(String name) {this.name = name + "Juice";}
//	public String toString() {return name;}
//	}
//
//class Juicer{
//	static Juice makeJuice(FruitBox<? extends Fruit> box) { //Fruit와 Fruit를 상속받은 자식클래스만 가능!
//		String tmp = "";
//		for(Fruit f : box.getList())
//			tmp += f + " "; //box의 요소가 Fruit의 자식클래스라는 보장이 없기 때문에 에러!
//		return new Juice(tmp);
//	}
//}


	//예제2 : Generic 와일드 카드(super) - 조상이 가능하다
		//제네릭 타입이 다른 것만으로는 오버로딩이 성립하지 않기 때문에 메서드 중복 정의가 된다.
		//이 때 와일드카드(?)를 사용하면 어떠한 타입도 될 수 있기 때문에 하나의 메서드를 정의하고 여러타입의 매개변수를 사용할 수 있게 된다.
class Fruit {
	String name;
	int weight;
	
	Fruit(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {return name+"("+weight+")";}
}

class Apple extends Fruit{
	Apple(String name, int weight){
		super(name, weight);
	}
}

class Grape extends Fruit{
	Grape(String name, int weight){
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {	//t1, t2 비교해서 오름차순으로 정렬	
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {	//t1, t2 비교해서 오름차순으로 정렬	
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {	//t1, t2 비교해서 오름차순으로 정렬	
		return t2.weight - t1.weight;
	}
}


public class C20230804 {
	public static void main(String[] args) {
	//예제1 출력
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		
//		System.out.println(Juicer.makeJuice(fruitBox));
//		System.out.println(Juicer.makeJuice(appleBox));
//	}
//}
//
//class FruitBox<T extends Fruit> extends Box<T>{}
//
//class Box<T>{
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) {list.add(item);}
//	T get(int i) {return list.get(i);}
//	ArrayList<T> getList() {return list;}
//	int size() {return list.size();}
//	public String toString() {return list.toString();}
//	}
		

	//예제2 출력
	FruitBox<Apple> appleBox = new FruitBox<Apple>();
	FruitBox<Grape> grapeBox = new FruitBox<Grape>();
	
	appleBox.add(new Apple("GreenApple", 300));
	appleBox.add(new Apple("GreenApple", 100));
	appleBox.add(new Apple("GreenApple", 200));

	grapeBox.add(new Grape("GreenGrape", 400));
	grapeBox.add(new Grape("GreenGrape", 300));
	grapeBox.add(new Grape("GreenGrape", 200));
	
	Collections.sort(appleBox.getList(), new AppleComp()); //appleBox의 내용을 AppleComp으로 오름차순 정렬
	Collections.sort(grapeBox.getList(), new GrapeComp()); //grapeBox의 내용을 GrapeComp로 오름차순 정렬
	System.out.println(appleBox);
	System.out.println(grapeBox);
	System.out.println();
	Collections.sort(appleBox.getList(), new FruitComp()); //appleBox의 내용을 FruitComp으로 오름차순 정렬
	Collections.sort(grapeBox.getList(), new FruitComp()); //grapeBox의 내용을 FruitComp으로 오름차순 정렬
	System.out.println(appleBox);
	System.out.println(grapeBox);
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){return list;}
	
	int size() {return list.size();	}
	
	public String toString() { return list.toString();}
}