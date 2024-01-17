package 황다은;

public class C20230804 {
	public static void main(String[] args) {
		//중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하시오. 
		//단, x와 y는 10이하의 자연수입니다. (출처 : 이것이 자바다 p134 5번 문제)
		System.out.println("문제1");
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
		System.out.println();
		System.out.println("문제2");
		//for문을 이용해서 직각삼각형을 출력하는 코드를 작성하시오. 
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		//while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 
		//나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 
		//눈의 합이 5이면 실행을 멈추는 코드를 작성하시오.
		System.out.println("문제3");
		
		while(true) {
			int i=(int) (Math.random()*6+1);
			int j=(int) (Math.random()*6+1);
			if(i+j==5) {
				System.out.println("("+i+","+j+")");
				break;
			}
			System.out.println("("+i+","+j+")");
		}
		
		
		
		
	}
}
