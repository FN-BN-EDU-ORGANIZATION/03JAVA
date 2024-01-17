package 황다은;

public class C20230807 {
	public static void main(String[] args) {
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;  // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;  // 3140.0
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1,f1,f1);
		//결과 : f1=0.100000, 1.000000e-01, 0.100000
		System.out.printf("f2=%f, %e, %g%n", f2,f2,f2);
		//결과 : f2=10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3=%f, %e, %g%n", f3,f3,f3);
		//결과 : f3=3140.000000, 3.140000e+03, 3140.00
		
		System.out.printf("d=%f%n",d);
		//결과 : d=1.234568 -> '%f'는 기본적으로 소수점 아래 6자리까지만 출력
		System.out.printf("d=%14.10f%n",d);	// 전체 14자리 중 소수점 10자리
		//결과 : d=  1.2345678900
		String url = "www.codeChobo.com";
		
		System.out.printf("[%s]%n", url);	// 문자열의 길이만큼 출력공간을 확보
		//결과 : [www.codeChobo.com]
		System.out.printf("[%20s]%n", url);	// 최소 20글자 출력공간을 확보(우측정렬)
		//결과 : [   www.codeChobo.com]
		System.out.printf("[%-20s]%n", url);// 최소 20글자 출력공간을 확보(좌측정렬)
		//결과 : [www.codeChobo.com   ]
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
		//결과 : [www.code]
		
	}
}
