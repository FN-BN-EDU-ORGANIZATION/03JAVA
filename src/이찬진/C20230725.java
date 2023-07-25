package 이찬진;

public class C20230725 {

	public static void main(String[] args) {

		// 예제1
		// 배열을 이용하여 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면
		// 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성하세요.

//				int Max_size = 100;
//				int[] num = new int[Max_size];
//				int count = 0;
//				
//				Scanner sc = new Scanner(System.in);
//				
//				// 최대 100개 까지 정수 입력
//				System.out.println("정수를 입력하세요 (0 입력시 종료) : ");
//				while(count < Max_size) {
//					int input = sc.nextInt();
//					if(input == 0) {
//						break;
//					}
//					num[count] = input;
//					count++;
//				}
//				System.out.println("짝수 번째에 입력된 정수들 : ");
//				for(int i=1;i<count; i+=2) {
//					System.out.println(num[i]);
//				}
//				sc.close();
		
		
		//예제2
		// 1부터 100 까지의 숫자를 보여주되 3과 5로 모두 나누어지는 경우
		// "짝!! 뽀숑!!" 
		// 3으로 나누어지는 경우 "짝!!"  
		// 5로 나누어지는 경우 "뽀숑!!" 이 숫자 대신 나오는 코드 작성 
		
//		for(int i = 1; i<=100; i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.println("짝!! 뽀숑!!");
//			}else if(i%3==0) {
//				System.out.println("짝!!");
//			}else if(i%5==0) {
//				System.out.println("뽀숑!!");
//			}else {
//				System.out.println(i);
//			}
//		}
		

	}

}
