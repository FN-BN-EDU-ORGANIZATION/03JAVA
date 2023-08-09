package study;

public class C0809 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 머쓱이보다 키 큰 사람
//		예제2  프로그래머스 - 순서쌍의 개수

	}
    public int 예제1(int[] array, int height) {
    	
        int answer = 0;

        
        for(int i=0;i<array.length;i++)		//i는 0부터 array의 길이보다 작을 때까지 반복
        {
            if(array[i]>height)		//array[i]가 height보다 크면
                answer++;		//answer 1증가
        }
        return answer;
    }
    
    public int 예제2(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) //i는 1부터 n까지 반복
        {
            if(n%i==0) 	//n을 i로 나눴을 때 나머지가 0이면
                answer++;	//answer 1증가
        }
        return answer;
    }
}