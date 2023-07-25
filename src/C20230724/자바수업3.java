package C20230724;


import java.util.ArrayList;
import java.util.Collections;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> lottos = new ArrayList<Integer>();
		//remove : 인덱스를 이용한 방식과 특정한 값을 찾아서 지우는 방식
		//numbers.remove((Interger)34); //값이 34인 거를 지운다
		//system.out.println (numbers.contains(10)); //10이 포함됐는지 여부 체크
		
		while(lottos.size()!=6) {
			int num = (int)(Math.random()*45)+1;
			lottos.remove((Integer)num); //중복방지
			lottos.add(num);
		
			
			
		}int bns= (int) (Math.random()*45)+1;
		while(lottos.contains(bns)) {
			bns= (int)(Math.random()*45)+1;
		}
		Collections.sort(lottos);
		System.out.println(lottos.toString());
		System.out.println("보너스번호="+bns);
		
		
		
	}

}

