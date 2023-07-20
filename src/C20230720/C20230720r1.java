package mystudy02_exception;

public class myjava03_Finally {

	public static void main(String[] args) {
		
			try {
				int a =10;
				int b =0;
				System.out.println("a="+a+"b"+b);
				int c = a/b;
				System.out.println(c);
			} catch (Exception e) {
				System.out.println("끝");
				return; //여기서 강종 // return있기때문에 다음꺼 실행 x  //그래도 finally 는 무적권 실행 // 
			} finally {
				System.out.println("여기는 무적권 실행 ");
			}
			System.out.println("종료");
	}

}
