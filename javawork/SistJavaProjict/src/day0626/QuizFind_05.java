package day0626;

import java.util.Scanner;

public class QuizFind_05 {

	public static void main(String[] args) {
		/*숫자를 입력받아 배열의 몇번째에 있는지 출력하고 없을 경우 없습니다라고 출력하시오
		 * (0이면 종료)
		 * 입력값: 11
		 *       11은 2번째에 있어요!라고 출력하기
		 * 입력값: 100
		 *       100은 없습니다!라고 출력하기
		 * 입력값: 0
		 *       종료합니다(프로그램 종료)*/ 
		
		int []arrNums= {5,80,2,15,30,55,13,77,6,49,26};
		
		Scanner sc=new Scanner(System.in);
		int num;
		boolean flag;
		
		while (true)
		{
			System.out.print("입력값: (0 입력시 종료)");
			num=sc.nextInt();
			
			
			flag=false; //반복문 안에서 찾았을 경우 true로 변경해주기
			
			if(num==0)
			{
				System.out.println("종료합니다");
				break;
			}
			
			//배열 개수만큼 반복해서 입력한 숫자 찾기/ㄹ 
			for(int i=0;i<arrNums.length;i++)
			{
				if(num==arrNums[i])
				{
					flag=true;
					System.out.println(num+"은 "+(i+1)+"번째 있어요!");
				}
				
			}
			
			if(!flag)
				System.out.println(num+"은 없습니다!");
			
		}		
				
		}	
		
	}


