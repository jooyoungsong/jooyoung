package day0620;

import java.util.Scanner;

public class MaxNum_04 {

	public static void main(String[] args) {
		/*
		 * 3개의 수 입력
		 * 5
		 * 7
		 * 8
		 * ====================
		 * **if문
		 * 가장큰수: 8
		 * **삼항연산자
		 * 가장큰수: 8
		 * */
		
		Scanner sc=new Scanner(System.in);
		
		int x,y,z,max1,max2;   //teacher: int x,y,z,max;
		
		System.out.println("3개의 수 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y)
	       max1=x;
		else if(x>z)
			max1=x;
		else if(y>z)
			max1=y;
		else
			max1=z;
		
		/*int max1=(x>y)?x:y;
		int max2=(x>z)?x:z;
		int max3=(y>z)?y:z;*/  //이렇게 하면 안 나옴
		
		max2=x>y?x:(x>z)?x:(y>z)?y:z;
		
		
		
		
		System.out.println("==============");
		System.out.println("if문");
		System.out.println("가장큰수: "+max1);
		System.out.println("삼항연산자");
		System.out.println("가장큰수: "+max2);
		
		
		//선생님 풀이
		/*
		 * syso("입력한 수: "+x+","+y"+"z);
		 * if(x>y && x>z)
		 * max=x;
		 * else if(y>x && y>z)
		 * max=y;
		 * else
		 * max=z;
		 * syso("가장큰수: "+max);
		 * syso(**조건연산자")
		 * max=x>y&&x>z?x:y>x&&y>z?y:z;
		 * syso("가장큰수: "+max)*/
		

	}

}
