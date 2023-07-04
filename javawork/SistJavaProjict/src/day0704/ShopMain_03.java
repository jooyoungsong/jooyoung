package day0704;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 1.상품입고   2.상품재고  9.종료
 1 입력시
 상품명? 바나나
 수량? 10
 가격? 1000
 2 입력시
 번호  상품명  수량  가격  총가격   <- 가로로 출력하세요
 1   바나나   10  1000 10000
 */


public class ShopMain_03 {
	
	List<Shop> list=new Vector<Shop>();
	
	public void inputShop()
	{
		Scanner sc=new Scanner(System.in);
		String sangName;
		int su,dan;
		
		System.out.println("상품명?");
		sangName=sc.nextLine();
		System.out.println("수량?");
		su=sc.nextInt();
		System.out.println("가격?");
		dan=sc.nextInt();
		
		Shop data=new Shop(sangName,su,dan);
		list.add(data);
		
		System.out.println("현재 데이터 개수: "+list.size());
	}
	
	public void writeShop()
	{
		System.out.println("***상품***");
		System.out.println("==================");
		int tot=0;  //for문에서 su와 dan을 각각 입력 되니깐 그걸 받아와서 total을 계산해야 함, 그래서 tot값을 일단 0으로 준다.
		
		for(int i=0;i<list.size();i++)
		{
			Shop s=list.get(i);
			tot=s.getSu()*s.getDan();
			System.out.println("번호\t상품명\t수량\t가격\t총가격");
			System.out.println((i+1)+"\t"+s.getSangName()+"\t"+s.getSu()+"\t"+s.getDan()+"\t"+tot);
			System.out.println("==================================");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopMain_03 sh=new ShopMain_03();
		Scanner sc=new Scanner(System.in);
		int b;
		
		while(true)
		{
			System.out.println(" 1.상품입고   2.상품재고  9.종료");
			b=Integer.parseInt(sc.nextLine());
			
			if(b==1)
				sh.inputShop();
			else if(b==2)
				sh.writeShop();
			else if(b==9)
			{
				System.out.println("종료");
				break;
			}
			else
			{
				System.out.println("잘못 입력했어요");
				continue;
			}
		}
		

	}

}
