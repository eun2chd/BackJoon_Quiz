package Pool;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc =  new Scanner(System.in);
		   int i = 0;
		   while(i < 3) { // start while
			   	  i++;
			   
			      System.out.println("==============");
			      System.out.print(i + " 번째이름 : ");
			      String name = sc.nextLine();
			      
			      System.out.println("==============");
			      
			      System.out.print("국어 : ");
			      String name2 = sc.nextLine();
			      int num1  = Integer.parseInt(name2);

			      System.out.print("영어 : ");

			      String name3 = sc.nextLine();
			      int num2  = Integer.parseInt(name3);

			      System.out.print("수학 : ");

			      String name4 = sc.nextLine();
			      int num3  = Integer.parseInt(name4);
			      System.out.println("==============");

			   
			      System.out.println("합계 : "+ (num1+num2+num3));
			   
//			      String input14 = sc.nextLine();
//			      int num4  = Integer.parseInt(input14);

			      System.out.println("평균 :" + (float)(num1+num2+num3)/3 );

//			      String input15 = sc.nextLine();
//			      int num5  = Integer.parseInt(input15);
			      System.out.println("==============");
			    
		   } // end while 
		   
	} // end main

} // end class
