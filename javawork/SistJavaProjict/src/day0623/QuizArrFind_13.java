package day0623;

import java.util.Scanner;

public class QuizArrFind_13 {

	public static void main(String[] args) {
		// 이름을 입력해서 없으면 없다고 있으면 몇번째 있는지 알려주세요
		// 끝이라고 쓰면 종료하시오.
		//String [] stuNames= {"이성신","이민규","박병주","최성현","김영준","강연주","최진평","고은비","송주영"};
		
		Scanner sc=new Scanner(System.in);
		
		String [] stuNames= {"이성신","이민규","박병주","최성현","김영준","강연주","최진평","고은비","송주영"};
		String name;
		boolean flag;  //참거짓 문제 ->존재여부로 활용
		
		while(true)
		{
			System.out.println("이름을 입력하세요");
			name=sc.nextLine();
			
			if(name.equals("끝"))
				break;
			
			flag=false;
			
			for(int i=0;i<stuNames.length;i++)
			{
				if(name.equals(stuNames[i]))
					{
					flag=true;					
				    System.out.println(name+"은 "+(i+1)+"번째에서 검색된다");
					}				    
			}
			
			if(!flag)                  //if는 조건이 참일 때만 수행한다.
			{
				System.out.println(name+"은 검색 결과에 없습니다");
			}
			
		}
		

	}

}
