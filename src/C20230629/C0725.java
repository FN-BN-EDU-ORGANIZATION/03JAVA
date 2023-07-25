package study;

public class C0725 {

	public static void main(String[] args) {
		
		
//		예제1  프로그래머스 - 두 수의 나눗셈
//		예제2  프로그래머스 - 배열 두 배 만들기
	}
	public int 예제1(int num1, int num2) {
		
		double answer = (double)num1 / num2 * 1000;		//num1을 double 타입으로 변환한 후 num2로 나눈다
		return (int)answer;	//answer 값을 다시 int형으로 변환
	}
	
	
	public int[] 예제2(int[] numbers) {
		
        int[] answer = new int[numbers.length]; //int 배열 answer를 numbers 배열의 길이만큼 생성 

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; 		//number 배열의 각 요소에 2를 곱한 값을 저장
        }
        return answer;
		
		
		
	}

}
