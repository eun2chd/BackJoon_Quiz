package pratice.ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ch10 {

	public static void main(String[] args) {
		
		  String[] str = {
	                "언랭",
	                "아이언4", "아이언3", "아이언2", "아이언1",
	                "브론즈4", "브론즈3", "브론즈2", "브론즈1",
	                "실버4", "실버3", "실버2", "실버1",
	                "골드4", "골드3", "골드2", "골드1",
	                "플레티넘4", "플레티넘3", "플레티넘2", "플레티넘1",
	                "에메랄드4", "에메랄드3", "에메랄드2", "에메랄드1",
	                "다이아4", "다이아3", "다이아2", "다이아1",
	                "마스터300", "그마300", "챌린저"
	        };

	        // 배열을 리스트로 변환하고 섞기
	        List<String> list = new ArrayList<>();
	        Collections.addAll(list, str);
	        Collections.shuffle(list);

	        // 팀별로 나누어 출력
	        int teamSize = 10; // 한 팀의 인원
	        int numberOfTeams = 300; // 팀의 개수

	        for (int team = 1; team <= numberOfTeams; team++) {
	            System.out.print("팀 " + team + " : ");
	            for (int i = 0; i < teamSize; i++) {
	                // 리스트 크기를 벗어나지 않도록 인덱스 조정
	                int index = (team - 1) * teamSize + i;
	                System.out.print(list.get(index % list.size()) + " ");
	            }
	            System.out.println();
	        }

	} // end main

} // end class
