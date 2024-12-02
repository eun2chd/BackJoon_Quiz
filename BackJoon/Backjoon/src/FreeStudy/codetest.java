package FreeStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codetest {
	
	static int isPrime(int number) {
		int i;
		for(i=2; i < number;i++) {
			if(number % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) throws IOException {
		
		// 자기 점수중에 최대값을 고름다
		// 40 60 70 -> 최대값은 70 = 이값은 M 이라고 한다.
		// 모든 점수를 점수/M * 100 으로 고쳐준다.
		// EX 수학점수가 50점이면 50/70 * 100 
		//
		
	     Scanner scanner = new Scanner(System.in);
	     
	    int number = 13195;
	    int max_div = 0;
	    int i;
	    
	    for(i=2; i < number; i++) {
	    	if(isPrime(i) == 1 && number % i == 0) {
	    		max_div = i;
	    	}
	    }
	    
	    System.out.println(max_div);
	    
	   
	}
}