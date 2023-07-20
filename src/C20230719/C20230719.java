package mystdy02_innerclass;
//innerClass // 클래스 안에있는 클래스
public class Car {

	private String  name;
	private int price;
	private String brand;
	
	
	//Getter //Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	public void introduce() {
		System.out.println(name+"의 가격은 ="+price);
		System.out.println("브랜드명 ="+brand);
	}
	
	//클래스안의 클래스 //innerclass
	//Car 안에있는 클래스의 메소드이므로
	//Car에 있는 private 속성에도 접근이 가능하다
	public class Customer{
		private String name;
		private int age;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void introduce() {
			System.out.println(name+"님은 "+age+"살입니다");
			System.out.println(brand+"에서 파는것을 삽니다");
			System.out.println("마침내 " +Car.this.name+"을 샀습니다 ");   // 핵심 Car 클래스안의 this로Car 변수를 가져온다. 즉 Car 클래스안의 Customer클래스에서도 접근이가능하다 
		}
		
	}
	
}

