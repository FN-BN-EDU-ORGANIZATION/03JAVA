package study;

public class C0728 {

	public static void main(String[] args) {
		
//		예제1 - 프로그래머스(편지)
//		예제2 - 중복된 숫자 개수

	}
    public int 예제1(String message) {
        int answer = 0;
    
        answer = message.length() * 2;		//문자열에 2를 곱한 값은 answer에 대입
        return answer;						//answer 리턴

    }
    
    
    public int 예제2(int[] array, int n) {
        int answer = 0;                     //int answer = 0;
        for(int i=0; i<array.length; i++)  	//i=0부터 array의 길이까지 반복
            if(array[i]==n) {               //array의 i번째 수와 매개변수로 들어온 정수n과 같다면
                answer++;                   //answer에 +1
            }
        return answer;                      //answer를 리턴
    }
}

