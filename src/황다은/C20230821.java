package 황다은;
//업캐스팅과 다운캐스팅
//업캐스팅 : 서브클래스 객체가 슈퍼클래스 타입으로 변환되는 것이다.

//다운캐스팅 : 슈퍼 클래스 객체가 서브 클래스 타입으로 변환되는 것이다.

class Parents {
	public void familyName() {
		System.out.print("이");
	}

	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents {
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

class Aclass{
	public String getpwd() {
		return "A클래스";
	}
}
class PrintClass{
	public void print(Object ob) {
		Aclass aob = (Aclass)ob;  
		System.out.println(aob.getpwd());
	}
}

public class C20230821 {
public static void main(String[] args) {
	
	//업캐스팅
	Parents par;
	par = new Parents();
	par.name();
	par = new Daughter();
	par.name();
	par = new Son();
	par.name();
	
	//다운캐스팅
	Aclass a = new Aclass();
	PrintClass pc = new PrintClass();
	pc.print(a);
}
}
