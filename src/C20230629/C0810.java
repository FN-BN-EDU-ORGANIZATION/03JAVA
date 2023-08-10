package study;

public class C0810 {

	public static void main(String[] args) {
		
//		예제1  프로그래머스 - 옷가게 할인 받기
//		예제2  프로그래머스 - 아이스 아메리카노

	}
	public int 예제1(int price) {
		
        int answer = 0;
        
        if( price >= 500000) {				//price가 500000이상이면
            answer = (int)(price*0.8);		//원래 가격의 80%를 정수형태로
        }else if( price >= 300000){			//price가 300000이상이면
            answer = (int)(price * 0.9);	//원래 가격의 90%를 정수형태로
        }else if (price >= 100000){			//price가 100000이상이면
            answer = (int)(price * 0.95);	//원래 가격의 95%를 정수형태로
        } else {
            answer = price;					//else 원래가격 
        }
        
        
        return answer;
    }
	
	
    public int[] 예제2(int money) {
    	
        int[] answer = new int[2];
        
        answer[0] = money / 5500;		//money를 5500으로 나눈 몫을 할당
        answer[1] = money % 5500;		//money를 5500으로 나는 나머지를 할당
        
        return answer;
    }
}
