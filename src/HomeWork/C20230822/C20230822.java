package HomeWork.C20230822;

public class C20230822 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		
		try {
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("HELLOWORLD");
		System.out.println("HELLOWORLD");
	}
}
