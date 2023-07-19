package JaewonStudy;

public class C20230719 {
	// 의문점
	//정리 

				
//	예제 1 - 다운캐스팅
	
	class Car {
	    public void drive() {
	        System.out.println("Drive!");
	    }
	}

	class SportsCar extends Car {
	    public void race() {
	        System.out.println("Racing!");
	    }
	}
	
	public static void main(String[] args) {
	    Car car = new SportsCar();
        SportsCar sportsCar = (SportsCar) car; // 부모 클래스가 자식 클래스로 묵시적 다운캐스팅됩니다.

        car.drive();
        sportsCar.drive();
        sportsCar.race();
    }


	
//	예제 2 - 업캐스팅
	class Animal {
	    public void eat() {
	        System.out.println("Nom nom nom");
	    }
	}

	class Dog extends Animal {
	    public void bark() {
	        System.out.println("Bark bark!");
	    }
	}
    public static void main(String[] args) {
        Animal animal = new Dog(); // 자식 클래스가 부모 클래스로 묵시적 업캐스팅됩니다.
        animal.eat();

        Dog dog = (Dog) animal; // 다시 자식 클래스로 캐스팅하는 것도 가능합니다.
        dog.bark();
    }
	
}
