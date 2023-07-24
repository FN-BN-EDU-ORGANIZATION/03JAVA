package study;

public class C0724 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 숫자 비교하기
//		예제2  프로그래머스 - 나이 출력
		
		
	}
	public int 예제1 (int num1, int num2){	//정수 인자 num1 num2

        if(num1 == num2)		// num1과 num2가 같으면
            return 1;			// 1반환
        else				
            return -1;			// 아니면 -1 반환
		
		
	}
	public int 예제2(int age) {		//정수 인자 age
		int answer = 2022 - age + 1;	// 2022에서 age를 빼고 1을 더하여 출생년도 계산
		return answer;	//출생년도 반환
	}

}
