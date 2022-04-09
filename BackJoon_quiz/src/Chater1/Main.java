package Chater1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		int time = input.nextInt();
		int count = 0;
		int  hour = 0;
		
		M = time + M;
		
		// 분이 60보다 작으면 시간을 더할 필요가 없다.
		// 분이 60보다 크면 분에서 - 60 을 해줘야 하고 시간도 더해줘야한다.
		
			if(M > 59) {
			    count =  M / 60;
				H = H + count;
				M = M - 60 * count;	
				if(M == 60) {
					M = 0;
				}
			}
			
			hour = H - 24;
			
			if(H == 24) {
				H = 0;
			}else if(H > 24) {
				H = 0;
				H = H + hour;

			}
			System.out.println(H + " " + M);
			
		}

}
