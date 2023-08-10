package 이찬진;

public class C20230810 {

	public static void main(String[] args) {

		
		// 100까지의 자연수의 합의 제곱과 제곱의 합의 차이
		
		int x = 0;	//합의제곱
		int y = 0;	//제곱의 합
		
		for(int i=1; i<=100; i++) {
			x += i*i;
			y += i;
		}
		int k = y * y;
		
		
		int z = (k - x);
		System.out.print("1부터 100까지의 자연수의 합의 제곱과 제곱의합의 차이 : " + z);
	}

}
