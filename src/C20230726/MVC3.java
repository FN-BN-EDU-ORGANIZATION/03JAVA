package myjava04_MVC;


//데이터를 직접 다룸
//로그인 할떄 id , pw 체크 등을 수행(화면에서 보이지않는 부분을 수행함)
//계산을 담당
public class Model {
	public int add(int a , int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	public int dv(int a, int b) {
		return a/b;
	}
	public int remain(int a, int b) {
		return a%b;
	}
	public int calculator(int a, int b, char c) {
		switch(c) {
		case '+':
			return add(a,b);
		case '-':
			return subtract(a, b);
		case '*':
		case 'x':
		case 'X':
			return multi(a,b);
		case '/':
			return dv(a,b);
		case '%':
			return remain(a,b);
		default:
			return 0;
		}
	}

}
