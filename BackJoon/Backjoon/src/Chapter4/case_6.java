package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_6 {

	public static void main(String[] args)throws IOException {
		//2
		//3 ABC
		//5 /HTP
		
		// 위와같이 입력을한다면 일단 숫자와 문자를 배열에 담고
		// split 으로 분리해줘야함
		
		// 문자로받은 숫자3은 정수로 파싱해주기
		// 문자하나씩 빼와서 반복해야하니 charat로 하나씩가져오기
		
		// AAABBBCCC
		// ///HHHHHTTTTTPPPPP
		
		// charAt str이 가르키는 문자열에서 몇번째 값을 가져올것인지?
		// 
		
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
