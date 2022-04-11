package Chapter1;

import java.util.Scanner;

public class case_08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		double sum = (double)num1 / (double)num2;
		
		System.out.println(sum);
	}
	
}
