package pratice.ch;

import java.util.Scanner;

public class ch6 {

	public static void main(String[] args) {

	// Baskin Robbins 31 Game 코드 작성
	// 1부터 시작, 31이 될때까지 서로 턴을 교대하며 숫자를 증가
	// 31을 먼저 외치는 사람이 지는 게임
		Scanner sc = new Scanner(System.in);

		int win = 0;
		int lose = 0;

		while (true) {
			System.out.print("Baskin Robbins31 Game\n" + "1. Game Start\n" + "2. Game Score\n" + "3. End Game\n" + ">>");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("<< Game Start >>");
				int totalNum = 0;

				while (true) {
					// 사람
					System.out.print("Input Number(1~3) : ");
					int inputNum = Integer.parseInt(sc.nextLine());
					if (!(1 <= inputNum && inputNum <= 3)) {  // 1 <= 2 && 2 <=3 t/t = !t = f        1 <= 4 && 4 <= 3 = t/f = f = t
						// 
						System.out.println("1~3 사이의 숫자를 입력해주세요.");
						continue;
					} else {
						int i = 0; // 초기값 지정
						while (i <= inputNum - 1) { // 조건문
							i++; // 증감문
							totalNum += 1;
							System.out.println(totalNum + "!");

							if (totalNum == 31) {
								lose += 1;
								System.out.println("--31! 나의 패배--");
								break;
							}
						}
					}

					if (totalNum == 31)
						break;

					// 컴퓨터
					int ComNum = (int) (Math.random() * (3 - 1 + 1)) + 1; // 1~3
					System.out.println("<< Computer Turn >>\n" + "Computer Number(1~3) : " + ComNum);
					int i = 0; // 초기값 지정
					while (i <= ComNum - 1) { // 조건문
						i++; // 증감문
						totalNum += 1;
						System.out.println(totalNum + "!");

						if (totalNum == 31) {
							win += 1;
							System.out.println("--31! 나의 승리--");
							break;
						}
					}

					if (totalNum == 31)
						break;
					// System.out.println("totalNum = " + totalNum );
				}

			} else if (menu == 2) {
				System.out.println(
						"<< 당신의 전적 >>\n" + "W I N : " + win + "\n" + "L O S E : " + lose + "\n" + "D R A W : 0");
			} else if (menu == 3) {
				System.out.println("<< 게임 종료 >>");
				System.exit(0);
			} else {
				System.out.println("1~3사이의 숫자를 선택해주세요.");
			}
		}

	} // end main

} // end class
