package 이찬진;

import java.util.Scanner;

public class C20230801 {
	
	public static void main(String[] args) {
		
		
		
		//예제1
		//키와 체중을 입력하여 BMI 지수를 구하고 BMI지수에 해당하는 정상,과체중,비만,고도비만 등의 정보를 출력
		// BMI 지수 계산식 -> BMI = 체중(kg)/(키(m)*키(m))
		
//		   BMI 지수에 따른 정보
//
//		      - 18.5 미만 : 저체중
//		      - 18.5 이상 ~ 23 미만 : 정상
//		      - 23 이상 ~ 25 미만 : 과체중
//		      - 25 이상 ~ 30 미만 : 비만
//		      - 30 이상 : 고도비만
//		Scanner sc = new Scanner(System.in);
//		
//		double height,weight,bmi;
//		String bmistr="";
//		
//		System.out.print("키를 입력하세요(소수점까지) : ");
//		height = sc.nextDouble();
//		height = height / 100.0; 	// cm -> m로 변환.
//		
//		System.out.print("체중를 입력하세요(소수점까지) : ");
//		weight = sc.nextDouble();
//		
//		bmi = weight / (height*height);
//		
//		if(bmi < 18.5) {
//			bmistr = "저체중";
//		}else if(bmi>=18.5 && bmi<23) {
//			bmistr = "정상";
//		}else if(bmi>=23 && bmi<25) {
//			bmistr = "과체중";
//		}else if(bmi>=25 && bmi<30) {
//			bmistr = "비만";
//		}else{
//			bmistr = "고도비만";
//		}
//		System.out.println("당신의 키는 " + height +", 몸무게는"+ weight + ", BMI지수는 "+ bmistr+"입니다.");
		
		//예제2
		//시간과 분을 따로 입력받고 추가로 분을 더 입력받아 입력받은 시간에서 추가로 입력한 분의 더한 시간을 출력
		//입력시간은 24시간 형식을 입력받고 출력 시간은 오전/오후를 구분하는 12시간 형식을 출력
		
		Scanner sc = new Scanner(System.in);
		int hour,min,addmin,time;
		String day="오전";
		
		System.out.print("시간 입력 : ");
		hour = sc.nextInt();
		if(hour >=24) {
			System.out.println("24 이하로 시간을 입력하세요");
			System.exit(0);
		}
		System.out.print("분 입력 : ");
		min = sc.nextInt();
		if(hour >=60) {
			System.out.println("60 이하로 시간을 입력하세요");
			System.exit(0);
		}
		System.out.print("추가 분 입력 : ");
		addmin = sc.nextInt();
		
		time = min + addmin;
		
		if(time>=60) {
			int addhour = time / 60;
			time = time % 60;
			hour = hour + addhour;
		}
		if(hour==12) {
			day="오후";
		}else if(hour >=13&& hour <24) {
			hour = hour %12;
			day = "오후";
		}else if(hour >=10&& hour <12) {
			day = "오전";
		}else if(hour == 24) {
			hour = 12;
			day = "오전";
		}else if(hour >=25) {
			hour = hour %24;
		}
		
		System.out.println("현재시간은 " + day+" "+hour+"시"+time+"분 입니다");
		
		
		
		
	}

}
