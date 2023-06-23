package day0622;

import java.util.Scanner;

public class QuizForWhile_02 {
	
	public static void quiz1()
	{
		//점수를 반복해서 입력하면 합계를 구하시오
		//1~100이 아니면 제외 (continue조건 사용)
		//0을 입력시 프로그램 종료 (break; 사용)
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int score;
		
		while(true)
		{
			System.out.println("점수를 입력하세요(0 입력시 프로그램 종료)");
			score=sc.nextInt();
			
			if(score==0)
				break;  //break;문은 가장 먼저 써준다.
			
			if(score>100 || score<1)
				continue;
			
			sum+=score; //sum=sum+score이라는 의미
			
		}
		System.out.println("합계: "+sum);
		
	}
	
	public static void quiz2()
	{
		//점수를 반복해서 입력하면 합계,평균을 구하시오
		//끝이라고 입력시 프로그램 종료(equals로 써야 정확)
		
		Scanner sc=new Scanner(System.in);
		
		String score;
		int count=0;
		int sum=0;    //sum과 count는 0으로 초기값 필요함
		double avg;
		
		while(true)
		{
			System.out.println("점수를 입력하시오");
			score=sc.nextLine();
			
			if(score.equals("끝"))
				break;
			
			sum+=Integer.parseInt(score);
			count++;
		}
		avg=(double)sum/count;      //avg=sum/count 해도 오류나지 않음 double>int
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		
		
		
	}
	
	public static void quiz3()
	{
	 
	 /*
	 총 5개(=for문)의 점수를 입력받아 합계를 구하시오
	 만약 1~100이 아닐경우 다시 입력받아야 한다. (hint_continue)
	 
	 1번점수: 88
	 2번점수: 99
	 3번점수: 200
	        잘못입력했어요
	 3번점수: 33
	 4번점수: 
	 
	 
	 =========
	 합계: **점
	 */	
		Scanner sc=new Scanner(System.in);
		
		int score,sum=0;
		
		System.out.println("점수를 입력하세요");
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(i+"번점수: ");			
			score=sc.nextInt();
		
			if(score>100 || score<1)
			 {
				System.out.println("\t잘못입력했어요");
				i--;
				continue;
			 }	
			sum+=score;
				
		}
		System.out.println("==========");
		System.out.println("합계: "+sum+"점");
	}
	
	public static void quiz3()
	{
	 
	 /*
	 총 5개(=for문)의 점수를 입력받아 합계를 구하시오
	 만약 1~100이 아닐경우 다시 입력받아야 한다. (hint_continue)
	 
	 1번점수: 88
	 2번점수: 99
	 3번점수: 200
	        잘못입력했어요
	 3번점수: 33
	 4번점수: 
	 
	 
	 =========
	 합계: **점
	 */	
		Scanner sc=new Scanner(System.in);
		
		int score,sum=0;
		
		System.out.println("점수를 입력하세요");
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(i+"번점수: ");			
			score=sc.nextInt();
		
			if(score>100 || score<1)
			 {
				System.out.println("\t잘못입력했어요");
				i--;
				continue;
			 }	
			sum+=score;
				
		}
		System.out.println("==========");
		System.out.println("합계: "+sum+"점");
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//quiz1();
		//quiz2();
		quiz3();

	}

}
