package Chapter2;

import java.util.Scanner;

public class case_03 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		
		if(score % 4 == 0 && score % 100 != 0 || score % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
