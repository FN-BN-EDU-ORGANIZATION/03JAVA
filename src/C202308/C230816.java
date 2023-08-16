package C202308;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class C230816 {
	//ExecutorService를 사용하여 병렬로 작업 실행하기
	 public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }
	 
	 //팰린드롬 문자열 확인하기(앞으로 읽으나 뒤로 읽으나 동일한 문자열)
	 public static boolean isPalindrome(String input) {
	        int left = 0;
	        int right = input.length() - 1;

	        while (left < right) {
	            if (input.charAt(left) != input.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	 
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService를 사용하여 병렬로 작업 실행하기 
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	        ExecutorService executor = Executors.newFixedThreadPool(4);

	        Future<?>[] futures = new Future<?>[numbers.size()];

	        for (int i = 0; i < numbers.size(); i++) {
	            final int num = numbers.get(i);
	            futures[i] = executor.submit(() -> {
	                if (isPrime(num)) {
	                    System.out.println(num + " is prime.");
	                } else {
	                    System.out.println(num + " is not prime.");
	                }
	            });
	        }

	        for (Future<?> future : futures) {
	            future.get();
	        }

	        executor.shutdown();

	      //팰린드롬 문자열 확인하기(앞으로 읽으나 뒤로 읽으나 동일한 문자열)
	        String input = "소주 만병만 주소";
	        String withoutSpaces = input.replaceAll(" ", "");
	        boolean result = isPalindrome(withoutSpaces);
	        if (result) {
	            System.out.println("'" + input + "' is a palindrome.");
	        } else {
	            System.out.println("'" + input + "' is not a palindrome.");
	        }
	}

}
