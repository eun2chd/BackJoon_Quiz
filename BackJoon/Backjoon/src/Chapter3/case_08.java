package Chapter3;


import java.util.Scanner;


public class case_08 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		
		for(int i=1; i <= T; i++) {
			
			int A = input.nextInt();
			int B= input.nextInt();
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
			
		}
		
		

		
	}

}
