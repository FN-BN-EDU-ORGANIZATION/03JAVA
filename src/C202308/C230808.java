package C202308;

import java.util.LinkedList;

public class C230808 {

	public static void main(String[] args) {
		//Linked List 자료 구조 개념을 이용해 정수 값 목록을 생성하고, 
		//목록의 합계와 평균을 계산하는 프로그램을 작성
        LinkedList<Integer> numbers = new LinkedList<>();

        // 목록에 정수 값을 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
	}
}
