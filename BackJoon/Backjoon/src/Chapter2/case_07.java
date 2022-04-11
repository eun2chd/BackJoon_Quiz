package Chapter2;

import java.util.Scanner;

public class case_07 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int su1,su2,su3;
		int result = 0;
		int max = 0;
		
		su1 = input.nextInt();
		su2 = input.nextInt();
		su3 = input.nextInt();
		
		
		// 1 ~ 6 까지의 눈을 가진 주사위 3개를 던져서 다음 규칙에 따라 상금을 받는다.
		
		// 같은 눈 3개가 나오면 10000 원 + (같은 눈) x 1000 의 상금 (완료)
		
		// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		
		// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		
		
		if(su1 == su2 && su1 == su3 && su2 == su3) {
			result = 10000 + (su1 * 1000);
		}else if(su1 == su2 && su1 != su3 || su1 == su3 && su1 != su2 || su1 != su2 && su1 != su3) {
			if(su1 == su2) {
				result = 1000 + (su1 * 100);
			}else if(su1 == su3) {
				result = 1000 + (su1 * 100);
			}else if(su2 == su3) {
				result = 1000 + (su2 * 100);
			}
		}
		
		if(su1 != su2 && su1 != su3 && su2 != su3) {
			
			if(su1 > su2 && su1 > su3) {
				max = su1;
				result = max * 100;
			}else if(su2 > su1 && su2 > su3)
			{
				max = su2;
				result = max * 100;
			}else {
				max = su3;
				result = max * 100;
			}
			
			
		}
		

		System.out.println(result);
	}

}
