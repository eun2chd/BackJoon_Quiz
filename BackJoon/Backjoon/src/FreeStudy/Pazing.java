package FreeStudy;

public class Pazing {
	
	public static void main(String[] args) {
		// 총 게시글 수
		int totalCount = 91391;
		int page = 21;
		// 페이지수
		int countList = 10;
		
		int totalPage = totalCount / countList;
		
		if(totalCount % countList > 0) {
			totalPage++;
		}
		
		System.out.println(totalPage);
		
		// 총 페이지가 9140 페이지 인데 현재 페이지가 9141 이라고 하면
		
		if(totalPage < page) {
			page = totalPage;
		}
		
		// 페이지가 1~10 부터 끝단위가 바뀌면 시작 부터 끝 페이지가 바뀌는 식
		
		// 현재 페이지가 : 5 - 1  = 4 / 10 = 0 * 10 = 0 + 1 = 1
		// 끝 페이지 : 1 + 10 - 1 = 10
		
		// 현재 페이지가 : 12 - 1 11 / 10 1 * 10 = 10 + 1 =  11
		// 끝 페이지 : 11 + 10 = 21 - 1 = 10
		
		
		
		int startPage = ((page - 1) / countList) * countList + 1;
		int endPage = startPage + countList - 1;
		
		
		System.out.println(startPage);
		System.out.println(endPage);
	}

}