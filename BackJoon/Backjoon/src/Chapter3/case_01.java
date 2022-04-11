package Chapter3;

import java.util.Scanner;

public class case_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int su1 = input.nextInt();
		
		int num1 = su1 + 1;
		
		for(int i = su1; i < num1; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		
			
		}
		
	}
	
}
