package study;

import java.util.Arrays;

public class C0814 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 숨어있는 숫자의 덧셈(1)
//		예제2  프로그래머스 - 중앙값 구하기


	}
    public int 예제1(String my_string) {
    	
        my_string = my_string.replaceAll("[a-zA-Z]", "");	//문자열에서 알파벳 문자를 모두 빈 문자열로 변환
        String[] arr = my_string.split("");		//문자열을 한 글짜씩 분리해서 배열에 저장
                
        int answer = 0;			
        for (int i = 0; i < arr.length; i++) 	//i는 0부터 arr의 길이보다 작을 때까지 반복
        {
			answer += Integer.valueOf(arr[i]); 	//arr 배열에 있는 숫자 문자열을 가져와 정수로 변환 후, answer에 더함
		}		
        return answer;
    }
    public int 예제2(int[] array) {
    	
        Arrays.sort(array);		//배열을 오름차운으로 정렬
        
        return array[array.length/2];	//배열의 길이를 2로 나눈 위치에 있는 요소 반환
    }
}
