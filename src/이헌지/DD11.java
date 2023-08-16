package 이헌지;

import java.util.Scanner;

// 2.3 형식화된 출력 - printf()

// 지금까지 화면에 출력할 때 println()을 써왔는데,println()은 사용하기엔 편하지만 변수의 값을 그대로 출력하므로,
// 값을 변환하지 않고는 다른 형식으로 출력할 수 없다. 같은 값이라도 다른 형식으로 출력하고 싶을 때가 있다.
// 예를 들면,소수점 둘째자리까지만 출력한다던가,정수를 16진수나 8진수로 출력한다던가,이럴 때 printf()를 사용하면 된다.
// printf()는 '지시자(specifier)'를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력하는 기능을 가지고 있다.
// '지시자'는 값을 어떻게 출력할 것인지를 지정해주는 역할을 한다. 
// 정수형 변수에 저장된 값을 10진 정수로 출력할 때는 지시자'%d'를 사용하며,변수의 값을 지정된 형식으로 변환해서 지시자 대신 넣는다.
// 예를 들어 int 타입의 변수 age의 값이 14일 때,printf()는 지시자 '%d'대신 14를 넣어서 출력한다.
/*
     System.out.printf("age:%d,age);
   → System.out.printf("age:%d,14);
   → System.out.printf("age:14);    // "age:14"가 화면에 출력된다.
*/
// 만일 출력하려는 값이 2개라면,지시자도 2개를 사용해야하며 출력될 값과 지시자의 순서는 일치해야 한다.
// 물론 3개 이상의 값도 지시자를 지정해서 출력할 수 있으며 개수의 제한은 없다.
/*
    System.out.printf("age:%d year:%d, age,year");
    System.out.printf("age:%d year:%d,  14,2017");
                            ↑______↑______|   |
                                   |_ _ _ _ _ |
                                   
                                    ▼
                                    
                      "age:14 year:2017"이 화면에 출력된다.
*/
// pritln()과 달리 printf()는 출력후 줄바꿈을하지 않는다. 줄바꿈을 하려면 지시자'%n'을 따로 넣어줘야 한다.

// |참고| '%n'대신'\n'을 사용해도 되지만, os마다 줄바꿈 문자가 다를 수 있기 때문에 '%n'을 사용하는 것이 더 안전하다.
/*
    System.out.printf("age:%d,age);        // 출력 후 줄바꿈을 하지 않는다.
    System.out.printf("age:%d%n",age);     // 출력 후 줄바꿈을 한다.
*/
// printf()의 지시자 중에서 자주 사용되는 것만 뽑아보면 다음과 같다.

// |참고| 지시자의 전체 목록을 보려면,Java API에서 Formatter클래스(java.util패키지)를 찾으면 된다.
/*
     지시자  |                 설명                 | 
    %b     | 불리언(boolean)형식으로 출력              |
    %d     | 10진(decimal)정수의 형식으로 출력          | 
    %o     | 8진(octal)정수의 형식으로 출력             |
    %x,%X  | 16진(hexa-decimal)정수의 형식으로 출력     |
    %f     | 부동 소수점(floating-point)의 형식으로 출력  |
    %e,%E  | 지수(exponent) 표현식의 형식으로 출력        |
    %c     | 문자(character)로 출력                  |
    %s     | 문자열(string)로 출력                    | 
      
               ▲ 자주 사용되는 printf()의 지시자
*/
/*
class Ch03형식화된출력{

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L; // long big 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;

		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c,(int)c);
		System.out.printf("finger=[%5d]%n",  finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);  // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);	
	}
}
*/
// 정수형의값을 printf()로 출력하는 예제이다. 정수를 출력할 때는 지시자 '%d'를 사용하는데,
// 출력될 값이 차지할 공간을 숫자로 지정할 수 있다. 여러 값을 여러 줄로 간격 맞춰 출력할 떄 꼭 필요한 기능이다. 
// 아래의 결과를 보면 '0'과 '-'가 어떤 ㅎ=역할을 하는지 설명하지 않아도 알 수 있을 것이다.
/*
     System.out.printf("finger = [%5d]%n, finger);    // finger = [   10]
     System.out.printf("finger = [%-5d]%n,finger);    // finger = [10   ]
     System.out.printf("finger = [%05d]%n,finger);    // finger = [00010 ]
 */
