package day0621;

public class QuizFor_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q.1 2 4 5 7 8 10 _continue이용해서 출력해보세요
		
		int i;
		for(i=1;i<=10;i++)
		 {
			if(i%3==0)
			 continue;
			System.out.print(i+" ");
		 }
		
		System.out.println();
		/*Q2 continue 이용할 것!
		 홀수값: 1
		 홀수값: 3
		 홀수값: 5
		 홀수값: 7
		 홀수값: 9*/
		
		int a;
		for(a=1;a<=10;a++)
		{
			if(a%2==0) //짝수는 출력 안하겠다는 문장 쓰고 싶어서 작성
				continue;
			System.out.print("홀수값: "+a+" ");
		}
		
		System.out.println();
		
		//Q3. 1~100까지 중에서 홀수의 합을 구하시오
		
		int sum=0;
		
		for(int b=1;b<=100;b++)
		{
			if(b%2==0)
				continue;
			      sum+=b;
		}
		System.out.println("홀수의 합: "+sum);
		
		//Q4. 1~100까지 중에서 짝수의 합을 구하시오
		
		int csum=0;
		
		for(int c=1;c<=100;c++)
		{
			if(c%2==1)
				continue;
			       csum+=c;
		}
		System.out.println("짝수의 합: "+csum);
		
		
		//Q. while문을 이용해서 1~100사이의 짝수합 구하기
		
		int tsum=0;
		int t=0;
		while(t<=100 && t%2==0) {
			
			tsum+=t;
			t+=2;
		}
		System.out.println("1~100사이의 짝수합:"+tsum);
		
		//Q. while(true)문을 이용해서 1~100사이의 짝수합 구하기
		
		int z=0;
		int zsum=0;
		
		while(true) //while(true)문에는 무조건 break문이 필요하다
		{
			z++;
			if(z%2==1)
				continue;
			zsum+=z;
			
			if(z==100)
				break;
			/* 짝수로 표현한다고 하면?
			 * while(true)
			 * {
			 * if(a%2==0)
			 * zsum+=z;
			 * z++;
			 * if(a>100)
			 * break;  */
			
		}
		System.out.println("1부터 100까지의 합은: "+zsum);
		

	}

}
