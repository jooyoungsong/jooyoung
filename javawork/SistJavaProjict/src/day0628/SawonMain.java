package day0628;

import java.util.Scanner;

public class SawonMain {
	
	public static void getSawon(Sawon[] sawon)
	{
		//제목
		Sawon.getTitle();
		
		for(Sawon s: sawon)  //사원 폴더에서 가져오겠다
			System.out.println(s.getSawonName()+"\t"+s.getPay()+
					"\t"+s.getFamilysu()+"\t"+s.getTimesu()+"\t"+s.getFamilysudang()+
					"\t"+s.getTimeSudang()+"\t"+s.getTotalPay());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int inwon; //몇명인지 인원을 입력하세요
		
		Sawon [] sawon;
		
		System.out.println("입력할 직원수는?");
		inwon=Integer.parseInt(sc.nextLine());
		
		//배열할당
		sawon=new Sawon[inwon];  //inwon 넣는 이유는 내가 scanner로 입력하는 값이 와야하기 때문
		
		//인원수만큼 데이터 입력
		//for(int i=0;i<sawon.length;i++)로 써도 된다
		for(int i=0;i<inwon;i++)
		{
			//sawon 생성
			sawon[i]=new Sawon();
			
			System.out.println("===========================");
			System.out.println("사원명?");
			String name=sc.nextLine();
			System.out.println("급여?");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("가족수?");
			int fs=Integer.parseInt(sc.nextLine());
			System.out.println("초과시간?");
			int ts=Integer.parseInt(sc.nextLine());
			
			
			//setter로 sawon클래스에 데이터를 넣기
			sawon[i].setSawonName(name);
			sawon[i].setPay(pay);
			sawon[i].setFamilysu(fs);
			sawon[i].setTimesu(ts);	
			
		}
		
		//getter로 출력
		getSawon(sawon);

	}

}
