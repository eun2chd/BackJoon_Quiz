package Chapter3;

import java.util.Scanner;

public class case_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;

		while (flag) {

			int A = input.nextInt();
			int B = input.nextInt();

			if (A == 0 && B == 0) {
				flag = false;
			} else {
				System.out.println(A + B);

			}

		}

	}

}
