package C202308;

class BankAccount {
	//계좌 생성, 입금, 출금, 계좌 정보 출력 기능을 구현
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("계좌번호: " + accountNumber + " / 잔액: " + balance);
    }
}

//Shape 클래스와 이를 상속받는 Circle, Rectangle 클래스를 생성하여 도형의 면적을 구하기
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class C230822 {
	

	public static void main(String[] args) {
		//계좌 생성, 입금, 출금, 계좌 정보 출력 기능을 구현
		BankAccount account = new BankAccount("123-456-789");
	      account.deposit(1000);
	      account.withdraw(500);
	      account.displayAccountInfo();
	      
	    //Shape 클래스와 이를 상속받는 Circle, Rectangle 클래스를 생성하여 도형의 면적을 구하기
	    Shape[] shapes = new Shape[2];
	      shapes[0] = new Circle(5);
	      shapes[1] = new Rectangle(4, 6);

	      for (Shape shape : shapes) {
	          System.out.println("도형 면적: " + shape.getArea());
	      }
	}

}
