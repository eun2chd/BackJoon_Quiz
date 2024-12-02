package Pool;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
    	// 코드 리펙토링
    	// 변수 사용시 위에 정의하는 것이 좋음
    	// 미리 변수 사용하면 좋은점
    	// 메모리 낭비 방지, 추후 팀 협업 시 다른 개발자가 이해하기 좋음
    	// 변수명은 최대한 알아보기 쉽게
    	int kor = 0 ,eng = 0 ,math = 0; // 국어 영어 수학 점수
    	int sum = 0; // 합계
    	double avg = 0.0; // 평균
    	char ch; // 평균에 해당하는 등급 저장
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("국어 점수 입력");
    	//  int를 입력 받을 때는 nextInt 메서드를 이용한다. 
    	// 	int name1 = Integer.parseInt(sc.nextLine());  << 정수로 입력받기 때문에 파싱 따로 안해줘도댐
    	//  Integer.parseInt(sc.nextLine()); 문자열을 정수로 바꿀때 사용함!
    	kor = sc.nextInt();
    	System.out.println("영어 점수 입력");
    	eng = sc.nextInt();
    	System.out.println("수학 점수 입력");
    	math = sc.nextInt();
    	
    	sum = kor + eng + math; 
    	avg = 69;
    	
    	if (avg >= 90) {
    		ch = 'A';
    	} else if (avg >= 70 && avg <= 80) {
    		ch = 'B';
    	} else if (avg >= 60) {
    		ch = 'C';
    	} else {
    		ch = 'D';
    	}
    	
        System.out.println("=======결과========");
        System.out.println("합계 : "+ sum);
        System.out.println("평균 : "+ avg);
        System.out.println("등급 : "+ ch);

	}

}
