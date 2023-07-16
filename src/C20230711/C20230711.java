package C20230711;

/*<추상 클래스(abstract class)>
 - 객체를 직접 생성할 수 없다
 - 다른 클래스들이 상속받아 기능을 확장하고 구현할 수 있는 클래스
 - 일반적인 클래스와는 달리 추상 메서드를 포함할 수 있다
<사용법>
-추상 클래스를 정의할 때는 abstract 키워드를 클래스 선언 앞에 붙여야 한다
-추상 클래스 내부에는 구현을 갖지 않는 추상 메서드를 선언할 수 있다
- 추상 메서드는 메서드 시그니처만을 가지고 실제 실행 코드가 없기 때문에
  하위 클래스에서 반드시 구현해야 한다*/
public class C20230711 {

    public static void main(String[] args) {
        // 추상 클래스의 인스턴스를 생성할 수 없습니다.
        // Shape shape = new Shape(); // 에러 발생

        // Circle 클래스의 인스턴스 생성
        Circle circle = new Circle(5.0);
        System.out.println("원의 이름: " + circle.getName());
        System.out.println("원의 반지름: " + circle.getRadius());
        System.out.println("원의 넓이: " + circle.calculateArea());

        // Rectangle 클래스의 인스턴스 생성
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("사각형의 이름: " + rectangle.getName());
        System.out.println("사각형의 가로: " + rectangle.getWidth());
        System.out.println("사각형의 세로: " + rectangle.getHeight());
        System.out.println("사각형의 넓이: " + rectangle.calculateArea());
    }
}

// 추상 클래스 Shape 선언
abstract class Shape {
    private String name;

    // 추상 메서드 선언 - 하위 클래스에서 반드시 구현해야 함
    public abstract double calculateArea();

    // 일반 메서드 - 추상 클래스에서 구현
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Circle 클래스는 Shape 클래스를 상속받음
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        setName("원");
    }

    public double getRadius() {
        return radius;
    }

    // 추상 메서드를 오버라이딩하여 구체적인 내용을 구현
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle 클래스는 Shape 클래스를 상속받음
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        setName("사각형");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // 추상 메서드를 오버라이딩하여 구체적인 내용을 구현
    @Override
    public double calculateArea() {
        return width * height;
    }
}
