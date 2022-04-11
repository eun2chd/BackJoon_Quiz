package Chapter1;

import java.util.Scanner;

public class case_13 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		int first = B % 10;		
		int last = B / 100;
		int mid =  (B / 10) % 10;
		
		
		System.out.println(A * first);
		System.out.println(A * mid);
		System.out.println(A * last);
		System.out.println(A * B);
	}
	
}
