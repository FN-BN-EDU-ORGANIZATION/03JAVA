package HomeWork.C20230808;

class A{
	int x;
	int y;
	@Override
	public String toString() {
		return "x="+x+" y="+y;
	}
	
}

public class C20230808 {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		//toString은 재정의해서 형태를 변경가능함.
		
		A obj2 = new A();
		System.out.println(obj2);
		System.out.println(obj2.toString());
	}
}
