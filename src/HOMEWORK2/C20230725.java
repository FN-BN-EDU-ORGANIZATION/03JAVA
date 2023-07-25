package HOMEWORK2;
import java.util.*;
	//의문점
	//정리
		//LinkedList는 처음 접해보는데 중간에 데이터를 추가하거나 삭제할 일이 많을 때 사용하기 적합한 것 같다.
		//상황에 적합한 컬렉션을 선택해서 잘 사용하는 것이 중요하다!
	//예제1 : 컬렉션 프레임워크(2) - ArrayList vs LinkedList 추가삭제 속도차이
		//배열이 갖고 있는 단점(크기변경불가, 비순차적 데이터 추가삭제에 시간낭비)을 보완하기 위한 자료구조!
		//LinkedList는 불연속적으로 존재하는 데이터를 서로 연결한 형태로 구성되어 있다.
		//이동방향이 단방향. (다음요소에 대한 접근은 쉽지만 이전요소에 대한 접근은 어렵다)
		//보완을 위해 doubly linked list 고안 (더 많이 사용됨) - LinkedList는 더블 링크드리스트로 구현되어있다!
public class C20230725 {
	public static void main(String[] args) {
	//예제1 출력 - ArrayList와 LinkedList의 순차적추가삭제 중간추가삭제에 걸리는 시간 비교 예제
		//순차적으로 추가, 삭제하는 경우는 ArrayList가 더 빠르다!
		//중간 추가, 삭제하는 경우는 LinkedList가 더 빠르다!
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList(); //ArrayList와 LinkedList 객체 생성
//		
//		System.out.println("순차적으로 추가하기");
//		System.out.println("ArrayList : "+add1(al));
//		System.out.println("LinkedList : "+add1(ll));
//		System.out.println();
//		System.out.println("중간에 추가하기");
//		System.out.println("ArrayList : "+add2(al));
//		System.out.println("LinkedList : "+add2(ll));
//		System.out.println();
//		System.out.println("중간에서 삭제하기");
//		System.out.println("ArrayList : "+remove2(al));
//		System.out.println("LinkedList : "+remove2(ll));
//		System.out.println();
//		System.out.println("순차적으로 삭제하기");
//		System.out.println("ArrayList : "+remove1(al));
//		System.out.println("LinkedList : "+remove1(ll));
//	}
//	
//	public static long add1(List list) { //순차적 추가
//		long start = System.currentTimeMillis(); 
//		for(int i=0;i<1000000;i++)
//			list.add(i+""); //0~999999 리스트에 추가
//		long end = System.currentTimeMillis();
//		return end - start;
//		//코드의 실행시간 측정하는 데 currentTimeMillis함수 사용. 현재시간까지 경과한 시간을 밀리초단위로 반환
//	}
//
//	public static long add2(List list) { //중간 추가
//		long start = System.currentTimeMillis();
//		for(int i=0;i<10000;i++)
//			list.add(500, "X"); //500번 idx에 X 10000개 추가
//		long end = System.currentTimeMillis();
//		return end - start;
//		//코드의 실행시간 측정하는 데 currentTimeMillis함수 사용. 현재시간까지 경과한 시간을 밀리초단위로 반환
//
//	}
//	
//	public static long remove1(List list) { //순차적 삭제
//		long start = System.currentTimeMillis();
//		for(int i=list.size()-1;i>=0;i--) //마지막요소부터 0까지 순차적으로 삭제
//			list.remove(i);
//		long end = System.currentTimeMillis();
//		return end - start;
//		//코드의 실행시간 측정하는 데 currentTimeMillis함수 사용. 현재시간까지 경과한 시간을 밀리초단위로 반환
//
//	}
//	
//	public static long remove2(List list) { //중간 삭제
//		long start = System.currentTimeMillis();
//		for(int i=0;i<10000;i++) //0~9999번까지 삭제(시작부분부터 9999번까지만 삭제)
//			list.remove(i);
//		long end = System.currentTimeMillis();
//		return end - start;
//		//코드의 실행시간 측정하는 데 currentTimeMillis함수 사용. 현재시간까지 경과한 시간을 밀리초단위로 반환
//
//	}
	//예제2 : 컬렉션 프레임워크(2) - ArrayList vs LinkedList 읽기 속도차이
	//예제2 출력
		//접근시간은 ArrayList가 빠르다.
		//ArrayList는 연속적으로 요소들이 존재해있기 때문에 저장된 데이터를 곧바로 불러올 수 있음
		//LinkedList는 불연속적으로 요소들이 연결되어 있어서 처음부터 끝까지 데이터를 차례대로 따라가야한다.
		//읽을 데이터가 많아질수록 접근시간이 오래 걸릴 수밖에 없다.
		add(al);
		add(ll);
		
		System.out.println("접근시간 테스트");
		System.out.println("ArrayList : "+access(al));
		System.out.println("LinkedList : "+access(ll));	
	}
	
	public static void add(List list) { //순차적으로 리스트 추가하기
		for(int i=0;i<100000;i++)
			list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			list.get(i); //리스트 얻어오기
		long end = System.currentTimeMillis();
		return end - start;
	}
}