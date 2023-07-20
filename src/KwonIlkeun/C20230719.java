package KwonIlkeun;

public class C20230719 {
//try catch finally
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println("a="+a+",b="+b);
			int c = a/b;
			System.out.println(c);
		}catch(Exception e){
			System.out.println("끝");
			return;
		}finally {
			System.out.println("여기껀 꼬옥 수행함");
		}
		System.out.println("프로그램 종료");
		
	}

}