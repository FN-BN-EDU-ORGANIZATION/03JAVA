package study;

import java.util.Arrays;

public class C0802 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 배열 자르기
//		예제2  프로그래머스 - 배열 뒤집기

	}

	public int[] 예제1(int[] numbers, int num1, int num2) {
		int[] answer = new int[numbers.length];	//numbers 배열의 길이와 같은 배열 answer 초기화

		answer = Arrays.copyOfRange(numbers, num1, num2 + 1);	// answer 배열에 numbers 배열의 num1부터 num2까지의 요소를 복사

		return answer;
	}

	public int[] 예제2(int[] num_list) {
		int[] answer = new int[num_list.length];	//numbers 배열의 길이와 같은 배열 answer 초기화
		for (int i = 0; i < num_list.length; i++) {	//i는 0부터 num_list의 길이보다 작을 때까지 반복
			answer[i] = num_list[num_list.length - i - 1];	//역순으로 저장
		}
		return answer;
	}

}
