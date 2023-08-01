package C202308;

import java.util.Arrays;

public class C230801 {
	//주어진 문자열의 모든 공백을 제거하는 함수를 작성
	public static String removeSpaces(String input) {
        return input.replace(" ", "");
    }
	
	//주어진 정수 배열에서 가장 큰 숫자와 두 번째로 큰 숫자의 차이를 반환하는 함수를 작성
	 public static int differenceBetweenTwoLargestNumbers(int[] numbers) {
	        Arrays.sort(numbers);
	        int largestNumber = numbers[numbers.length - 1];
	        int secondLargestNumber = numbers[numbers.length - 2];
	        return largestNumber - secondLargestNumber;
	    }
	public static void main(String[] args) {
		//주어진 문자열의 모든 공백을 제거하는 함수를 작성
		 String input = "Hello World from Wrtn";
	     String result = removeSpaces(input);
	     System.out.println(result);

	    //주어진 정수 배열에서 가장 큰 숫자와 두 번째로 큰 숫자의 차이를 반환하는 함수를 작성
	     int[] numbers = {12, 34, 87, 25, 69};
	     int result1 = differenceBetweenTwoLargestNumbers(numbers);
	     System.out.println(result1);
	}

}
