package C202308;

import java.util.Arrays;
import java.util.HashMap;

public class C230811 {
	//배열에 있는 숫자 중에서 2번째로 큰 수 찾기
	public static int findSecondLargestNumber(int[] arr) {
	    Arrays.sort(arr);
	    return arr[arr.length - 2];
	}
	
	//주어진 문자열에서 중복되는 문자가 있는지 확인하기
	public static boolean hasDuplicateCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) > 1) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		//배열에 있는 숫자 중에서 2번째로 큰 수 찾기
		int[] arr = { 5, 6, 3, 8, 4 };
        System.out.println("Second largest number is " + findSecondLargestNumber(arr));
        
        //주어진 문자열에서 중복되는 문자가 있는지 확인하기
        String str = "programming";
        System.out.println("Does the string have duplicate characters? " + hasDuplicateCharacters(str));
	}

}
