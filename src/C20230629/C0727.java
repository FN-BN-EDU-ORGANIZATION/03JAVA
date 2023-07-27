package study;

public class C0727 {

	public static void main(String[] args) {

		
//		예제1  프로그래머스 - 배열의 평균값
//		예제2  프로그래머스 - 양꼬치(10인분을 먹으면 음료수 1개가 서비스)
		
		
		
		
	}
    public double 예제1(int[] numbers) {
        double answer = 0;
        int tot = 0;                              	//배열의 모든 값을 담을 변수
        for(int i=0; i<numbers.length; i++) {   	
            tot += numbers[i];                    	//배열의 i번째 수를 tot에 더한다
        }
        answer = (double) tot/numbers.length;     //총합을 배열의 크기만큼 나눈다
        return answer;
    }
    
    
	int 예제2(int n, int k) {
		int answer = 0;
			answer=(n*12000)+((k-(n/10))*2000);		//먹은 양꼬치 수 * 12000 + (먹은 음료수 - (양꼬치 수 / 10) * 2000)
		return answer;
	}
}

	


