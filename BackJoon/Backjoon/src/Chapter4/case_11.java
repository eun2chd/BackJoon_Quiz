package Chapter4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class case_11 {

	public static void main(String[] args) throws IOException {

		/*
		 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면
		 * 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
		 * 
		 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선
		 * 1초씩 더 걸린다.
		 * 
		 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를
		 * 들어, UNUCIC는 868242와 같다.
		 *              9+7+9+3+5+3 = 27+9 =36초?
		 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		 */
		//  2      3     4      5    6     7       8     9     0 
		// ABC 3초 DEF 4 GHI 5 JKL 6 MNO 7 PQRS 8 TUV 9 WXYZ 10 0 11
		
		// WAPQORS << 입력이 들어오면
		// 문자열 입력받기
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine().toUpperCase();
		int totalTime = 0;
		// 문자열을 문자 배열로 변환
		for(char ch : str.toCharArray()) {
			switch(ch) {
			case 'A' : case 'B' : case 'C' :
				totalTime += 3;
				break;
			case 'D' : case 'E' : case 'F' :
				totalTime += 4;
				break;
			case 'G' : case 'H' : case 'I' :
				totalTime += 5;
				break;
			case 'J' : case 'K' : case 'L' :
				totalTime += 6;
				break;
			case 'M' : case 'N' : case 'O' :
				totalTime += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :
				totalTime += 8;
				break;
			case 'T' : case 'U' : case 'V' :
				totalTime += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				totalTime += 10;
				break;
			default : 
				break;
			}
		}
		
		System.out.println(totalTime);
		
		bw.flush(); 
		bw.close();

	}

}
