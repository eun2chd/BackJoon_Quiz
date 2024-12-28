package pratice.ch;

import java.util.Scanner;

public class ch9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalNum = 0;
		boolean flag = true;

		System.out.println("31 게임을 시작합니다!");
		System.out.println("1, 2, 3 중 하나의 숫자를 입력하세요:");

		while (flag) {
			// 사용자 입력
			System.out.print("사용자: ");
			int userInput = sc.nextInt();
			if (userInput < 1 || userInput > 3) {
				System.out.println("1, 2, 3 중 하나만 입력해주세요.");
				continue; // 입력이 유효하지 않으면 다시 입력
			}

			// 사용자의 입력만큼 숫자 증가
			for (int i = 0; i < userInput; i++) {
				totalNum++;
				System.out.println("사용자 : " + totalNum);
				if (totalNum == 31) {
					System.out.println("컴퓨터 승리!");
					flag = false;
					break;
				}
			}
			if (!flag)
				break; // 게임이 끝났으면 루프 종료

			// 컴퓨터 입력
			int aiRand = (int) (Math.random() * 3) + 1; // 1~3 랜덤 숫자
			System.out.println("컴퓨터가 " + aiRand + "개를 입력합니다.");

			// 컴퓨터의 입력만큼 숫자 증가
			for (int i = 0; i < aiRand; i++) {
				totalNum++;
				System.out.println("컴퓨터 : " + totalNum);
				if (totalNum == 31) {
					System.out.println("사용자 승리!");
					flag = false;
					break;
				}
			}
		}

		System.out.println("게임 종료!");
		sc.close();

	} // end main

} // end class
