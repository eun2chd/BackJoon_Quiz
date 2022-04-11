package Chapter3;


import java.util.Scanner;


public class case_14 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		int N = input.nextInt();
		int temp = 0;
		int result = 0;
		int i = 0;
		
		int A = N / 10; // 2
		int B = N % 10; // 6

		
		temp = A+B;  // 8
		temp %= 10;  // 8
		
		result = (B * 10) + temp;
	
		while(flag) {
			i++;
			if(N != result) {
				
				A = result / 10;
				B = result % 10;
				
				temp = A + B;
				temp %= 10;
				
				result = (B * 10) + temp;
			}else {
				flag = false;
			}
			
			
		} // while
		
		System.out.println(i);


	}

}
