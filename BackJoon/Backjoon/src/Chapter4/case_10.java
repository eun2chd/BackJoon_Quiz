package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_10 {

	public static void main(String[] args)throws IOException {
	
		// 단어 개수 출력하기
		
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력문자열
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int s = Integer.parseInt(br.readLine());
		int count = 0;
		String str = br.readLine();
		
		// 공백을 기준으로 문자열을 분리하기
		// 분리한 문자열을 문자 배열에 담아주기
		String[] ch = str.split(" ");
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == "") {
				continue;
			} else {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
