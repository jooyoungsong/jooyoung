package day0623;

import java.util.Scanner;

public class ArrayIntFinda_12 {

	public static void main(String[] args) {
		// 숫자를 입력해서 그 숫자가 있는지 찾기 (있다 없다 값은 boolean flag 먼저 선언해야함)
		// 없으면 없다고하고, 있으면 그 숫자가 몇 번째 있는지 찾기 
		// 0 입력시 종료(while(true)문 이용)
		
		Scanner sc=new Scanner(System.in);
		int su; //입력할 숫자
		int [] data= {10,20,30,40,50,60,70,80,90,100};
		boolean flag;
		
		while(true)
		{
			System.out.println("검색할 숫자를 입력하세요");
			su=sc.nextInt();
			
			//break; 맨 처음에 하는게 여러가지 조건에 걸릴 확률이 적기에 먼저 써줌
			if(su==0)
			{
				System.out.println("종료합니다");
				break;
			}
			
			//있다 없다 초기값
			flag=false;  //못찾으면 false, 찾으면 true로 변경
			
			//값 찾기
			for(int i=0;i<data.length;i++)
			{
				if(su==data[i])
				{
					flag=true;
					System.out.println((i+1)+"번째에서 검색");
				}
			}
			
			if(!flag)  //flag==false와 같은 말// 만약에 if()이면 true이다.
			{
				System.out.println(su+"는 데이터에 없습니다");
			}
		}

	}

}
