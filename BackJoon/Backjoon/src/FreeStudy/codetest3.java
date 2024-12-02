package FreeStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

	public class codetest3{
		public static void main(String[] args) {
			/*
			 * 1 -> 2초 [조건만]
				ABC - > 2
				DEF - > 3
				GHI - > 4
				JKL -> 5
				MNO -> 6
				PQRS -> 7
				TUV > 8 
				WXYZ ->9
				0 - > 11초 [조건만]
				arr = ['abc','def','ghi','jkl','mno',pqrs','tuv',wxyz']
				arr -> a~z 까지 배열에 담고
				사용자가 입력한 문자열을 -> 문자로 분리한 뒤
				사용자가 입력한 알파벳과 배열에 있는 값을 비교하고 사용자가 입력한 값이 사용자가 ae 를 입력했을때
			 * 
			 * 
			 * */
			// 값 배열에 저장
			String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
			// 사용자 입력
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			// 사용자가 입력한 배열을 짤라서 보관
			String[] ch = {};
			ch = input.split("");
			System.out.println(input);
			
			
			
			
//			char[] arrCh = arr[i].toCharArray();
			
			
			
			
			
			
		
		
			
			
		
	}  
}