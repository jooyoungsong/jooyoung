package day0627;

public class QuizMain_09 {

	public static void main(String[] args) {
		
	    System.out.println("[쇼핑목록]");
		
		System.out.println("쇼핑장소: "+Quiz_09.place);
		
		//
		Quiz_09 shopping1=new Quiz_09();
		
		shopping1.setList("손선풍기");
		shopping1.setPrice(25000);
		
		String list1=shopping1.getList();
		int price1=shopping1.getPrice();
		
		System.out.println("상품명: "+list1);
		System.out.println("가격: "+price1+"원");
		
		//
		Quiz_09 shopping2=new Quiz_09();
		
		shopping2.setList("핸드폰충전기");
		shopping2.setPrice(30000);
		
		String list2=shopping2.getList();
		int price2=shopping2.getPrice();
		
		System.out.println("상품명: "+list2);
		System.out.println("가격: "+price2+"원");
		
		//
		Quiz_09 shopping3=new Quiz_09();
		
		shopping3.setList("이어폰");
		shopping3.setPrice(70000);
		
		String list3=shopping3.getList();
		int price3=shopping3.getPrice();
		
		System.out.println("상품명: "+list3);
		System.out.println("가격: "+price3+"원");
		

	}

}
