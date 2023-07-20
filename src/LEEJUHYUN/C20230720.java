package LEEJUHYUN;

		//예제 1
		// Parent 클래스 정의
//		class Parent {
//		    String name;
//
//		    // Parent 클래스 생성자
//		    Parent(String name) {
//		        this.name = name;
//		    }
//
//		    // Parent 클래스의 greet() 메서드
//		    void greet() {
//		        System.out.println("Hello, I am " + name + " from Parent class.");
//		    }
//		}
//
//		// Parent 클래스를 상속받는 Child 클래스 정의
//		class Child extends Parent {
//		    int age;
//
//		    // Child 클래스 생성자
//		    Child(String name, int age) {
//		        super(name); // 부모 클래스인 Parent의 생성자 호출, name 매개변수로 전달
//		        this.age = age;
//		    }
//
//		    // Child 클래스에서 오버라이딩된 greet() 메서드
//		    @Override
//		    void greet() {
//		        System.out.println("Hi, I am " + name + " from Child class, and I am " + age + " years old.");
//		    }
//		}
//
//		// Main 클래스
//		public class C20230720 {
//		    public static void main(String[] args) {
//		        // Child 클래스의 객체 생성
//		        Child child = new Child("Alice", 5);
//		        // Child 클래스에서 오버라이딩한 greet() 메서드 호출
//		        child.greet();
//		    }
//		}
		
		
		
		//예제 2
		// Animal 클래스 정의
		class Animal {
		    String species;

		    // Animal 클래스 생성자
		    Animal(String species) {
		        this.species = species;
		    }

		    // Animal 클래스의 makeSound() 메서드
		    void makeSound() {
		        System.out.println("Animal makes a sound.");
		    }
		}

		// Animal 클래스를 상속받는 Dog 클래스 정의
		class Dog extends Animal {
		    String name;

		    // Dog 클래스 생성자
		    Dog(String name) {
		        super("Dog"); // 부모 클래스인 Animal의 생성자 호출, "Dog" 문자열을 species 매개변수로 전달
		        this.name = name;
		    }

		    // Dog 클래스에서 오버라이딩된 makeSound() 메서드
		    @Override
		    void makeSound() {
		        System.out.println("Woof! Woof!");
		    }

		    // Dog 클래스의 fetch() 메서드
		    void fetch() {
		        System.out.println(name + " is fetching.");
		    }
		}

		// Main 클래스
		public class C20230720 {
		    public static void main(String[] args) {
		        // Dog 클래스의 객체 생성
		        Dog dog = new Dog("Buddy");
		        // Dog 클래스에서 오버라이딩한 makeSound() 메서드 호출, "Woof! Woof!" 출력
		        dog.makeSound();
		        // Dog 클래스의 fetch() 메서드 호출, "Buddy is fetching." 출력
		        dog.fetch();
		    }
		}

