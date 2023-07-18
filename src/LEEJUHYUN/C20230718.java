package LEEJUHYUN;


		//예제1
		// 부모 클래스 (Superclass)
//		class Animal {
//		    String name;
//		    
//		    // Animal 클래스의 생성자, name을 인자로 받아 초기화
//		    public Animal(String name) {
//		        this.name = name;
//		    }
//		    
//		    // 동물 소리를 출력하는 메서드
//		    public void sound() {
//		        System.out.println("동물 소리를 내는 중!");
//		    }
//		}
//
//		// 자식 클래스 (Subclass)
//		class Dog extends Animal {
//		    // Dog 클래스의 생성자, name을 인자로 받아 부모 클래스의 생성자 호출하여 초기화
//		    public Dog(String name) {
//		        super(name); // 부모 클래스의 생성자 호출
//		    }
//		    
//		    // 부모 클래스의 sound 메서드를 오버라이딩하여 개 소리를 출력하도록 재정의
//		    @Override
//		    public void sound() {
//		        System.out.println(name + "가 멍멍 소리를 내고 있습니다!");
//		    }
//		    
//		    // 꼬리를 흔드는 동작을 출력하는 메서드
//		    public void wagTail() {
//		        System.out.println(name + "가 꼬리를 흔듭니다!");
//		    }
//		}
//
//		// 자식 클래스 (Subclass)
//		class Cat extends Animal {
//		    // Cat 클래스의 생성자, name을 인자로 받아 부모 클래스의 생성자 호출하여 초기화
//		    public Cat(String name) {
//		        super(name); // 부모 클래스의 생성자 호출
//		    }
//		    
//		    // 부모 클래스의 sound 메서드를 오버라이딩하여 고양이 소리를 출력하도록 재정의
//		    @Override
//		    public void sound() {
//		        System.out.println(name + "가 야옹 소리를 내고 있습니다!");
//		    }
//		    
//		    // 꼬리를 흔드는 동작을 출력하는 메서드
//		    public void purr() {
//		        System.out.println(name + "가 꼬리를 흔듭니다!");
//		    }
//		}
//
//		// 메인 클래스
//		public class C20230718 {
//		    public static void main(String[] args) {
//		        // Dog 객체 생성, 이름을 "멍멍이"로 초기화
//		        Dog dog = new Dog("멍멍이");
//		        dog.sound();     // 멍멍이가 멍멍 소리를 내고 있습니다!
//		        dog.wagTail();   // 멍멍이가 꼬리를 흔듭니다!
//
//		        // Cat 객체 생성, 이름을 "야옹이"로 초기화
//		        Cat cat = new Cat("야옹이");
//		        cat.sound();     // 야옹이가 야옹 소리를 내고 있습니다!
//		        cat.purr();      // 야옹이가 꼬리를 흔듭니다!
//		    }
//		}
		
//		정리 : 부모 클래스인 Animal과 자식 클래스인 Dog와 Cat을 정의하고, 메인 클래스에서 객체를 생성하여 사용하는 예제
		
		
		//예제 2
		// 부모 클래스 (Superclass)
		class Shape {
		    protected double area; // 도형의 면적
		    
		    // Shape 클래스의 생성자, 면적 초기화
		    public Shape() {
		        this.area = 0.0;
		    }
		    
		    // 도형의 면적을 계산하는 메서드
		    public void calculateArea() {
		        System.out.println("도형의 면적을 계산하는 중!");
		    }
		    
		    // 도형의 면적을 출력하는 메서드
		    public void displayArea() {
		        System.out.println("도형의 면적: " + area);
		    }
		}

		// 자식 클래스 (Subclass)
		class Rectangle extends Shape {
		    private double width; // 사각형의 가로 길이
		    private double height; // 사각형의 세로 길이
		    
		    // Rectangle 클래스의 생성자, 가로와 세로 길이를 인자로 받아 초기화
		    public Rectangle(double width, double height) {
		        this.width = width;
		        this.height = height;
		    }
		    
		    // 부모 클래스의 calculateArea 메서드를 오버라이딩하여 사각형의 면적을 계산
		    @Override
		    public void calculateArea() {
		        area = width * height;
		    }
		}

		// 자식 클래스 (Subclass)
		class Circle extends Shape {
		    private double radius; // 원의 반지름
		    
		    // Circle 클래스의 생성자, 반지름을 인자로 받아 초기화
		    public Circle(double radius) {
		        this.radius = radius;
		    }
		    
		    // 부모 클래스의 calculateArea 메서드를 오버라이딩하여 원의 면적을 계산
		    @Override
		    public void calculateArea() {
		        area = Math.PI * radius * radius;
		    }
		}

		// 메인 클래스
		public class C20230718 {
		    public static void main(String[] args) {
		        // Rectangle 객체 생성, 가로 5.0, 세로 3.0으로 초기화
		        Rectangle rectangle = new Rectangle(5.0, 3.0);
		        rectangle.calculateArea();
		        rectangle.displayArea(); // 도형의 면적: 15.0
		        
		        // Circle 객체 생성, 반지름 2.5로 초기화
		        Circle circle = new Circle(2.5);
		        circle.calculateArea();
		        circle.displayArea(); // 도형의 면적: 19.634954084936208
		    }
		}
		
//		정리 : "Shape"라는 부모 클래스를 정의하고, "Rectangle"과 "Circle"이라는 자식 클래스들이 이를 상속받는 예제

