package study;

public class C0726 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 각도기
//		예제2  프로그래머스 - 짝수의 합
	
	
	
	}
	public int 예제1(int angle) {
		
        int answer = 0;

        if(angle > 0 && angle<90)	//angle이 0보다 크고 90보다 작으면 1
            answer = 1;
        else if(angle == 90)	//angle이 90이면 2
            answer = 2;
        else if(angle > 90 && angle < 180) //angle이 90보다 크고 180보다 작으면 3
            answer = 3;
        else if(angle == 180)//angle이 180이면 4
            answer = 4;
    
        return answer;
    }
	
	
    public int 예제2(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++) {		//int i는 0부터 n까지 반복
            if(i % 2 == 0)		// i를 2로 나누어 떨어지면,
                answer += i;	//answer에 i를 더한다
        }
        return answer;		//answer 반환
    }
}



