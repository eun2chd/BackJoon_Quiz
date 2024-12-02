package pratice.ch;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {

		// 콜라 / 사이다 / 매실 변수를 각각 1개씩 공간을 만든다. [ 가격 ]
		int cola = 1000, cider = 800, plum = 1500;
		// 콜라 / 사이다 / 매실 변수를 각각 1개씩 공간을 만든다. [ 갯수 ]
		int colaCnt = 0, ciderCnt = 0, plumCnt = 0;
		// 내가 가질돈을 저장할 변수를 하나 만들어준다.
		int myMoney = 3000; // 내돈은 0원으로 초기화 한다.

		// 입력받을 sc를 생성한다.
		Scanner sc = new Scanner(System.in);

		// 자판게 메뉴를 만들어준다.
		while (true) {
			System.out.println();
			System.out.println("===자판기 시뮬레이터===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1.콜라(1000)");
			System.out.println("2.사이다(800)");
			System.out.println("3.매실차(1500)");
			System.out.println("[0]소지품확인");

			// 자판기 선택할 입력변수를 생성한다.
			int menu = sc.nextInt();

			// 자판기가 해당 조건에 맞게 처리되도록 조건문을 작성한다.
			if (menu == 1) {
				// 돈이있는지 없는지 판단하고 돈이있으면 계산 없으면 못사게 한다.
				// 내돈이 0보다 크면 콜라구매
				if (myMoney > 0) {
					// 구매했으면 현재 내돈에서 콜라값을 빼준다.
					myMoney -= cola;
					// 콜라를 구매했으면 값을 1 증가시킨다.
					colaCnt++;
					System.out.println("콜라를 구매했습니다.");
				} else {
					System.out.println("!!!!!!!!!!!돈이 부족합니다.!!!!!!!!!1");
				}

				// 현재 콜라 갯수와 소지금을 출력한다.
				System.out.println("콜라 갯수 : " + colaCnt);
				System.out.println("소지금 : " + myMoney);
			} else {
				System.out.println();
				System.out.println("===소지품 목록===");
				System.out.println("소지금 :" + myMoney);
				System.out.println("콜라 갯수 :  : " + colaCnt);
				System.out.println("사이다 갯수 : " + ciderCnt);
				System.out.println("매실차 갯수 : " + plumCnt);
			}
		}

	} // end main

} // end class
