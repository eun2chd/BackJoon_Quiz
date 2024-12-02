package Pool;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***ATM시뮬레이터***");

        System.out.println("1.잔액조회");
        System.out.println("2.입금하기");
        System.out.println("3.출금하기");
        System.out.println("4.종료하기");

        int a = Integer.parseInt(sc.nextLine());
        //a는 1~4번 선택하는거
        
        
        int b = 3000;
     
        while(true) {
        
        if (a==2) {

	           System.out.println("얼마를 입금 하시겠습니까?");
	           int m = Integer.parseInt(sc.nextLine());
	           System.out.println(m+"이 입금되었습니다.");
	        }
	        else if  (a==1) {
	
	           System.out.println("현재보유한 잔액은"+ b  +"원 입니다.");
	        }
       }
        
           
	} // end main

} // end class
