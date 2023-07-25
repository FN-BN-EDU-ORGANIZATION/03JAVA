package C20230721;

public class myjava02_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); 
		s.setAge(30);
		s.setName("이동준");
		System.out.println(s.toString()); //toString을 오버라이딩을 안했기떄문에
		//object 최상위 객체의 메서드인데 해시태그 및 주소값을 반환하고 있기 때문에
		//오버라이드로 덮어쓰기해서 사용해야한다 
		//왜 사용하냐? 많을수록 일일이 한번에 출력하기 힘들기 떄문에
		System.out.println(s);
		System.out.println(s.getAge());
		System.out.println(s.getName());
		
	}