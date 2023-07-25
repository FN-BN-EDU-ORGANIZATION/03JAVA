package C20230724;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Myjava04List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList라는 자료형 = 배열(=Array)랑 유사함
		//크기를 처음에 정하지 않기 때문에 구조가 유연함
		//배열보다 유연함
		
		//List : 인터페이스
		//ArrayList : 클래스
		List<String> names = new ArrayList<String>();
		names.add("이영록");
		names.add("신형진");
		names.add("이동준"); 
		names.remove(2); //2번째꺼(세번째꺼) 삭제
		System.out.println("첫번째:"+names.get(0)); //읽어오기(불러오기)
		names.add("김동준");
		names.set(2, "이동준");
		
		for(int i = 0 ; i<names.size(); i++)
			System.out.println(names.get(i));
		//foreach ctrl space
		for (String string : names) {
			System.out.println(string);
		}
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(34);
		numbers.add(25);
		for(int item : numbers)
			System.out.println(item);
		Collections.sort(numbers); //순차 정렬도 해줌
		for(int item : numbers)
			System.out.println(item);

	}

}
