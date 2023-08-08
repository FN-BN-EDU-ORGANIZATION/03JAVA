package study;

import java.util.Arrays;

public class C0808 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 배열의 유사도
//		예제2  프로그래머스 - 삼각형의 완성조건(1)

	}
    public int 예제1(String[] s1, String[] s2) {
    	
        int answer = 0;
        int count = 0;
        
        for(int i=0;i<s1.length;i++)	//int i는 0부터 sl의 길이보다 작을 때까지 반복
        {
            for(int j=0;j<s2.length;j++)//int j는 0부터 s2의 길이보다 작을 때까지 반복
            {
                if(s1[i].equals(s2[j]))	//s1[i]와 s2[j]가 같다면
                {
                    count++;	//카운트 증가
                }
            }
        }
        answer = count;	//answer에 count변수 값 할당
        return answer;
    }
    public int 예제2(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);	//오름차순 정렬
        
        if( sides[2] < (sides[0] + sides[1]) ) {	//sides[2] 값이 sides[0]+sides[1]의 값보다 작으면
            answer = 1;		// 1 = 삼각형을 만들 수 있다.
        } else {
            answer = 2;		// 2 = 삼각형을 만들 수 없다.
        }
        
        
        return answer;
    }
}

