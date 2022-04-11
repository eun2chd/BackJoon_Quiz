package Chapter2;

import java.util.Scanner;

public class case_02 {
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		char ch;
		
		if(score >= 90) {
			ch = 'A';
		}else if(score >= 80) {
			ch = 'B';
		}else if(score >= 70) {
			ch = 'C';
		}else if(score >= 60) {
			ch = 'D';
		}else {
			ch = 'F';
		}
		System.out.println(ch);
	}

}
