package pratice.ch;

public class ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int addResult = add(5,4);
		System.out.println(addResult);
		System.out.println(addNum());
		// 문자열 리턴
		String ch = ch("하이 자바");
		System.out.println(ch);

	}
	
	// 접근 + 생성 + 반환
	public static int add(int num1, int num2) {
		int result = 0;
		return num1 + num2;
	} // 숫자형
	
	// 매개변수 없이
	public static int addNum() {
		int num1 = 5;
		int num2 = 10;
		int sum;
		return sum = num1 + num2;
	}
	
	public static String ch(String str) {
		return str;
	}

}
