package C20230721;

package myjava02_Object;

public class UnivStudent {
	 private int age;
	 private String name;
	 
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//toString 오버라이딩해서 쓸수있게 ㄱㄱ 
	//이유 최상위객체 obj의 기본 메서드이다 즉 기본메서드를 호출하면 거기의 return 값이 주소값을 return 하기 떄문에 오버라이딩으로 재정의해서 사용해야한다
	@Override
	public String toString() {
		return "UnivStudent [age=" + age + ", name=" + name + "]";
	}
	 
}
