package Pool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		// Mississipi
		// zZa -> Z
		// Z   -> Z
		// baaa -> A
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine().toUpperCase();
		// 알파벳 카운트배열 
		int[] alphas = new int[26];
	
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					alphas[ch - 'A']++;
				}
		}
		
		 int maxCount = -1;
		 char mostFrequent = '?';
		 boolean isDuplicate = false;
		
		 for (int i = 0; i < 26; i++) {
			 if (alphas[i] > maxCount) {
				 maxCount = alphas[i];
				 mostFrequent = (char) (i + 'A'); // 가장 많이 사용되는 알파벳
				 isDuplicate = false;
			 } else if (alphas[i] == maxCount) {
				 isDuplicate = true;
			 }
		 }
		
	     // 결과 출력
	        if (isDuplicate) {
	            System.out.println("?");
	        } else {
	            System.out.println(mostFrequent);
	        }

	}
}
