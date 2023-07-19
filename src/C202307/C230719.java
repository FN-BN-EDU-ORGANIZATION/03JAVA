package C202307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class OddException extends Exception {
}

public class C230719 {
	
	static void execute(int n) throws OddException {
	//오류에 상관없이 모두 수행하기
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }
	
	//DashInsert 메서드는 숫자로 구성된 문자열을 입력받은 뒤 문자열 안에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 
    //짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. DashInsert 메서드를 완성
    static String dashInsert(String data) {
        int[] numbers = Arrays.stream(data.split(""))  // 숫자 문자열을 정수 배열로 변경
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add("" + numbers[i]);
            if (i < numbers.length - 1) {  // 다음 수가 있다면
                boolean isOdd = numbers[i] % 2 == 1;  // 현재 수가 홀수인지 여부
                boolean isNextOdd = numbers[i + 1] % 2 == 1;  // 다음 수가 홀수인지 여부
                if (isOdd && isNextOdd) {  // 두 수가 연속해서 홀수인 경우
                    resultList.add("-");
                } else if (!isOdd && !isNextOdd) {  // 두 수가 연속해서 짝수인 경우
                    resultList.add("*");
                }
            }
        }
        return String.join("", resultList);
    }

	public static void main(String[] args) {
		//오류에 상관없이 모두 수행하기
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try {  // for문 안쪽에 try .. catch 문을 위치시켰다.
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }

        //DashInsert 메서드는 숫자로 구성된 문자열을 입력받은 뒤 문자열 안에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 
        //짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. DashInsert 메서드를 완성
        String data = "4546793";
        String result = dashInsert(data);
        System.out.println(result);  // 454*67-9-3 출력

	}

}
