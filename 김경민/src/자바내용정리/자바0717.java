package 자바내용정리;

class Data{
	int x;
}

public class 자바0717 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("메인에서 x : "+d.x);
		
		change(d);
		System.out.println("change실행 후 x : "+d.x);
		
		
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() 에서 x : "+d.x);
	}

}