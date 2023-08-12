package study;

public class C0811 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 자릿수 더하기
//		예제2  프로그래머스 - 모음 제거

	}

	public int 예제1(int n) {
		int answer = 0;

		while (n > 0) 	//n이 양수인 동안 반복
		{
			answer += n % 10;	//n의 가장 오른쪽 자리 숫자를 answer에 더함
			n /= 10;	//n을 오른쪽 한 자리씩 이동하여 다음 자리 숫자를 처리
		}
		return answer;
	}

	public String 예제2(String my_string) {
		String answer = "";
		answer = my_string.replaceAll("[aeiou]", "");	//aeiou을 빈 문자열로 대체

		return answer;
	}

}
