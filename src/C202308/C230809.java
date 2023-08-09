package C202308;

public class C230809 {
	 //주어진 문자열에서 모든 공백을 삭제
	 public static String removeWhitespace(String input) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (!Character.isWhitespace(currentChar)) {
	                result.append(currentChar);
	            }
	        }
	        return result.toString();
	    }

	 //정수 배열에서 가장 큰 연속된 부분 배열의 합을 찾는 코드를 작성
	 public static int maxSubarraySum(int[] array) {
	        int maxSoFar = array[0];
	        int currMax = array[0];

	        for (int i = 1; i < array.length; i++) {
	            currMax = Math.max(array[i], currMax + array[i]);
	            maxSoFar = Math.max(maxSoFar, currMax);
	        }

	        return maxSoFar;
	    }
	 
	public static void main(String[] args) {
		//주어진 문자열에서 모든 공백을 삭제
		String input = "Hello, this is a test string with spaces.";
        String output = removeWhitespace(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

        //정수 배열에서 가장 큰 연속된 부분 배열의 합을 찾는 코드를 작성
        int[] input1 = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum sub sum is: " + maxSubarraySum(input1));
	}

}
