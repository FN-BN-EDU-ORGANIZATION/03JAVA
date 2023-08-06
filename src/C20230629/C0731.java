package study;

public class C0731 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 피자 나눠 먹기
//		예제2  프로그래머스 - 짝수 홀수 개수
		

	}
	public int 예제1(int n) {
        int answer = 0;
        						//피자 한판이 7조각이고 7명이 한 조각씩 먹기 위해서는 최소 1판이 필요함
        if(n % 7 == 0)
        	answer = n / 7;		//n이 7로 나누어 떨이지면 1
        else
        	answer = n / 7 + 1;	//n이 7로 나누어 떨어지지 않으면 +1
        
        return answer;
    }
	 public int[] 예제2(int[] num_list) {
	        int[] answer = new int[2];
	        int odd = 0;
	        int even = 0;
	        
	        for(int i=0;i<num_list.length;i++)
	        {
	        	if(num_list[i] % 2 ==0)		//짝수이면
	        		even++;	//even 1증가
	        	else
	        		odd++;	//아니면 odd 1증가
	        }
	        answer[0] = even;		//0번 인덱스에 짝수 저장
	        answer[1] = odd;		//1번 인덱스에 홀수 저장
	        
	        return answer;

	 }
}

