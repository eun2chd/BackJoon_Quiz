package Chapter4;

import java.util.Scanner;

public class case_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[9];
		int temp = 0;
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		temp = arr[0];

		for (int j = 0; j < arr.length; j++) {

			if (temp <= arr[j]) {
				temp = arr[j];
				k = j + 1;
			}
		}

		System.out.println(temp);
		System.out.println(k);

	}

}
