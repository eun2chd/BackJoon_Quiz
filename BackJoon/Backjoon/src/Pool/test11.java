package Pool;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 1000;// 콜라 값
		int b = 800;// 사이다 값
		int c = 1500;// 매실차 값
		int d = 3000; // 내가 가지고 있던 돈
		int e = 0; // 내가 사용한돈

		while (true) {
			System.out.println("===자판기 시뮬레이터===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1.콜라(1000)");
			System.out.println("2.사이다(800)");
			System.out.println("3.매실차(1500)");
			System.out.println("[0]소지품확인");

			int menu = Integer.parseInt(sc.nextLine());// 메뉴 1~3/0 선택

			while (e == 3000)

				if (a == 1) {
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 +1");
					System.out.println("소지금 -" + a);

				} else if (a == 2) {
					System.out.println("사이다를 구매했습니다.");
					System.out.println("사이다 +1");
					System.out.println("소지금 -" + b);

				}

				else if (a == 3) {
					System.out.println("매실차를 구매했습니다.");
					System.out.println("매실차 +1");
					System.out.println("소지금 -" + c);

				}

				else if (a == 0) {
					System.out.println("===소지품 목록===");
					System.out.println("소지금 :" + e);
					System.out.println("콜라 :(1000)");
					System.out.println("사이다 :(800)");
					System.out.println("매실차 :" + "개");

				}
		}

	}
}