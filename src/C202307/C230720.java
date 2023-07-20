package C202307;

import java.util.ArrayList;
import java.util.Arrays;

public class C230720 {
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

	//문자열을 입력받아 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시해 문자열을 압축하여 표시
	 static String compressString(String data) {
	        String _c = "";  // data 문자열중 현재 진행중인 문자를 임시저장하기 위한 변수
	        int cnt = 0;  // 해당 문자가 몇 번 반복했는지 알 수 있는 카운트 변수
	        String result = "";
	        for (String c : data.split("")) {  // 입력받은 문자열 data에서 문자 하나씩 c에 대입
	            if (!c.equals(_c)) {  // 현재 진행중인 문자와 c가 같지 않은 경우, 즉 새로운 문자의 시작
	                _c = c;  // 현재 진행중인 문자와 같지 않으므로 현재진행문자는 c로 대입
	                if (cnt > 0) {  // 새로운 문자이므로 결과 문자열에 이전 문자의 카운트(있을 경우에만)에 해당하는 값을 더해 주어야 함
	                    result += "" + cnt;
	                }
	                result += c;  // 새로운 문자이므로 결과문자열에 새로운 문자를 더함
	                cnt = 1;  // 새로운 문자이므로 카운트는 1로 초기화
	            } else {
	                cnt += 1;  // 현재 진행중인 문자와 c가 같기 때문에 카운트가 증가됨
	            }
	        }
	        if (cnt > 0) {  // for 문을 벗어낫을때 이전 문자의 카운트는 최종적으로 한번 더해주어야함
	            result += "" + cnt;
	        }
	        return result;
	    }
	 
	public static void main(String[] args) {
		//DashInsert 메서드는 숫자로 구성된 문자열을 입력받은 뒤 문자열 안에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 
		//짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. DashInsert 메서드를 완성
		String data = "4546793";
        String result = dashInsert(data);
        System.out.println(result);  // 454*67-9-3 출력
        
        //문자열을 입력받아 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시해 문자열을 압축하여 표시
        String result1 = compressString("aaabbcccccca");
        System.out.println(result1);  // a3b2c6a1 출력

	}

}
