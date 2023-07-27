package HomeWork.C20230727;

class 재료 {

}

class 캬라멜 extends 재료 {
	String meterial;

	캬라멜(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "캬라멜";
	}

}

class 옥수수 extends 재료 {
	String meterial;

	옥수수(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "옥수수";
	}

}

class 민초 {
	String meterial;

	민초(String m) {
		this.meterial = m;
	}

	@Override
	public String toString() {
		return "민초 [재료=" + meterial + "]";
	}

}

class Popcorn<T extends 재료> {
	private T meterial;

	Popcorn(T meterial) {
		this.meterial = meterial;
	}

	void ShowInfo() {
		System.out.println(meterial.toString() + "맛 팝콘");
	}
}

public class C20230727 {

	//위 클래스들이 위치상 이곳에 있을때 아래 오류가 발생함. 클래스를 생성할때의 위치도 중요하다!!
	
	//No enclosing instance of type C20230727 is accessible. 
	//Must qualify the allocation with an enclosing instance of type C20230727 
	//(e.g. x.new A() where x is an instance of C20230727).
	
	public static void main(String[] args) {
		Popcorn<캬라멜> ob1 = new Popcorn<캬라멜>(new 캬라멜("캬라멜"));
		ob1.ShowInfo(); // "캬라멜맛 팝콘" 이 출력

		Popcorn<옥수수> ob2 = new Popcorn<옥수수>(new 옥수수("옥수수"));
		ob2.ShowInfo(); // "옥수수맛 팝콘" 이 출력

		// 민초는 제너릭으로 선택되지 않도록 합니다
//		Popcorn<민초> ob3 = new Popcorn<민초>(new 민초("민트초코"));
	}
}
