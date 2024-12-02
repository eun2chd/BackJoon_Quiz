package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력문자열
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String input = br.readLine();
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		String su = br.readLine();
		
		if(su.length() != n) {
			bw.write("문자열 길이 불일치");
			bw.flush(); // 버퍼안에 문자열 전체 출력
			bw.close(); // 사용이 끝났으면 닫아주기
		}else {
			char [] ch = su.toCharArray();
			// 정수로 변환
			int [] numArr = new int[ch.length];
			for(int i = 0; i < ch.length; i++) {
				numArr[i] = ch[i] - '0';
			}
			
			for(int i = 0; i < numArr.length; i++) {
				sum += numArr[i];
			}
			System.out.println(sum);
		}

	}


}
