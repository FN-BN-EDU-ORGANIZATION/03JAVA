package 이찬진;

import java.util.Scanner;

public class C20230718 {

	//예제1
//public static void ex1() {
//	String sub[] = new String[0];
//	String inp = "";
//	Scanner sc = new Scanner(System.in);
//	
//	while(true) {
//		System.out.print("추가할 과목을 입력 : ");
//		inp = sc.nextLine();
//		
//		if(inp.equals("종료")) {
//			break;
//		}else {
//			String sub2[] = new String[sub.length +1];
//			for(int i=0;i<sub.length;i++) {
//				sub2[i] = sub[i];
//			}
//			sub = sub2;
//			sub[sub.length -1] = inp;
//		}
//	}
//	for(int i=0; i<sub.length; i++) {
//		System.out.print("추가한 "+ (i+1)+" 번째 과목 :" + sub[i]);
//		System.out.println();
//	}
//}
//public static void main(String[] args) {
//	ex1();
//}

	public static void main(String[] args) {
		
		//예제2
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				int cal = 4*i +5*j;
				if(cal == 60) {
					System.out.printf("(%d, %d)\n", i,j);
				}
			}
		}
	}
}
