package KwonIlkeun;

public class C20230720 {

	public static void main(String[] args) {
		// 1부터 100 까지의 숫자를 보여주되 3과 5로 모두 나누어지는 경우 "짝!! 뽀숑!!" 
		// 3으로 나누어지는 경우 "짝!!" 5로 나누어지는 경우 "뽀숑!!" 이 숫자 대신 나오는 코드 작성 
		
		for(int i=1;i<=100;i++)
		{
			
			if(i%3==0&&i%5==0)
			{
				System.out.println("짝!!뽀숑!");
			}
			else if(i%3==0) {
				System.out.println("짝!!");
			}
			else if(i%5==0) {
				System.out.println("뽀숑!!");
			}
			else
				System.out.println(i);
		}
	}

}
