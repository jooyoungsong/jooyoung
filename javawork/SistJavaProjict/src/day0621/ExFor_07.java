package day0621;

public class ExFor_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기값이 조건 안 맞으면, 한번도 반복 안됨_아래의 예시는 안되는 걸 보여줌
		/*for(int i=5;i<=1;i++)
		{
			System.out.println(i));  
		}*/
		
		int i;
		for(i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println("\n빠져나온후의 i값: "+i);
		
		int a=10;
		for(;a<=50;a+=5)
			System.out.print(a+" ");
		System.out.println("\n빠져나온후의 a값: "+a);
		
		
		//Hello를 가로로 5번 반복하세요
		int h;
		for(h=1;h<=5;h++)
		{
			System.out.print("Hello"+" ");
		}
		
		System.out.println();
		//1부터 10까지의 숫자를 짝수만 가로로 출력
		int p;
		for(p=1;p<=10;p++)
		{
			if(p%2==0)
				System.out.print(p+" ");
		}

		System.out.println();
		int n;
		for(n=1;n<=10;n++)
		{
			if(n%2>0)
			continue;
			System.out.print(n+" ");
		}
		
	}

}
