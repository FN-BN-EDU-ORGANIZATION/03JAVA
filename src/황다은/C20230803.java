package 황다은;

public class C20230803 {
	public static void main(String[] args) {
		// 첫번째 문제
//		int n=100;
//		int sumOfSquares = 0;
//		int squareOfSum=0;
//		
//		// 1부터 n까지 자연수의 제곱의 합을 계산
//		for(int i =1; i<=n;i++) {
//			sumOfSquares += i*i;
//		}
//		
//		//1부터 n까지 자연수를 더한 다음 제곱
//		int sum = n * (n + 1) / 2;
//        squareOfSum = sum * sum;
//        
//        //차이 계산
//        int difference = squareOfSum - sumOfSquares;
//        System.out.println(difference);
		
		//2번째 문제
//		int [] arr = new int[6];
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*45+1);
//			for(int j =0; j<i;j++) {
//				if(arr[j]==arr[i]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		//3번째 문제
		
//		for(int i=0; i<=10000;i++) {
//			searchEight(i);
//		}
//		System.out.println("1에서 10,000사이에 존재하는 8의 총 개수는: " +cnt);
		
		//다른풀이
		int count =0;
		for(int i=1;i<10000;i++) {
			if(i%10==8)
				count++;
			if((i/10)%10==8) 
				count++;
			if((i/100)%10==8) 
				count++;
			if((i/1000)%10==8) 
				count++;
		}
		System.out.println("1에서 10,000사이에 존재하는 8의 총 개수는: " +count);
		
	}
	 private static int cnt = 0;
	 public static void searchEight(int num) {
		if(num% 10 == 8) cnt++;
		if(num>10) searchEight(num/10);
	}
	
}
