package Chapter4;

import java.util.Scanner;

public class case_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0, min = 0;

		int N = input.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}

		max = arr[0];
		min = arr[0];

		for (int j = 0; j < arr.length; j++) {

			if (max < arr[j]) {
				max = arr[j];
			}

			if (min > arr[j]) {
				min = arr[j];
			}

		}

		System.out.println(min + " " + max);

	}

}
