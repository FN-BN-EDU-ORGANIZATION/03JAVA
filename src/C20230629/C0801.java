package study;

public class C0801 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 배열 원소의 길이
//		예제2  프로그래머스 - 문자열안에 문자열

	}
    public int[] 예제1(String[] strlist) {
    	 int[] answer = new int[strlist.length];
         
         int length = strlist.length;		//strlist배열의 길이를 length변수에 저장
         for(int i = 0; i<length; i++){		//i는0부터 length보다 작을 때까지 반복
             answer[i] = strlist[i].length();	//answer배열의 i번째 요소에 strlist배열의 i번째 문자열의 길이 저장
         }

         return answer;
    }
    
    public int 예제2(String str1, String str2) {
        int answer = 0;
        
        if(str1.contains(str2)) {			//contains : 문자열 안에 특정 문자열이 포함되어 있는지 확인하는 메서드
			answer = 1;						//특정 문자열이 있다면 1
		} else {
			answer = 2;						//아니면 2반환
		}
        
        
        return answer;
    }
}

