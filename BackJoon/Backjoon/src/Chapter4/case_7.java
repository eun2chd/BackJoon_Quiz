package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_7 {

	public static void main(String[] args)throws IOException {
	
		
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력문자열
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int s = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < s; i++) {
			
			String[] str = br.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
