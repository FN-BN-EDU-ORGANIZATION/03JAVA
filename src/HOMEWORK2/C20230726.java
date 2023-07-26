package HOMEWORK2;

import java.util.*;
	//의문점
	//정리
		//스택은 최근 거를 먼저 꺼내고 큐는 가장 오래된 것을 먼저 꺼내기!
		//큐와 관련된 예제는 처음 접하는 메서드가 꽤 있었기 때문에 이해하기가 조금 힘들었다.. 
		//리눅스에서 배웠던 history명령어를 큐로 구현한 예제코드.
		//저장된 요소를 순차적으로 읽어오는 Iterator인터페이스도 처음 봤다! 보면 볼수록 공부할 게 더 많아지는 느낌이다.
	//예제1 : 컬렉션 프레임워크(3) - 스택
		//스택 - 마지막에 저장한 데이터를 가장 먼저 꺼내는 후입선출! Last In First Out 구조 (스택은 바닥면이 막혀있고)
		//스택활용 예제(웹브라우저 뒤로, 앞으로 구현)
public class C20230726 {
//	public static Stack back = new Stack();
//	public static Stack forward = new Stack(); //stack 객체 구현
	
//	public static void main(String[] args) {
//		goURL("1.구글");
//		goURL("2.네이버");
//		goURL("3.다음");
//		goURL("4.네이트");
//		//url 4번 이동
//		
//		printStatus();
//		
//		goBack();
//		System.out.println("'뒤로' 버튼을 누른 후");
//		printStatus();
//
//		goBack();
//		System.out.println("'뒤로' 버튼을 누른 후");
//		printStatus();
//		
//		goForward();
//		System.out.println("'앞으로' 버튼을 누른 후");
//		printStatus();
//		
//		goURL("codechobo.com");
//		System.out.println("새로운 주소로 이동 후");
//		printStatus();
//	}
//	
//	public static void printStatus() {
//		System.out.println("back : "+back); //back스택의 항목들 출력
//		System.out.println("forward : "+forward); //forward스택의 항목들 출력
//		System.out.println("현재 화면은 '"+back.peek()+"' 입니다."); //back스택의 항목 중 가장 최근의 항목(위에 있는) 출력 = 현재 화면
//		System.out.println();
//	}
//	
//	public static void goURL(String url) {
//		back.push(url);	//url을 back 스택에 저장
//		if(!forward.empty())
//			forward.clear(); //forward 스택이 비어있지 않으면 forward스택을 비운다(앞으로 이동할 수 없도록)
//	}
//	
//	public static void goForward() { //앞으로 버튼
//		if(!forward.empty())
//			back.push(forward.pop()); //forward 스택이 비어있지 않으면 가장 최근의 forward항목을 꺼내서 back스택에 넣는다
//	}
//	
//	public static void goBack() { //뒤로 버튼
//		if(!back.empty())
//			forward.push(back.pop()); //back 스택이 비어있지 않으면 가장 최근의 back항목을 꺼내서 forward스택에 넣는다
		
	//예제2 : 컬렉션 프레임워크(3) - 큐
		//큐 - 처음에 저장한 데이터를 가장 먼저 꺼내는 선입선출! First In First Out 구조 (큐는 양방향이 모두 뚫려있다)
		//큐활용 예제(최근 검색한 기록(history) 꺼내기)
	static Queue q = new LinkedList(); //LinkedList배열로 Queue객체 생성
	static final int MAX_SIZE = 5;	//큐에 최대 5개까지만 저장되도록
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) { //반복문
			System.out.print(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				if("".equals(input)) //공백이 입력된 경우 계속하기
					continue;
				if(input.equalsIgnoreCase("q")) { //q를 입력한 경우 프로그램 종료
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) { //help를 입력한 경우 보여주기
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) { //history를 입력한 경우
					int i=0;
					save(input);
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) //iterator에서 제공하는 메서드 hasNext() - 내부 요소들을 순차적으로 탐색!
						System.out.println(++i+"."+it.next());
				} else {
					save(input);
					System.out.println(input);
				} 
			} catch(Exception e) {
					System.out.println("입력오류입니다.");
			}
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) //입력받은 단어가 공백이 아니라면 q에 저장
			q.offer(input);
		
		if(q.size() > MAX_SIZE) //q에 저장된 단어가 MAX_SIZE=5보다 클 경우 가장 오래된 단어 q에서 삭제하기 
			q.remove();
	}
		
}

