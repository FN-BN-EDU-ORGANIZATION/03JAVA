package C0713;

// 정보처리기사 실기 2022년 3회 기출문제 Java

class cond{
	int a;
	public cond(int a) {
		this.a = a;
	}
	public int func() {
		int b = 1;
		for(int i=1; i<a; i++) {
			b+=a*i;
		}
		return a+b;
	}
}

public class C01Ex {
	public static void main(String[] args) {
		cond obj = new cond(3);
		obj.a = 5;
		int b = obj.func();
		System.out.println(obj.a+b);
	}
}
