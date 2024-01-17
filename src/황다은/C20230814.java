package 황다은;


public class C20230814 {
public static void main(String[] args) {
	//사칙연산자 + - * /
	
	//산술변환
	//"연산 전에 피연산자의 타입을 일치시키는 것"
	//산술변환의 규칙
	//① 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
	//	long + int -> long + long -> long
	//② 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
	//	byte + short -> int + int -> int
	//	char + short -> int + int -> int
	
	
	//반올림 - Math.round()
	//실수를 소수점 첫 째자리에서 반올림한 정수를 반환
	long result = Math.round(4.52);	//result에 5저장
	System.out.println(result);
	//예제
	double pi = 3.141592;
	double shortPi = Math.round(pi*1000)/1000.0;
	System.out.println(shortPi);
	//풀이과정
	//Math.round(pi*1000)/1000.0
	//-> Math.round(3.141592*1000)/1000.0
	//-> Math.round(3141.592)/1000.0
	//-> 3142/1000.0
	//-> 3.142
	
	//나머지 연산자 %
	//오른쪽 피연산자로 나누고 남은 나머지를 반환
//	int x = 10;
//	int y = 8;
//	System.out.println(x%y);
	
	
	//비교 연산자 > < >= <= == !=
	//두 피연산자를 비교해서 true(참) 또는 false(거짓)을 반환
	//문자열 비교에는 "==" 대신 "equals()"을 사용해야 한다.
	
	
	//논리 연산자 && ||
	//조건식을 연결할 때 사용하는 연산자
	//||(or결합) : 피연산자 중 어느 한 쪽이 true이면 true
	//&&(And결합) : 피연산자 양쪽 모두 true여야 true
	
	
	//조건 연산자(삼항연산자) ?:
	//조건식의 결과에 따라 연산결과를 달리한다.
	//조건식 ? 식1 : 식2
	//조건식이 참이면 식1, 거짓이면 식2
	//ex)
	int x =5, y=3;
	result =(x>y)?x:y;	//괄호 생략 가능
	System.out.println(result);
	
	//삼항연산자는 if(조건문)을 대신하여 간단한 코드를 작성하기도 한다.
	//위의 코드와 똑같은 if문은
	if(x>y) {
		result = x;
	}else {
		result=y;
	}
	//이코드와 같다. if문보다 삼항연산자를 쓰면 보다 짧은 코드로 구현할 수 있다.
	
	
	//대입연산자
	//오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
	//lvalue : 대입연산자의 왼쪽 피연산자
	//rvalue : 대입연산자의 오른쪽 피연산자
	// x = 3 	x:lvalue, 3: rvalue
	
	int i = 0;
//	3=i+3;		//에러. lvalue가 값을 저장할 수 있는 공간이 아님
//	i+3=i;		//에러. lvalue가 연산결과가 리터럴(i+3 -> 0+3 -> 3) 
	
	final int Max = 3;	//변수 앞에 키워드 final을 붙이면 상수가 됨.
//	Max = 10;	//에러. 상수(Max)에 새로운 값을 저장할 수 없다.
	
	
	//복합 대입 연산자
	//대입 연산자와 다른 연산자를 하나로 축약
	//i += 3; == i=i+3;
	//위 두 식이 같음
	//i *=10+j; ==  i = i*(10+j);
	
	
	
}
}
