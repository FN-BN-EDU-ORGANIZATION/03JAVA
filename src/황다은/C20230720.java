package 황다은;

import java.util.Scanner;

class Book{
	private String bookTitle;
	private String author;
	
	public Book() {}
	public Book(String bookTitle, String author) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
	}
	public void result() {
		System.out.println(bookTitle+","+author);
	}
	
}

public class C20230720 {
	//배열문제
		public static void main(String[] args) {
			
			Book[] library = new Book[5];
			library[0]=new Book("책제목0","홍길일");
			library[1]=new Book("책제목1","홍길이");
			library[2]=new Book("책제목2","홍길삼");
			library[3]=new Book("책제목3","홍길사");
			library[4]=new Book("책제목4","홍길오");
			
			for(int i =0;i<library.length;i++ ) {
				library[i].result();
			}
			
			//정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
			Scanner scn = new Scanner(System.in);

			int[] arr = new int[10];
			int i;

			for( i=0; i<10; i++)
			{
				arr[i] = scn.nextInt();
			}

			System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		}
		
	}
	
	

