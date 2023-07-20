package mystdy02_innerclass;

public class myjava01_useInnerOuter {

	public static void main(String[] args) {
			//서순중요 Car 클래스안에 customer클래스가 있기때문에//Car를 거쳐서 cutomeer호출가능
			Car c= new Car();
			Car.Customer customer =  c.new Customer();
			
			//세터 값설정
			c.setBrand("제네시스");
			c.setName("G80");
			c.setPrice(7000);
			customer.setAge(34);
			customer.setName("이동준");
			
			c.introduce();
			customer.introduce();
//			Customer a = new Customer(); 불가능 !! //Car를 거쳐야한다 inner class
			
			

	}

}
