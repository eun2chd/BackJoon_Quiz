package FreeStudy;

public class Pazing {
	
	public static void main(String[] args) {
		// �� �Խñ� ��
		int totalCount = 91391;
		int page = 21;
		// ��������
		int countList = 10;
		
		int totalPage = totalCount / countList;
		
		if(totalCount % countList > 0) {
			totalPage++;
		}
		
		System.out.println(totalPage);
		
		// �� �������� 9140 ������ �ε� ���� �������� 9141 �̶�� �ϸ�
		
		if(totalPage < page) {
			page = totalPage;
		}
		
		// �������� 1~10 ���� �������� �ٲ�� ���� ���� �� �������� �ٲ�� ��
		
		// ���� �������� : 5 - 1  = 4 / 10 = 0 * 10 = 0 + 1 = 1
		// �� ������ : 1 + 10 - 1 = 10
		
		// ���� �������� : 12 - 1 11 / 10 1 * 10 = 10 + 1 =  11
		// �� ������ : 11 + 10 = 21 - 1 = 10
		
		
		
		int startPage = ((page - 1) / countList) * countList + 1;
		int endPage = startPage + countList - 1;
		
		
		System.out.println(startPage);
		System.out.println(endPage);
	}

}
