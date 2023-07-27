package myjava02_set_map;

import java.util.HashMap;

public class Myjava03_HashMap_Answer {

	public static void main(String[] args) {
		
		//단점 : HashMap , HashSet은 순서가 일정하지않음
		//put, get , keyset 메서드 //중복값 허용 x 기존의 것은 삭제 새로운것이나옴
		
		
		//put 키값을 넣는다
		HashMap<String , Student > students = new HashMap<String, Student>();
		students.put("010-1111-2222", new Student(15,"이동준",1));
		students.put("010-1111-2223", new Student(25,"남대희",1)); //키값의 중복으로인한 내가출력
		students.put("010-1111-2233", new Student(35,"이동준",2));
		students.put("010-1111-2222", new Student(45,"이동준",3));
		
		//키를 가져온다 (키 : 값) //키를 가져오면 값이나오겠지? 
		System.out.println(students.get("010-1111-2222"));
		System.out.println(students.get("010-1111-2223"));
		System.out.println(students.get("010-1111-2233"));
		
		//아래는 단순 키값만! 출력
		//entrySet(), keySet() 메소드를 사용하면 되는데 entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고, 
		//keySet() 메서드는 key의 값만 필요한 경우 사용합니다.!!
		for(String key : students.keySet()) {
			System.out.println("key="+key); //키 값만 출력 // keyset()으로인해
			System.out.println(students.get(key)); //?
		}
		
		
		
		
	}

}
