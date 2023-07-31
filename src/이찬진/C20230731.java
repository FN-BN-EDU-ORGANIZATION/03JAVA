package 이찬진;

public class C20230731 {

	public static void main(String[] args) {

		// 예제1
		// int 타입의 변수 num이 있을 떄, 각 자리의 합을 더한 결과를 출력하는 코드를
		// 완성하라 만일 변수의 값이라면, num 12345, '1+2+3+4+5'의 결과인
		// 15를 출력하라

		int num = 12345;
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
			System.out.println(num);
		}
		System.out.println("sum=" + sum);

		// 예제2
		// 정수 2개를 전달받아 두 수를 더한 결과를 return해주는 클래스

	//class calc{
	//	static int sum(int num1, int num2) {
	//		return num1 + num2;
	//	}
	//}
	//public class C20230704{
	//	public static void main(String[] args) {
	//		
	//		Scanner sc =new Scanner(System.in);
	//		System.out.println("정수 2개를 입력해주세요");
	//		int num1 = sc.nextInt();
	//		int num2 = sc.nextInt();
	//		
	//		System.out.println("정수의 합 : " + calc.sum(num1, num2));
	//		
	//		sc.close();
	}

}
