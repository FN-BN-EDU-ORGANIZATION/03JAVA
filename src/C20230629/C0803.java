package study;

public class C0803 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 문자 반복 출력하기
//		예제2  프로그래머스 - 점의 위치 구하기

	}

	public String 예제1(String my_string, int n) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) //i는 0부터 my_string의 길이보다 작을 때까지 반복
		{
			for (int j = 0; j < n; j++) //j는 0부터 n까지 반복
			{
				answer += my_string.charAt(i);	//my_string의 i번째 문자를 answer에 추가
			}
		}
		return answer;
	}

	public int 예제2(int[] dot) {
		int answer = 0;
		
		if (dot[0] > 0 && dot[1] > 0) 
		{
			answer = 1;			//둘 다 양수이면 1사분면
		} 
		else if (dot[0] < 0 && dot[1] > 0) 
		{
			answer = 2;			//dot[0]이 음수이고 dot[1]이 양수이면 2사분면
		} 
		else if (dot[0] < 0 && dot[1] < 0) 
		{
			answer = 3;			//둘 다 음수이면 3사분면
		} 
		else if (dot[0] > 0 && dot[1] < 0) 
		{
			answer = 4;			//dot[1]이 음수이고 dot[0]이 양수이면 4사분면
		}
		return answer;
	}

}
