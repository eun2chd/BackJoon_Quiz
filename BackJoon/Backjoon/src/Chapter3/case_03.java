package Chapter3;

import java.util.Scanner;

public class case_03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int su1 = input.nextInt();
		int num1 = 0;

		for (int i = 0; i <= su1; i++) {
			num1 += i;
		}

		System.out.println(num1);

	}

}
