package 황다은;

import javax.swing.JOptionPane;

public class C20230802 {
	//배열
	public static void main(String[] args) {
		//arr 배열중에서 인덱스가 1인곳의 값을 출력해보자
		int[] arr = {10,20,30,40,3,60,-3};
		System.out.println(arr[1]);
		
		//arr배열중에서 60인 곳의 인덱스를 출력할려면?
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==60) {
				System.out.println(i);
			}
		}
		//arr배열 안의 모든 값을 더하고 총합과 평균을 출력
		int sum=0;
		double avg=0.0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		avg = sum/arr.length + sum%arr.length;
		System.out.println("총합 : " +sum+" 평균 : "+avg);
		
		//arr배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력
		for(int i=0;i<arr.length;i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println("arr["+i+"]:"+arr[i]);
			if(i !=3) {
				System.out.println("arr["+i+"]:"+arr[i]);
			}
		}
	}
	
}
