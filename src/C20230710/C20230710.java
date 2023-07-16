package C20230710;
//정리
//public: 어떤 클래스에서든 접근할 수 있다
//private: 동일한 클래스 내에서만 접근할 수 있다
//protected: 동일한 패키지 내의 클래스 또는 상속받은 하위 클래스에서 접근할 수 있다
//(default, 생략 가능): 동일한 패키지 내의 클래스에서만 접근할 수 있다


public class C20230710 {

	// public 접근자를 사용한 멤버 변수
    public int publicItem = 10;

    // private 접근자를 사용한 멤버 변수
    private int privateItem = 20;

    // protected 접근자를 사용한 멤버 변수
    protected int protectedItem = 30;

    // (default) 또는 package-private 접근자를 사용한 멤버 변수
    int defaultItem = 40;

    // public 접근자를 사용한 메서드
    public void publicMethod() {
        System.out.println("public method다.");
    }

    // private 접근자를 사용한 메서드
    private void privateMethod() {
        System.out.println("private method다.");
    }

    // protected 접근자를 사용한 메서드
    protected void protectedMethod() {
        System.out.println("protected method다.");
    }

    // (default) 또는 package-private 접근자를 사용한 메서드
    void defaultMethod() {
        System.out.println("default method다.");
    }

}
