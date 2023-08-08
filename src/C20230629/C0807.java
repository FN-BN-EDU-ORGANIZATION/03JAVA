package study;

public class C0807 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 문자열 뒤집기
//		예제2  프로그래머스 - 특정 문자 제거하기

	}
	public String 예제1(String my_string) {
        String answer = "";
        
        for(int i=my_string.length() - 1; i>=0;i--)	//문자열을 거꾸로 반복
        {
            answer += my_string.substring(i, i+1);	//my_string의 i번째 문자 추출
        }
        return answer;
	}
	
    public String 예제2(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");		//letter 문자열을 공백으로 대체
        return answer;
    }
}
