package C20230724;



public class UnivStudnetmMain {

	public static void main(String[] args) {
		 UnivStudent  UN = new  UnivStudent ();
		 //Setter로 값 설정 // 리턴 getter
		 UN.setAge(30);
		 UN.setName("남대희");
		 
		 //toString 오버라이딩이후 사용// 
		 System.out.println(UN.toString());
		 
		 //두개의 값을 비교해보자
		 String a = "남대희";
		 String b = "이동준"; 
		 System.out.println(UN.equals(a));//false 
		 System.out.println(UN.equals(b));//false
		 
		 
		 Student s2 = new Student();
		 s2.setAge(40);
		 s2.setName("이동준");	
		 //equal로 비교하는거는 내용을 비교하는것이아니고 기본적으로 위치를 비교한다
		 System.out.println(s2.getAge()==s2.getAge() && s2.getName() == s2.getName());
		 
		 
		 
	}

}
