package myjava02_set_map;

import java.util.*;

public class MyJava02_Set_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set이랑 Map이라는 자료 구조가 있음
		//Set은 ArrayList같은 건 데...
		//중복이 없고 순서가 없다.
		
		//Set : 인터페이스임
		//HashSet : Set 인터페이스를 구현한 클래스
		//해시코드랑 이퀄로 인한 중복을 체크 즉 선택가능하다
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(10); //중복 값이 존재할 수 없음// 넣을수가없음 아예 
		numbers.add(20);
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		//1. Student 클래스를 만들 것
		//2. equals, hashcode(=오버라이드)를 구현하여 학번을 이용해서
		//서로를 구분할 것
		//학번이 똑같은 학생은 아예 추가가 되지 않게 할 것
		//3. 총 결과를 출력할 것
		HashSet<Student> students = new HashSet<Student>();
		//생성자로 값을넣고
		students.add(new Student(30,"이동준",1));
		students.add(new Student(29,"이동준",2));
		students.add(new Student(19,"큰김성민",3));
		students.add(new Student(29,"작은김성민",3));//안 들어감
		students.add(new Student(17,"박소민",4));
		students.add(new Student(7,"김형준",0));
		for (Student student : students) {
			System.out.println("------");
			System.out.println(student.getName()); //값을 출력get으로
			System.out.println(student.getAge());
			System.out.println(student.getHakbeon());
			System.out.println("------");
		}
		
		//dict, 객체
		//dictionary
		//키-값 형태로 자료를 저장함
		//학번-이름 이런 형태라고 보면 됨
		//Integer에 해당하는 게 고유의 키값
		//String에 해당하는 게 값
		//1-이동준
		//2-이동준
		//3-남대희
		
		
		//Map의 핵심 key를 가지고 중복을 체크한다 
		Map<Integer, String> korea_students 
		= new HashMap<Integer,String>();
		korea_students.put(1, "이동준");
		korea_students.put(2, "이동준"); //2번 이나경에 의해 삭제됨
		korea_students.put(3, "남대희");
		korea_students.put(2, "이나경");
		for(int key : korea_students.keySet()) {
			System.out.println("key="+key);
			System.out.println(korea_students.get(key));
		}
		
		//똑같다 key를 가지고 중복을 체크한다
		HashMap<String, String> leedongjoon = 
				new HashMap<String,String>();
		leedongjoon.put("성별", "남성");
		leedongjoon.put("나이", "34");
		leedongjoon.put("직업", "강사");
		leedongjoon.put("주민번호", "111111-1");
		leedongjoon.put("전화번호", "010-2912-1439");
		leedongjoon.put("이름", "이동준");
		for(String key : leedongjoon.keySet()) {
			System.out.println("속성="+key);
			System.out.println(leedongjoon.get(key));
		}
		System.out.println(leedongjoon.get("이름"));
		System.out.println(korea_students.get(2));
		//Student Class에 toString을 오버라이드할 것
		//HashMap<String, Student> 형태로 하나의 HashMap을 만든다.
		//안에 들어가는 키는 전화번호
		//"010-1234-4321", Student(30,"이동준",1)
		//이렇게 최소 3명의 학생을 집어넣고
		//위의 for문처럼 쭉 출력해보세요.
		
		
		
		
		
	}

}
