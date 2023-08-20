package study;

public class C0817 {

	public static void main(String[] args) {

//		예제1  프로그래머스 - 세균 증식
//		예제2  프로그래머스 - 암호 해독

	}
    public int 예제1(int n, int t) {
    	
    	for(int i=1;i<=t;i++)		//i는 1부터 t까지 반복
    	{
    		n *= 2;		// n을 2배씩 증가
    	}
    	return n;	//n반환

    }
    
    public String 예제2(String cipher, int code) {
    	
        String answer ="";
        
    	for (int i = code-1; i < cipher.length(); i+=code) //i는 code -1부터 cipher의 길이까지 code만큼 증가시킴
    	{
			answer += cipher.charAt(i);		//cipher 문자열에서 i위치에 있는 문자를 가져와 answer 추가
		}
    	return answer;
    }

}