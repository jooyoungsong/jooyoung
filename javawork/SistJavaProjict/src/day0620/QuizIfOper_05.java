package day0620;

import java.util.Scanner;

public class QuizIfOper_05 {

	public static void main(String[] args) {
		/*
		 * 상품명? 아이패드
		 * 수량? 3
		 * 가격? 500000
		 * =====================
		 * 아이패드 3개는 총 1500000원 입니다
		 * 3개이상은 10프로 DC가 됩니다
		 * DC된 총금액: 1350000원*/
		
		
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int que,price,total,discount;
		
		System.out.println("상품명?");
		name=sc.nextLine();
		System.out.println("수량?");
		que=sc.nextInt();
		System.out.println("가격?");
		price=sc.nextInt();
		
		total=que*price;
		
		if(que>=3)
			discount=(total*1/10);  
		//소숫점으로 쓰고 싶다면 discount *=0.1;로 써줘야 한다_discount=total*0.1로 쓰면 안 나온다.
		//또는 discount=(int)(total*0.1);로 해도 오류 안난다.
			
			else
				discount=0;
			
		
		System.out.println("=========");
		System.out.println("아이패드 "+que+"개는 총 "+(que*price));
		System.out.println("3개이상은 10프로 DC 됩니다");
		System.out.println("DC된 총금액: "+discount);

	}

}
