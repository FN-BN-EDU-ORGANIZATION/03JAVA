package C202308;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class C230807 {	


	public static void main(String[] args) {
		//파일에 저장된 대소문자 섞인 단어 목록을 읽어와 구분자로 분리한 후 
		//모두 대문자로 변환하고 다시 파일에 저장하는 프로그램 작성
		 String inputFile = "input.txt";
	     String outputFile = "output.txt";
	        
         try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
              BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
              String line;
              while ((line = reader.readLine()) != null) {
                 String[] words = line.split(";");
                 for (int i = 0; i < words.length; i++) {
                     words[i] = words[i].toUpperCase();
                 }
                 writer.write(String.join(";", words));
                 writer.newLine();
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         
	     //숫자 피라미드 트리를 출력
         int numberOfRows = 4; // 변경하여 다른 숫자 피라미드 트리를 출력할 수 있습니다.
         
         int count = 1;
         for (int i = 1; i <= numberOfRows; i++) {
             for (int j = numberOfRows - i; j > 0; j--) {
                 System.out.print(" ");
             }
             
             for (int j = 1; j <= i; j++) {
                 System.out.print(count++ + " ");
             }
             
             System.out.println();
         }


	}

}
