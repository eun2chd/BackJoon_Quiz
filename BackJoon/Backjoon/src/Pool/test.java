package Pool;
import java.util.Scanner;

public class test {
	
	    static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        //내가 자주 빼먹는 부분

	        System.out.println("국어 점수를 입력하세요 : ");
	        int name1 = Integer.parseInt(sc.nextLine());

	        System.out.println("영어 점수를 입력하세요 : ");
	        int name2 = Integer.parseInt(sc.nextLine());
	        System.out.println("수학 점수를 입력하세요 : ");
	        int name3 = Integer.parseInt(sc.nextLine());

	        int name4 = (name1+name2+name3);
	        double name5 = (double)(name1+name2+name3)/3
	                ;
	        System.out.println("=======결과========");
	        System.out.println("합계 : "+name4);
	        System.out.println("평균 : "+name5);

	        if(90<=name5) {
	            System.out.println("등급 : A등급");

	        }else if(80<=name5){

	        System.out.println("등급 : B등급");
	        }
	        else if (70<=name5){

	        System.out.println("등급 : C등급");
	        }
	        else if (60<=name5) {
	            System.out.println("등급 : D등급");

	        }else System.out.println("등급 : F등급");
	  }
}
