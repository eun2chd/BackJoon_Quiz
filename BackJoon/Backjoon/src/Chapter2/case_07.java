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
		
		
		// 1 ~ 6 ������ ���� ���� �ֻ��� 3���� ������ ���� ��Ģ�� ���� ����� �޴´�.
		
		// ���� �� 3���� ������ 10000 �� + (���� ��) x 1000 �� ��� (�Ϸ�)
		
		// ���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
		
		// ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
		
		
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
