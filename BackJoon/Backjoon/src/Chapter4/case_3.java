package Chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class case_3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String input = br.readLine();
		// 정수 입력
		int n = Integer.parseInt(br.readLine());
		
		// 문자열 담을 배열 선언
		String [] list = new String[n];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			// 문자열의 0,1 번째 값을 가져옴 + 문자열의 마지막 값을 가져옴 
			// 문자열 길이가 1이라고 가정하면 처음 첫번째 값 + 1-0 = 0,1 값을 가져와서 두개로 출력가능
			list[i] = input.substring(0,1) + input.substring(input.length()-1, input.length());
		}
		
		br.close();
		for(int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}

	}

}
