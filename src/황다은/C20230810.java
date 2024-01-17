package 황다은;

import java.util.Scanner;

public class C20230810 {
	public static void main(String[] args) {
		//문제 1
//		int[] arr = new int[10];
//		int mcnt =0;
//		int hcnt = 0;
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*1000+1);
//			if(arr[i]%2==0) {
//				mcnt++;
//			}else {
//				hcnt++;
//				
//			}
//			
//			System.out.println(arr[i]);
//		}
//		System.out.println("짝수 개수"+mcnt);
//		System.out.println("홀수 개수"+hcnt);
		
		//문제 2
		//랜덤으로 1부터 45까지 무작위로 섞인 6개의 숫자와 1개의 보너스숫자를 당첨번호를 생성해 저장한뒤
		//로또를 몇개살지 입력받고, 입력된 번호의 수에따라 랜덤으로 뽑힌 번호를 당첨번호와 비교한 뒤
		//당첨이 되면 당첨된 번호와 축하의 말을 출력해주자
		//예시> 로또를 몇개 구매하시겠습니까? 5
		
//		int[] arr = new int[7];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("로또 몇개 구하십니까?");
//		int num = sc.nextInt();
//		
//		for(int i=0; i<num; i++) {
//			for(int k = 0; k<arr.length-1;k++) {
//			arr[k]= (int)(Math.random()*45+1);
//			for(int j=0;j<k;j++) {
//				if(arr[j]==arr[k]) {
//					k--;
//					break;
//				}
//			}
//			System.out.print(arr[k]+" ");
//			//System.out.println("보너스 번호"+arr[7]);
//			}
//			
//			System.out.println("");
//			
//		}
		//1 풀이 1
//		int n=100;
//		int sumOfSquares = 0;
//		int squareOfSum=0;
//		// 1부터 n까지 자연수의 제곱의 합을 계산
//		for(int i =1; i<=n;i++) {
//		sumOfSquares += i*i;
//		}
//		//1부터 n까지 자연수를 더한 다음 제곱
//		int sum = n * (n + 1) / 2;
//		squareOfSum = sum * sum;
//		//차이 계산
//		int difference = squareOfSum - sumOfSquares;
//		System.out.println(difference);
	
		
		//1 풀이2
//		int n = 100;
//		int sumOfSquares = 0;
//		int squareOfSum = 0;
//		// 1부터 n까지 자연수의 제곱의 합과 합의 제곱을 계산
//		for (int i = 1; i <= n; i++) {
//		sumOfSquares += i * i;
//		squareOfSum += i;
//		}
//		squareOfSum = squareOfSum * squareOfSum;
//		// 차이 계산
//		int difference = squareOfSum - sumOfSquares;
//		System.out.println(difference );
		
		// 문제3 풀이1
//		int count =0;
//		for(int i=1;i<10000;i++) {
//		if(i%10==8)
//		count++;
//		if((i/10)%10==8)
//		count++;
//		if((i/100)%10==8)
//		count++;
//		if((i/1000)%10==8)
//		count++;
//		}
//		System.out.println("1에서 10,000사이에 존재하는 8의 총 개수는: " +count);
		
		//문제3 풀이2
		for(int i=0; i<10000;i++){
			searchEight(i); //메서드 사용
		}
		System.out.println("1에서 10,000사이에 존재하는 8의 총 개수는: " +cnt);
		}
		private static int cnt = 0;
		public static void searchEight(int num) {
		if(num% 10 == 8) cnt++;
		if(num>10) searchEight(num/10);
		
		
	}
}
