package Pool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String input = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		String [] list = new String[n];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			list[i] = input.substring(0,1) + input.substring(input.length()-1, input.length());
		}
		br.close();
		for(int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}

	}

}