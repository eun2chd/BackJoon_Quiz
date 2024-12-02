package pratice.ch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch5 {

	public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);


	      int input = 0;//충전금액
	      int choice=0; // 말고르기
	      int random = (int)(Math.random()*(3-1+1)+1);//랜덤 당첨 말 
	      int go=0;//배팅금액
	      int money = 10000;
	      int result = money;//잔액
	      
	      while(true) { 
	     
	         System.out.println("첫번재 result 값" + result);

	         //배팅금액은 내가 가지고 있는 돈보다 작아야됨
	         System.out.println("경마 게임에 오신 걸 환영합니다.");
	         System.out.println("1.게임 시작");
	         System.out.println("2.잔액 충전");
	         System.out.println("3.잔액 조회");
	         System.out.println("4.게임 종료");
	         System.out.print("번호를 선택하세요:");
	         int num = Integer.parseInt(sc.nextLine());//1~4선택


	         switch(num) {
	         case 1: 
	            System.out.println("말들이 준비 되었습니다. 배팅하고 싶은 말을 선택해주세요.");
	            System.out.println("1번 말 : 우승한 경력이 많지만 은퇴시기를 앞둔 늙은 말");
	            System.out.println("2번 말 : 3월달 연습 기록이 가장 좋았던 젊은 말");
	            System.out.println("3번 말 : 떠오르는 신예 말");
	            System.out.println("번호를 선택하세요:");
	            choice = Integer.parseInt(sc.nextLine());

	            System.out.print(choice+"번 말이 우승할 경우 배팅액의 50퍼센트를 받게 됩니다.");
	            System.out.println("현재 잔액은 :" +result+ "원 입니다.");
	            System.out.print("배팅할 금액을 입력해주세요(최소 금액 : 1000원) :" );

	            go =Integer.parseInt(sc.nextLine());//배팅금액
	            
	            if (result<go){	         
	               System.out.println("잔액이 부족합니다");
	               System.out.println("배팅할 금액을 다시 입력해주세요" );
	               System.out.println("배팅할 금액(최소 금액 : 1000원):" );
	               go =Integer.parseInt(sc.nextLine());//배팅금액

	            }
	            // 현재돈 >= 배팅돈 
	            else if (result>=go){
	               System.out.println(go+"원이 입금 되었습니다" );
	               go =Integer.parseInt(sc.nextLine());//배팅금액
	            }

	            if(choice==random) {
	               System.out.println("축하합니다. 당신이 고른 말이 우승했습니다.");
	               result = money+input-go;
	               result= go+go/2;
	               System.out.println("현재 잔액은 : " + result+"입니다.");

	               //잔액
	            }

	            else {
	               System.out.println("아쉽습니다."+random+"번 말이 우승했습니다.");
	               System.out.println("배팅액"+go+"원을 잃었습니다");
	               result -= go;

	               continue;
	            }

	            break;

	         case 2 :  
	            System.out.print("얼마를 충전하겠습니까? :");
	            input = Integer.parseInt(sc.nextLine());
	            result += input;
	            System.out.println(input+"원이 충전되었습니다!");
	            System.out.println("충전 후 잔액은"+result+"원 입니다.");
	            break;

	         case 3 : 
	            result = money+input-go;
	            System.out.println("현재 잔액은 "+ result +"원 입니다.");

	            break;


	         case 4 : 
	            System.out.println("게임을 종료하겠습니다.");
	            System.exit(0);  



	         }

	      }

	} // end main

}
// end class
