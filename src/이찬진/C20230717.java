package 이찬진;

import java.util.Scanner;

public class C20230717 {

	public static void main(String[] args) {
		
		//예제1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점 (x,y)의 좌표를 입력하세요>>  ");
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if(x > 50 && x < 100 && y > 50 && y < 100) {
//			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 '사각형 내'에 있습니다") ;
//		}
//		else {
//			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 '사각형 밖'에 있습니다.");
//		}
//		sc.close();
		
		//예제2
		//음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in); // 사용자로부터 데이터를 입력받는다.
		System.out.print("커피를 주문하세요.>>  ");
		
		String coffee = sc.next(); // String은 next()로 입력받는다.
		int num = sc.nextInt();
		
		if (coffee.equals("에스프레소"))
		{
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2000;
			System.out.println("가격은"+num+"원 입니다.");
		}
		else if (coffee.equals("아메리카노"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 2500;
			System.out.println("가격은"+num+"원 입니다.");
		}
		else if (coffee.equals("카푸치노"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+","+num+"잔이며,");
			num *= 3000;
			System.out.println("가격은"+num+"원 입니다.");
		}
		else if (coffee.equals("카페라떼"))
		{
			
			System.out.println("주문하신 커피는 "+coffee+", "+num+"잔이며,");
			num *= 3500;
			System.out.println("가격은 "+num+"원 입니다.");
		}
		else
		{
			System.out.print("주문하신 메뉴는 없습니다.");
		}
		
		sc.close();
	}

}
