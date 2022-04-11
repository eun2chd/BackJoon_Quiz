package Chapter1;

import java.util.Scanner;

public class case_12 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int result1 = (A+B)%C;
		int result2 = ((A%C) + (B%C))%C;
		int result3 = (A*B)%C;
		int result4 = ((A%C) * (B%C)) % C;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
}
