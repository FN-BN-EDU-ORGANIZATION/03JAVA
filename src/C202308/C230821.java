package C202308;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C230821 {
	 //주어진 문자열에서 모든 문자를 빈도수에 따라 정렬
	 public static String sortCharactersByFrequency(String s) {
	      HashMap<Character, Integer> frequencyMap = new HashMap<>();
	      for (char c : s.toCharArray()) {
	          frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	      }

	      List<Character> characters = new ArrayList<>(frequencyMap.keySet());
	      characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

	      StringBuilder sortedString = new StringBuilder();
	      for (char c : characters) {
	          int count = frequencyMap.get(c);
	          for (int i = 0; i < count; i++) {
	              sortedString.append(c);
	          }
	      }

	      return sortedString.toString();
	 }
	 	 //주어진 문자열을 한 번 뒤집어서 특정 문자열이 나오면 메시지가 포함되어 있다고 판단
	     public static String reverseString(String s) {
	          if (s == null) return null;
	          return new StringBuilder(s).reverse().toString();
	      }

	     public static boolean isReversedSubString(String original, String target) {
	          String reversed = reverseString(original);
	          return reversed.contains(target);
	     }

	public static void main(String[] args) {
      //주어진 문자열에서 모든 문자를 빈도수에 따라 정렬
      String input = "leetcode";
	  String sortedString = sortCharactersByFrequency(input);
	  System.out.println("Sorted String: " + sortedString);
	
	  //주어진 문자열을 한 번 뒤집어서 특정 문자열이 나오면 메시지가 포함되어 있다고 판단
	  String input1 = "pswrdlec";
      String target = "secret";
      boolean result = isReversedSubString(input1, target);
      System.out.println("Contains Reversed Substring: " + result);
  	  }

}
