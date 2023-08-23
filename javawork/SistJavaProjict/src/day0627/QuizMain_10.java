package day0627;

public class QuizMain_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**상품입고**");
		System.out.println("입고된 상점: "+Quiz_10.SHOPNAME);
		System.out.println("----------------------------------");
		
		//
		Quiz_10 marketlist1=new Quiz_10();
		
		marketlist1.setSangpum("딸기");
		marketlist1.dan=10000;
		marketlist1.su=5;
		
		String sangpum1=marketlist1.getSangpum();
		
		System.out.println("상품명: "+marketlist1.getSangpum());
		System.out.println("가격: "+marketlist1.dan+"원");
		System.out.println("수량: "+marketlist1.su+"팩");
		
		System.out.println("----------------------------------");
		
		//
		Quiz_10 marketlist2=new Quiz_10();
		
		marketlist2.setSangpum("초코파이");
		marketlist2.dan=5000;
		marketlist2.su=10;
		
		String sangpum2=marketlist2.getSangpum();
		
		System.out.println("상품명: "+marketlist2.getSangpum());
		System.out.println("가격: "+marketlist2.dan+"원");
		System.out.println("수량: "+marketlist2.su+"상자");
		
		System.out.println("----------------------------------");
		
		//
		Quiz_10 marketlist3=new Quiz_10();
		
		marketlist3.setSangpum("요거트");
		marketlist3.dan=2500;
		marketlist3.su=100;
		
		String sangpum3=marketlist3.getSangpum();
		
		System.out.println("상품명: "+marketlist3.getSangpum());
		System.out.println("가격: "+marketlist3.dan+"원");
		System.out.println("수량: "+marketlist3.su+"팩");
		
		

	}

}
