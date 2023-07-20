package HomeWork.C20230720;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C20230720 {

	// 정수형 배열이 주어지면 배열의 요소 중에서 중복된 값을 찾아서 해당 값을 배열에서 제거한 후 결과 배열을 반환하는 메소드를 작성하세요.
	// 결과 배열은 중복된 값이 제거된 이후의 배열 순서를 유지해야 합니다.

	public static int[] removeDuplicates(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		List<Integer> result = new ArrayList<>();

		for (int num : arr) {
			if (!uniqueElements.contains(num)) {
				uniqueElements.add(num);
				result.add(num);
			}
		}

		// 결과 배열을 int[] 형태로 변환하여 반환합니다.
		int[] resultArray = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}
		return resultArray;
	}

	
	
	
	// 주어진 문자열에서 모든 공백을 제거하는 메소드를 작성하세요. 문자열은 공백을 포함할 수 있으며, 결과 문자열에는 공백이 없어야 합니다.
	public static String removeSpaces(String input) {
		return input.replaceAll("\\s", "");
	}
	
	//replaceAll("\\s", "")은 주어진 문자열 input에 포함된 모든 공백을 빈 문자열("")로 대체하여 제거하는 역할을 합니다. 
	//정규표현식 \\s는 공백 문자를 나타냅니다.
	
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 3};
		int[] uniqueArr = removeDuplicates(arr);
        System.out.println("중복 제거 배열 결과: " + Arrays.toString(uniqueArr));
        
        
        String input = "Hello,    World!";
        String result = removeSpaces(input);
        System.out.println("공백 제거 결과: " + result);
	}
}
