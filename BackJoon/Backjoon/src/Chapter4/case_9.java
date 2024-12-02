package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_9 {

	public static void main(String[] args)throws IOException {
	
		// 단어 개수 출력하기
		
		// 백준에서 시간초과 해결하기 위해 문자열 입력시 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력문자열
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int resOne = 0;
		int resTwo = 0;
		
		String str = br.readLine();
		String[] ch = str.split(" ");
		int[] arr = new int[2];

		
		for(int i = 0; i < ch.length; i++) {
			int arrNum = Integer.parseInt(ch[i]);
			arr[i] = arrNum;
			
			if(i == 0) {
				while(arr[i] != 0) {
					int digOne = arr[i] % 10;
					resOne = resOne * 10 + digOne; //3
					arr[i] /= 10; // 79
					
				}
				arr[i] = resOne;

			} else {
				while(arr[i] != 0) {
					int digTwo = arr[i] % 10;
					resTwo = resTwo * 10 + digTwo;
					arr[i] /= 10;
				
				}
				arr[i] = resTwo;
		
				if(arr[0] > arr[1]) {
					System.out.println(arr[0]);
				}else {
					System.out.println(arr[1]);
					bw.flush(); // 버퍼안에 문자열 전체 출력
					bw.close(); // 사용이 끝났으면 닫아주기
				}
			}
			
		}
		
	}

}
