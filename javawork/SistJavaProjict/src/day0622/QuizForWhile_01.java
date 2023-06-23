package day0622;

public class QuizForWhile_01 {
	
	public static void quiz1()
	{
		//가로로 출력_for_1 2 3 4 5 그리고 다음줄에 종료라고 출력하시오
		
		int i;
		
		for(i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("종료");
		//syso.out.println("\n종료")로 한 줄 표현도 가능
		
	}
	
	public static void quiz2()
	{
		//가로로 출력_for_1 2 4 5 7 8 10 
		//이럴 때 continue 사용
		
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}
		
	}
	
	public static void quiz3()
	{
		//안녕을 가로로 3번 출력하시오
		
		int i;
		for(i=1;i<=3;i++) //for(int i=3;i>=3;i--)도 가능
		{
			System.out.print("안녕 ");
		}
		
	}
	
	public static void quiz4()
	{
		//1부터 10까지중 짝수만 가로로 출력하세요.
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				continue;
			System.out.print(i+" ");
			
			//아니면 if(i%2==0)
			//     system.out.print(i+" ")로 표현해도 된다.
		}
		
		
	}
	
	public static void quiz5()
	{
		//1부터 10까지의 합은 55입니다
		
		int sum=0;
		for(int i=1;i<=10;i++)  //for 지역변수라고 해
		{
			sum+=i;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다");
		
		
		
		/*int sum=0;
		  int i;
		  for(i=1;i<=10;i++)
		  {sum+=i;}
		  syso("1부터 "+(i-1)+"합은 "+sum);*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// quiz1();
		//quiz2();
		//quiz3();
		//quiz4();
		quiz5();

	}

}
