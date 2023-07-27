package myjava02_set_map;

import java.util.HashSet;
import java.util.Objects;

//1 Student 클래스를 만들것
//2 equals , hashcode(=오버라이드) 를 구현하여 학번을 이용해서
//서로를 구분할것
//학번이 똑같은 학생은 아예 추가가 되지 않게 할것
//3. 총 결과를 출력할것
//객체 해시코드란 ? 객체를 식별하는 하나의 정수값 
public class Student {
	private int age;
	private int hakbeon;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHakbeon() {
		return hakbeon;
	}
	public void setHakbeon(int hakbeon) {
		this.hakbeon = hakbeon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//생성자 O//만들어주고
	public Student(int age, String name, int hakbeon) {
		super();
		this.age = age;
		this.hakbeon = hakbeon;
		this.name = name;
	}
	
	
	//학번을기준으로 학번이 겹치면 중복자료 x 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//학번이 String 이면 .equals(hakbeon)으로 해야한다 
			return ((Student)(obj)).getHakbeon() == hakbeon;
		}
		System.out.println("비교대상이 잘못 ");
		return false;
	}

	
	//오버라이딩 해줘야// 둘다 오버라이드를 해야 set에서 중복체크가가능 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();// 고유값 (=c로 비유하자면 주소값)
		return hakbeon;  //학번을 해쉬코드로 리턴
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", hakbeon=" + hakbeon + ", name=" + name + "]";
	}
	
	
	

	

	

	
	
	
	
}
