package Chapter2;

import java.util.Scanner;

public class case_06 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		if(M < 45 && H != 0) {
			H--;
			M = M + 60 - 45;
		}else if(M >= 45) {
			M = M - 45;
		}else if(H == 0) {
			H = 23;
			M = M + 60 - 45;
		}	
		System.out.println(H+" "+M);
	}

}
