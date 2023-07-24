package HOMEWORK2;

import java.util.*;

	//의문점
	//정리
		//수업시간에도 ArrayList와 Map은 많이 사용했던 컬렉션이기 때문에 더 많이 공부해두어야 한다!
		//조건문은 봐도봐도 어려운 것 같다..
	//예제1 : 컬렉션 프레임워크
		//List, Set, Map..
		//List는 중복을 허용하면서 저장순서가 유지되는 컬렉션을 구현.
		//Set은 중복을 허용하지 X, 저장순서가 유지되는 컬렉션 구현.
		//Map은 키와 값을 하나의 쌍으로 묶어서 저장하는 컬렉션 구현.(키는 중복 X, 값은 중복 O)
		//ArrayList는 가장 많이 사용되는 컬렉션 클래스! List를 구현하기 때문에 중복허용, 저장순서 유지!

	//예제2 : 컬렉션 프레임워크
		//긴 문자열 데이터를 원하는 길이로 잘라 ArrayList에 담아 출력 

public class C20230724 {
	public static void main(String[] args) {
		//예제1 출력
//		ArrayList list1 = new ArrayList(10);
//		list1.add(new Integer(5)); 
//		list1.add(new Integer(4));
//		list1.add(new Integer(2));
//		list1.add(new Integer(0));
//		list1.add(new Integer(1));
//		list1.add(new Integer(3)); //list1에 저장 idx0~ idx5
//		
//		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
//		//subList - (1,4) 사이에 저장된 객체 반환(idx1=4, idx2=2, idx3=0)
//		print(list1, list2);
//		
//		//정렬
//		Collections.sort(list1);
//		Collections.sort(list2);
//		print(list1, list2);
//		
//		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //true
//		//containsAll - 해당 list가 괄호 안의 list의 모든 요소를 포함하고 있을 때만 true
//		
//		list2.add("B");
//		list2.add("C");
//		list2.add(3,"A"); //idx3에 A저장
//		//새로운 객체들 list2에 저장
//		print(list1, list2);
//		
//		list2.set(3,"AA");//set - 주어진 객체를 주어진 idx에 저장한다 ("AA"를 3번째 idx에 저장)
//		print(list1, list2);
//		
//		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
//		//retainAll - 해당 list에서 괄호 안의 list와 공통되는 부분만 남기고 삭제
//		print(list1, list2);
//		
//		//list2에서 list1에 포함된 객체들 삭제
//		for(int i = list2.size()-1; i>=0; i--) {
//			if(list1.contains(list2.get(i)))
//				list2.remove(i);
//		}
//		print(list1, list2);
//	}
//	
//	//print 메서드
//	static void print(ArrayList list1, ArrayList list2) {
//		System.out.println("list1 : "+list1);
//		System.out.println("list2 : "+list2);
//		System.out.println();
//		
//	}
	
		//예제2 출력
		final int LIMIT = 10; //자를 글자의 개수 상수로 지정해두기
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10); //저장할 요소의 개수를 고려해서 여유있는 크기로 지정해야 함!
													  //자동으로 크기가 늘어나긴 하지만 처리시간이 많이 소요되므로..
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) //문자열의 길이가 LIMIT을 초과하지 않도록
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
}
}
