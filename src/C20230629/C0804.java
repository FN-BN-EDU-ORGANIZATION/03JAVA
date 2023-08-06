package study;

import java.util.Arrays;

public class C0804 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 피자 나눠 먹기(3)
//		예제2  프로그래머스 - 

	}
	public int 예제1(int slice, int n) {
        int answer = 0;
        
        if(n % slice ==0)		//n을 slice로 나눈 나머지가 0이면
        {
        	answer = n / slice;	//n/slice 몫을 저장
        }
        else
        {
        	answer = n / slice + 1;	//아니면 몫에 1을 더한 값 저장
        }
        return answer;
	}
    public int 예제2(int[] numbers) {
    	
        Arrays.sort(numbers);	//배열을 오름차순으로 정렬
        return numbers[numbers.length-1]* numbers[numbers.length-2]; //배열의 마지막 값 * 마지막 -1 값
    }
}
