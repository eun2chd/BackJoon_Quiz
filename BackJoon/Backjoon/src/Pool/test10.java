package Pool;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int a;
        int myMoney = 0;
        
        // 1번 ATM 출력문이 계속해서 나오게 해준다.
        while(flag) {
        	int sum;
        	int money;
            System.out.println("***ATM시뮬레이터***");

            System.out.println("1.잔액조회");
            System.out.println("2.입금하기");
            System.out.println("3.출금하기");
            System.out.println("4.종료하기");
            
            a = sc.nextInt();       
            
            if(a == 1) {
            	System.out.println("나의 잔액 : " + myMoney);
            } else if(a == 2) {
            	System.out.println("입금하기");
            	money = sc.nextInt();
            	// 입금한 돈 저장하기
            	myMoney += money;
            	System.out.println("현재 " + myMoney + " 원이 저장되었습니다.");
            } else if(a == 3) {
            	System.out.println("얼마를 출금하실건가요?");
            	money = sc.nextInt();
            	// 현재 보유한 돈보다 큰값을 입력할때
            	// myMoney < money
            	if (myMoney < money) {
            		System.out.println("현재 잔액보다 큽니다.");
            		System.out.println("현재 잔액 : " + myMoney);
            	// 사용자가 0보다 작은 값을 입력할때
            	} else if (money <= 0) {
            		System.out.println("0보다 큰값을 입력하세요.");        		
            	} else {
            		// 현재 금액에서 입력한 금액 빼기
            		myMoney -= money;
            	}
            }
            else if(a == 4) {
            	break;
            }
        }

	} // end main

} // end class
