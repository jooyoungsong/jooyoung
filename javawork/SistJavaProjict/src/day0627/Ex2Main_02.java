package day0627;


public class Ex2Main_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Ex2Object_02.width);
		System.out.println(Ex2Object_02.height);  //Ex2Object_02를 불러올 수 있음
		
		//클래스변수
		Ex2Object_02.width=10;
		Ex2Object_02.height=20;
		
		System.out.println(Ex2Object_02.width);
		System.out.println(Ex2Object_02.height);
		
		//인스턴스 생성후 변수 호출가능
		Ex2Object_02 card1=new Ex2Object_02();
		
		System.out.println(card1.kind);
		System.out.println(card1.number);
		
		card1.kind="Heart";
		card1.number=4;
		
		System.out.println(card1.kind);
		System.out.println(card1.number);
		
		//인스턴스 변수 생성후 변경후 출력
		Ex2Object_02 card2=new Ex2Object_02();
		
		System.out.println(card2.kind);
		System.out.println(card2.number);
		
		card2.kind="Space";
		card2.number=8;
		
		System.out.println(card2.kind);
		System.out.println(card2.number);
				
				

	}

}
