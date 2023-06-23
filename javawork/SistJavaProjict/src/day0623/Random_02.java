package day0623;

import java.util.Random;

public class Random_02 {

	public static void main(String[] args) {
		// Random 클래스
		
		Random r=new Random();
		
		System.out.println("0~9사이의 난수를 발생시키자");
		for(int i=1;i<=3;i++)
		{
			int n=r.nextInt(10);   //10은 실수 타입에서 *10을 곱한다는 의미
			System.out.println(n);
			
		}
		
		System.out.println("1~10사이의 난수를 발생시키자");
		for(int i=1;i<=3;i++)
		{
			int n=r.nextInt(10)+1;   //*(10)+1는 random이라는 실수에서 10을 곱해 정수를 만들고 1을 더해 1~10까지를 구한다.
			System.out.println(n);
			
		}
		

	}

}
