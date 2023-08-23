package day0626;

import java.util.Scanner;

public class BinggoGame_09 {

	public static void main(String[] args) {
		// 3*3열의 빙고를 하세요!_빙고를 하려면 1~3까지만 넣어야 빙고가 될 확률이 있어
		
		Scanner sc=new Scanner(System.in);
		
		//3행3열의 배열 생성
		int [][] pz=new int [3][3];      //pz=puzzle
		
		int binggo=0;
		
		while(true)
		{
			System.out.println("***같은 숫자 나오면 빙고!!!***");
			
			//3행3열 안에 1~3까지의 난수 발생
			for(int i=0;i<pz.length;i++)
			{
				for(int j=0;j<pz[i].length;j++)
				{
					pz[i][j]=(int)(Math.random()*3)+1;
				}
			}
			
			//출력
			for(int i=0;i<pz.length;i++)   //행
			{
				for(int j=0;j<pz[i].length;j++)   //열
				{
					System.out.printf("%4d",pz[i][j]);
				}
				System.out.println();
			}
			
			//빙고갯수
			binggo=0;  //초기화
			
			//가로방향 3개 세로방향 3개
			for(int i=0;i<pz.length;i++)
			{
				//가로방향비교
				if(pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2])
					binggo++;
				
				//세로방향비교
				if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i])
					binggo++;
				
			}
			
			//대각선 방향 \
			if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2])
				binggo++;
			
			
			//대각선 방향 /
			if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0])
				binggo++;
			
			//빙고출력
			if(binggo==0)
				System.out.println("\t꽝!!!");
			else
				System.out.println("\t빙고 "+binggo+"개");
			
			
			
			//게임종료
			System.out.println("엔터를 누르면 다음 난수가 나옵니다(q: 종료)");
			String ans=sc.nextLine();     //엔터도 스트링 문자로 인식된다.
			
			if(ans.equalsIgnoreCase("q"))
			{
				System.out.println("게임을 종료합니다");
				break;
			}
		
		}

	}

}
