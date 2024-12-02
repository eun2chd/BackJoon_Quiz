package pratice.ch;

public class ch01 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3 };
		int[] arr2 = new int[] { 4, 1, 9 };
		int count = 0;
		// 위 두개 배열에서 몇개의 숫자가 일치하는지 확인하는 코드
		for (int a = 0; a < 3; a++) {
			if(a == 0) {
				if(arr1[a] == arr2[a]) {
					count++;
				} else if(arr1[a] == arr2[a+1]) {
					count++;
				} else if(arr1[a] == arr2[a+2]) {
					count++;
				}
			} else if(a == 1) {
				if(arr1[a] == arr2[a-1]) {
					count++;
				} else if(arr1[a] == arr2[a]) {
					count++;
				} else if(arr1[a] == arr2[a+1]) {
					count++;
				}
			} else if(a == 2) {
				if(arr1[a] == arr2[a-2]) {
					count++;
				} else if(arr1[a] == arr2[a-1]) {
					count++;
				} else if(arr1[a] == arr2[a]) {
					count++;
				}
			}
//	         

		}
		System.out.println("일치하는 숫자는" + count + "개 입니다!");

	}

}
