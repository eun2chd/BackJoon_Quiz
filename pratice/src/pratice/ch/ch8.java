package pratice.ch;

import java.util.Scanner;

public class ch8 {

	final static int BASKIN_FINAL_NUM = 31; // 해당 번호가 되면 게임 끝

	public static void main(String[] args) {

		// 베스킨 라빈스 31 게임 만들기
		// 사용자 와 컴퓨터가 서로 번갈아가며 숫자 1개 ~ 3개 를 입력한다.
		int win = 0, loss = 0; // 승패 기록
		boolean flag = true; // 게임판 while문 무한반복 여부

		// 스캐너 생성
		Scanner sc = new Scanner(System.in);

		// 게임판 만들기
		while (flag) {
			// 게임 메뉴 만들기.
			// 1. 게임 시작
			// 2. 게임 전적
			// 3. 게임 정료
			System.out.println("==== 베스킨 게임 ====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 전적");
			System.out.println("3. 게임 종료");
			System.out.print("메뉴 입력 : ");
			int game_Menu = sc.nextInt();
			// 사용자 입력값 검사
			if (game_Menu <= 0 || game_Menu > 3) {
				System.err.println("※메뉴에 없는 번호 입니다.※");
				continue;
			}
			// 사용자가 입력한 메뉴에 해당하는 번호로 이동한다.
			switch (game_Menu) {

			case 1:
				boolean gameFlag = true; // game이 진행되는 flag 값
				int totalNum = 0; // 누적할 값
				int st_First = 0; // 사용자랑 컴퓨터는 누가 먼저 입력할건지 랜덤으로 정하기
				st_First = (int) (Math.random() * 2) + 1; // 선공 랜덤

				if (st_First != 1) {
					System.out.println("");
					System.out.println("★[ 사용자 선제 공격 입니다. ]★");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("★[ 컴퓨터 선제 공격 입니다. ]★");			
					System.out.println("");
				}

				// 사용자가 몇개의 숫자를 입력할건지
				// 사용자가 입력하고 -> 컴퓨터가 숫자 입력하고 이 과정이 계속해서 반복되어야함
				while (gameFlag) {
					// 1 또는 2 랜덤하게 정해지는데 이 값을 이용해 누가 먼저 숫자를 외칠지 정함
					// st_First 값이 2라면 사용자가 먼저 숫자를 입력한다.
					int user_Input = 0; // 사용자 숫자 몇개쓸건지 입력받기
					if (st_First != 1) {			
						do {
						    System.out.println("몇개의 숫자를 사용할까요? [ 1 ~ 3 개만 가능 ]");
						    System.out.print("입력 : ");
						    user_Input = sc.nextInt();
						    if (user_Input <= 0 || user_Input > 3) {
						        System.err.println("잘못된 값입니다. 다시 입력해주세요.");
						    }
						} while (user_Input <= 0 || user_Input > 3);
						
					
						System.out.println();
						System.out.println("[★ 사용자는 " + user_Input + " 개의 숫자를 선택했어요. ★]");
						System.out.println();
						
				

						// 사용자가 숫자 외치기
						if (totalNum != BASKIN_FINAL_NUM) {
							for (int i = 0; i < user_Input; i++) {
								totalNum++; // 1부터 반복한큼 숫자 누적
								System.out.println("[ 사용자 ] >> " + totalNum);
								// 사용자가 31을 외치면!?
								if (totalNum == BASKIN_FINAL_NUM) {
									// 사용자 패배
									System.out.println("----결과----");
									System.out.println("사용자 패배..!! 다시 도전해봐요");
									System.out.println("게임을 종료하고 홈 메뉴로 이동하겠습니다.");
									System.out.println();
									loss++; // 패배 전적 기록 +1
									gameFlag = false; // while 문 종료
									break; // case 1 : 종료
								}
							}
						}
						System.out.println("----------------------");
						// totalNum 이 계속 누적되는데 31이 아니면 계속 반복
						if (totalNum != BASKIN_FINAL_NUM) {
							// 컴퓨터가 숫자 외치기
							int ai_Rand_number = (int) (Math.random() * 3) + 1;
							System.out.println("");
							System.out.println("[☆ 컴퓨터는 " + ai_Rand_number + " 개 숫자를 선택했어요 ☆]");
							System.out.println("");
							
							for (int i = 0; i < ai_Rand_number; i++) {
								totalNum++;
								System.out.println("[ 컴퓨터 ] >> " + totalNum);

								// 컴퓨터가 31을 외치면!?
								if (totalNum == BASKIN_FINAL_NUM) {
									// 사용자 승리
									System.out.println("----결과----");
									System.out.println("사용자 승리!! 축하드려요");
									System.out.println("게임을 종료하고 홈 메뉴로 이동하겠습니다.");
									System.out.println();
									win++; // 승리 전적 기록 + 1
									gameFlag = false; // while 문 종료
									break; // case 1 종료
								}
							}

						}

					} else {
						// st_First 값이 1 이라면 컴퓨터가 먼저 숫자를 입력한다.
						if (totalNum != BASKIN_FINAL_NUM) {
							// 컴퓨터가 숫자 외치기
							int ai_Rand_number = (int) (Math.random() * 3) + 1;
							System.out.println("");
							System.out.println("[☆ 컴퓨터는 " + ai_Rand_number + " 개 숫자를 선택했어요 ☆]");
							System.out.println("");
							
							for (int i = 0; i < ai_Rand_number; i++) {
								totalNum++;
								System.out.println("[ 컴퓨터 ] >> " + totalNum);

								// 컴퓨터가 31을 외치면!?
								if (totalNum == BASKIN_FINAL_NUM) {
									// 사용자 승리
									System.out.println("----결과----");
									System.out.println("사용자 승리!! 축하드려요");
									System.out.println("게임을 종료하고 홈 메뉴로 이동하겠습니다.");
									System.out.println();
									win++;
									gameFlag = false;
									break;
								}
							}
					
							// 사용자가 숫자 외치기
							if (totalNum != BASKIN_FINAL_NUM) {
								
								System.out.println("----------------------");
								System.out.println("");	
								do {
								    System.out.println("몇개의 숫자를 사용할까요? [ 1 ~ 3 개만 가능 ]");
								    System.out.print("입력 : ");
								    user_Input = sc.nextInt();
								    if (user_Input <= 0 || user_Input > 3) {
								        System.err.println("잘못된 값입니다. 다시 입력해주세요.");
								    }
								} while (user_Input <= 0 || user_Input > 3);
								

								System.out.println();
								System.out.println("[★ 사용자는 " + user_Input + " 개의 숫자를 선택했어요. ★]");
								System.out.println();
							
								
								for (int i = 0; i < user_Input; i++) {
									totalNum++;
									System.out.println("[ 사용자 ] >> " + totalNum);
									// 사용자가 31을 외치면!?
									if (totalNum == BASKIN_FINAL_NUM) {
										// 사용자 패배
										System.out.println("----결과----");
										System.out.println("사용자 패배..!! 다시 도전해봐요");
										System.out.println("게임을 종료하고 홈 메뉴로 이동하겠습니다.");
										System.out.println();
										loss++;
										gameFlag = false;
										break;
									}
								}
							}

						}
					}

				}

				break;
			case 2:
				System.out.println("=== 게임 전적 ===");
				System.out.println("1. 홈으로");
				System.out.println("2. 종료");
				System.out.println("-------------------");
				System.out.println("승리 : " + win);
				System.out.println("패배 : " + loss);
				System.out.println("-------------------");
				System.out.print("메뉴 입력 : ");
				int home = sc.nextInt();
				if (home == 1) {
					break;
				} else {
					System.out.println("게임을 종료합니다. 다시시작해주세요~!");
					System.exit(0);
				}

			case 3:
				System.exit(0);
			} // end switch

		} // end while

	} // end main

} // end class
