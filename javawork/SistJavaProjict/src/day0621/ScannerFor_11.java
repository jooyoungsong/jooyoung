package day0621;

import java.util.Scanner;

public class ScannerFor_11 {
	
	public static void numSum()
	{
		 //합계를 구할 숫자는? 100
		 //1~100까지의 합은 5050입니다를 출력하세요
		
		Scanner sc=new Scanner(System.in);
		int num; //입력할 수		
		int sum=0;
		
		System.out.println("합계를 구할 숫자는? ");
		num=sc.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다");
	}
	public static void quizFact() 
	{
		//팩토리얼을 구할 숫자를 입력
		//5!=120
		
		Scanner sc=new Scanner(System.in);
		int num;
		int result=1;
		//int num,result=1;로 한줄 표현 가능
		
		System.out.println("팩토리얼 구할 숫자는?");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			result*=i;
			System.out.println(num+"!="+result);
		}
		//System.out.println(num+"!="+result);
	}
	
	public static void factorialTest()
	{
		//1!=1
		//2!=2
		//3!=6
		
		//10! 출력해보기
		int result=1;   //factorial을 곱할 때는 0이면 안됨 무조건 1이어야 한다
		for(int i=1;i<=3;i++)
		{
			result*=i;
			System.out.println(i+"!="+result);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numSum();
		//factorialTest();
		quizFact();
		

	}

}
