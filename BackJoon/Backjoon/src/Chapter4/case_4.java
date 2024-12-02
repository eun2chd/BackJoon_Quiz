package Chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class case_4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		char word = input.charAt(0);
		
		int asc = (int)word;
		System.out.println(asc);
		

	}


}
