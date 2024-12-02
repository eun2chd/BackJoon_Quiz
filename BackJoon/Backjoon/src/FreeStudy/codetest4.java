package FreeStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

	public class codetest4{
		public static void main(String[] args) {
			
			int s , el = 0;
			for(int i = 6; i <= 30; i++) {
				s = 0;
				for(int j = 1; j <= i / 2; j++) {
					if(i % j == 0) {
						System.out.println(i + "%" + j + "값 : " +i % j);
						s = s + j;
					}
				
			}
		
				if(s == i) {
					el++;
				}
		}
			
		System.out.println("el 값 : " + el);
	}  
}