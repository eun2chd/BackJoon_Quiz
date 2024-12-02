package pratice.ch;

import java.util.Scanner;

public class ch4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


	      while(true) {
	         int b=0;
	            int rand = (int)(Math.random()*(31-1+1)+1);
	         
	         System.out.println("== Up & Down Game ==");
	         System.out.println("                    ");
	         System.out.println("1.Game Start ");
	         System.out.println("2.Game Score ");
	         System.out.println("3.End Game");
	         System.out.println("                    ");
	         System.out.print(">>");
	         int a = Integer.parseInt(sc.nextLine());
	            int c = 0;//몇번만에 맞췄는지
	         
	            
	            switch(a) {

	            case 1 :
	               System.out.println("<<Game Start>>");
	               System.out.println("원하는 번호를 입력해주세요.");
	                b = Integer.parseInt(sc.nextLine());
	               System.out.println("Input Number :"+b);
	               while(b==rand) {
	               if(b<rand) {
	                  System.out.print("<<  U  P  >>");
	                  System.out.println("Input Number :"+b);
	                  
	               }
	               else if(b>rand){
	                  System.out.print("<<  D O W N  >>");
	                  System.out.println("Input Number :"+b);

	               }else if(b==rand){
	                  System.out.print("<< 정  답  >>");
	               
	                  break;
	               }
	               
	               }
	            
	         case 2 :
	            System.out.println("현재까지 최단기록은"+c+"회 입니다.");
	         
	            //몇번만에 맞췄는지 현재까지 최고기록
	            //최단기록

	         case 3 :   
	            System.out.println("End Game");
	            System.exit(0);
	            
	         default:
	            System.out.println("1,2,3번 중 선택해주세요");
	            System.out.println("                  ");
	         
	      }
	      }


	} // end main

} // end class
