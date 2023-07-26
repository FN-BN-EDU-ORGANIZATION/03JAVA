package C20230629;

public class C20230726 {
	#include <stdio.h>

	int main() {
	    int num;
	    printf("양의 정수를 입력하세요: ");
	    scanf("%d", &num);

	    for (int i = 1; i <= num; i++) {
	        for (int j = 1; j <= i; j++) {
	            printf("*");
	        }
	        printf("\n");
	    }

	    return 0;
	}
}
#include <stdio.h>

//거듭제곱 계산 함수
int power(int x, int n) {
 int result = 1;
 for (int i = 0; i < n; i++) {
     result *= x;
 }
 return result;
}

int main() {
 int x, n;
 printf("정수 x와 양의 정수 n을 입력하세요: ");
 scanf("%d %d", &x, &n);

 int result = power(x, n);

 printf("%d의 %d승 = %d\n", x, n, result);

 return 0;
}
#include <stdio.h>

//두 수의 최대공약수 계산 함수
int gcd(int a, int b) {
 if (b == 0)
     return a;
 return gcd(b, a % b);
}

//두 수의 최소공배수 계산 함수
int lcm(int a, int b) {
 return (a * b) / gcd(a, b);
}

int main() {
 int num1, num2;
 printf("두 개의 양의 정수를 입력하세요: ");
 scanf("%d %d", &num1, &num2);

 int gcdResult = gcd(num1, num2);
 int lcmResult = lcm(num1, num2);

 printf("최대공약수 = %d, 최소공배수 = %d\n", gcdResult, lcmResult);

 return 0;
}