package 자바내용정리;
//기본형 매개변수

class Dat{
	int x;
}

public class 자바0714 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("메인에서 x : "+d.x);
		
		change(d.x);
		System.out.println("change실행 후 x : "+d.x);
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() 에서 x : "+x);
	}

}
