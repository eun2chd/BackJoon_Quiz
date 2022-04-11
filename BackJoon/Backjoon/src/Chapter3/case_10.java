package Chapter3;

import java.util.Scanner;

public class case_10 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			for(int j = N; i < j-1 ;j--) {
					 System.out.print(" ");
				
		
				    
			}
			for(int k = 0; k < i+1; k++)
			{
				System.out.print("*");
			}
		
			
			System.out.println();
		}
		
		
	}

}