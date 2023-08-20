package study;

public class C0816 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 짝수는 싫어요
//		예제2  프로그래머스 - 제곱수 판별하기

	}

	public int[] 예제1(int n) {

		int[] answer = {};

		if (n % 2 == 1)	//n이 홀수라면
			answer = new int[n / 2 + 1];	//n이 홀수인 경우 배열 크기를 n/2+1로 설정
		else
			answer = new int[n / 2];	//n이 짝수인 경우 배열 크기를 n/2로 설정

		int cnt = 0;
		for (int i = 1; i <= n; i++) 
		{
			if (i % 2 == 1) 
			{
				answer[cnt] = i;	// 홀수 값을 배열에 저장
				cnt++;
			}
		}

		return answer;
	}

	public int 예제2(int n) {
		if (Math.sqrt(n) % 1 == 0) // n의 제곱근이 정수라면
		{
			return 1;		//1 반환
		} 
		else	//아니라면 
		{
			return 2;	//2 반환
		}

	}

}