// 지시자 '%x'와'%o'에 '#'을 사용하면 접두사 '0x'와'0'이 각각 붙는다. 
// 그리고 '%X'는 16진수에 사용되는 접두사와 영문자를 대문자로 출력한다.
/*
     System.out.printf("hex=%x%n", hex);    // hex = ffffffffffffffff
     System.out.printf("hex=%#x%n", hex);   // hex = 0xffffffffffffffff
     System.out.printf("hex=%#X%n", hex);   // hex = 0XFFFFFFFFFFFFFFFF
*/
// 10진수를 2진수로 출력해주는 지시자는 없기 때문에,정수를 2진 문자열로 변환해주는 
// 'Integer,toBinaryString(int i)'를 사용해야 한다.
// 이 메서드는 정수를 2진수로 변환해서 문자열로 반환하므로 지시자 '%s'를 사용했다.

/*
     System.out.printf("binNum=%s%n",Interger.toBinaryString(bunNum));
 */
// 그리고 C언어에서는 char타입의 값을 지시자 '%d'로 출력할 수 있지만,자바에서는 허용돠지 않는다.
// 아래와 같이 int타입으로 형 변환해야만 '%d'로 출력할 수 있다. 
/*
     System.out,printf("c=%c, %d %n , c, (int)c); // 형변환이 꼭 필요하다.
*/ 
/*public class Ch03형식화된출력{
	public static void main (String[]args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;    // 0.10, 1.0e-1
		float f2 = 1e1f ;   // 10,0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
	
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);  // 전체 14자리 중 소주점 10자리

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n" ,url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[-20s]%n" , url);  // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);   // 왼쪽에서 8글자만 출력
		
	}
}

      출력값:f1=0.100000, 1.000000e-01, 0.100000
    		  f2=10.000000, 1.000000e+01, 10.0000
    		  f3=3140.000000, 3.140000e+03, 3140.00
    		  d=1.234568
    		  d=  1.2345678900          ← 마지막 자리 반올림
    		  [12345678901234567890]
    		  [www.codechobo.com]
    		  [   www.codechobo.com]
    		  [-20s]
    		  [www.code]
*/
// 실수형 값의 출력에 사용되는 지시자는 '%f','%e','%g'가 있는데,'%f'가 주로 쓰이고 '%e'는 지수형태로 출력할 때,
// '%g'는 값을 간략하게 표현할 때 사용한다.
// '%f'는 기본적으로 소수점 아래 6자리까지만 출력하기 떄문에 소수점 아래 7자리에서 반올림한다.
// 그래서 1.23456789가 1.2345678로 출력되었다. 그리고 다음과 같이 전테 자리수와 소수점 아래의 자리수를 지정할 수도 있다.
/*
                          %전체자리.소수점아래자리f 
       System.out.print("d=%14.10f%n", d); // 전체 14자리 중 소수점 아래 10자리
       
                  ↓---------_14자리------------↓
      빈자리를       |1|2|3|4|1|2|3|4|5|6|7|8|9|0|       빈자리를
      공백으로채움 →   | | |1|.|2|3|4|5|6|7|8|9|0|0|     ← 0으로 채움
                           ↑_______10자리_______↑
*/
// 소수점도 한자리를 차지하며,소수점 아래의 빈자리는 0으로 채우고 정수의 빈자리는 공백으로 채워서 전체 자리수를 맞춘다.

// |참고| 지시자를 '%014.10'으로 지정했다면,양쪽 빈자리를 모두 0으로 채웠을 것이다.

// 지시자 '%s'에도 숫자를 추가하면 원하는 만큼의 출력공간을 확보하거나 문자열의 일부만 출력할 수 있다.
/*
        System.out.printf("[%s]%n",    url);    // 문자열의 길이만큼 출력공간을 확보
        System.out.printf("[%20s]%n",  url);    // 최소 20글자 출력공간 확보.(우측정렬)
        System.out.printf("[%-20s]%n", url);    // 최소 20글자 출력공간 확보.(좌측정렬)
        System.out.printf("[%.8s]%n",  url);    // 문자열의 길이만큼 출력공간을 확보
*/
// 지정된 숫자보다 문자열의 길이가 작으면 빈자리는 공백으로 출력된다. 공백이 있는 경우 기본적으로 우측 끝에 문자열을 붙이지만,
// '-'를 붙이면 좌측 끝에 붙인다. 그리고'.'을 붙이면 문자열의 일부만 출력할 수 있다.
// 숫자를 직접 바꿔가면서 다양하게 테스트 해보자.
