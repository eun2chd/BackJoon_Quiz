package oop;

public class WarriorMain {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		
		
		w1.height = 120;
		w1.power = 100;
		
		w1.Color = "초록색";
		w1.name = "둘리";
		
		System.out.println("전사 정보");
		System.out.println("키 : " + w1.height);
		System.out.println("공격력" + w1.power);
		System.out.println("색깔" + w1.Color);
		System.out.println("이름" + w1.name);
		
	}

}
