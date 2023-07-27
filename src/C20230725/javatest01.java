package myjava01_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MyJava01_Collections_Code {

	public static void main(String[] args) {
		//가장 많이 쓴다
		List<Integer> nums = new ArrayList<Integer>();
		
		List<Integer> ex1 = new LinkedList<Integer>();
		
		List<Integer> ex2 = new Stack<Integer>();
		
		List<Integer> ex3 = new Vector<Integer>();
		
		
		
		//뭐든지 다 집어넣을수있는 리스트 위에것을 다 집어넣을수있는 .. 
		List everything = new ArrayList();
		everything.add(10);
		everything.add("안녕");
		everything.add('a');
		everything.add(new Object());  
		everything.add(3.14);  
	

}
	
}
