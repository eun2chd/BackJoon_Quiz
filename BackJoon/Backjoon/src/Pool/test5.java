package Pool;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("시작값을 입력해주세요");

	      int str = Integer.parseInt(sc.nextLine());

	      System.out.print("끝값을 입력해주세요");

	      int fin = Integer.parseInt(sc.nextLine());

	      int i = 1;
	      
	      if (str>fin) {
		       System.out.print("오류");
		  } else {
		      while(str <=i && i <= fin) {
			         System.out.println(i);

			         i ++;

			
			      } 
		        	 
		 }




	     
	} 
}
