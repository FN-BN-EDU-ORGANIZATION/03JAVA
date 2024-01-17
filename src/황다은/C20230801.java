package 황다은;

import java.util.Scanner;

public class C20230801 {
	public static void main(String[] args) {
		//직각삼각형의 빗변의 길이구하기
		//직각 삼각형의 빗변이 아닌 두변의 길이를 입력받아 빗변의 길이를 구하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("빗변이 아닌 두변의 길이를 입력하시오");
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		int rs = (int) Math.sqrt(height*height + width*width);
		System.out.println("직각삼각형의 빗변의 길이는 " + rs +"입니다.");
		
		//서울에서 대구까지 자동차로 시속 80킬로미터로 달렸을 경우 몇시간 몇분정도가 걸릴까?
		//서울에서 대구까지 거리는 약 430킬로미터이다.(정답 : 5시간 30분)
		
		int hour;
		int min;
		
		hour=430/80;
		min=430%80;
		System.out.println(hour+"시간"+min+"분");
	}
}
