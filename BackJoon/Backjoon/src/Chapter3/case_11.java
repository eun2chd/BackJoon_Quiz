package Chapter3;


import java.util.Scanner;


public class case_11 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X = input.nextInt();
		
		
		for(int i =0;i<N;i++) {
			
			int su = input.nextInt();
			
			if(su < X) {
				System.out.print(su+" ");
			}
			
			
		}
		
		
		
	}

}
