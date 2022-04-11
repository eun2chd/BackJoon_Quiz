package Chapter3;

import java.util.Scanner;

public class case_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sc = input.nextInt();
		
		for(int i = 0; i < sc; i++) {
			int su1 = input.nextInt();
			int su2 = input.nextInt();
			
			System.out.println(su1 + su2);
			
		}
	}
	
}
