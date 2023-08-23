package day0623;

public class Random_01 {

	public static void main(String[] args) {
		/*
		 자바에서 난수를 구하는 방법 2가지
		 1.Math.random() 메서드를 이용하는 방법
		 2.Random 이라는 클래스 생성해서 구하는 방법
		 */
		
		System.out.println("기본 난수 5개발생");
				
		for(int i=1;i<=5;i++)
		{
			double a=Math.random();  //0.xxxxx~0.9xxxxx로 태어난 친구임
			System.out.println(a);
		}
		
        System.out.println("0~9사이의 난수 발생");
		
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10); //0~9까지의 난수가 발생된다
			System.out.println(a);
		}
		
        System.out.println("1~10사이의 난수 5개발생");
		
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10)+1; //0+1(1)~9+1(10)까지의 난수가 발생된다
			
			System.out.println(a);
		}
		
		 System.out.println("1~100사이의 난수 5개발생"); 
			
			for(int i=1;i<=5;i++)
			{
				int a=(int)(Math.random()*100)+1; //1~100
				
				System.out.println(a);
			}

			 System.out.println("0~99사이의 난수 5개발생");
				
				for(int i=1;i<=5;i++)
				{
					int a=(int)(Math.random()*100); //0~99
					
					System.out.println(a);
				}
			
	}

}
