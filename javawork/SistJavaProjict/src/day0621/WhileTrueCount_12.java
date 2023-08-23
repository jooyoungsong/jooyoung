package day0621;

import java.util.Scanner;

public class WhileTrueCount_12 {

	public static void main(String[] args) {
		/*
		 임의의 수를 입력해서 합계,평균,갯수
		 단, 0을 입력하면 while문을 빠져나가게 하자
		 while(true)문 사용해보자
		*/
		
		Scanner sc=new Scanner(System.in);
		int su,sum=0; //입력할 수, 합계
		int cnt=0; //갯수
		double avg=0; //평균
		
		while(true) 
		{
			System.out.println("숫자입력(종료:0)");  //0이라고 작성해도 에러 안 뜸, 계속 나옴 why?break문 없기에 계속 반복됨
			su=sc.nextInt();
			
			if(su==0)  //0이 되면 count에서 제외된다.
				break;
			
			sum+=su;
			cnt++;            //while(true)에서는 빠지면 끝나기에 avg(평균값)은 못 구함, 빠져나온 후 avg값 구해주기
			
		}
		System.out.println("입력한 수의 합: "+sum);
		
		System.out.println("총 입력갯수: "+cnt);
		
		avg=(double)sum/cnt;
		System.out.println("입력한 수의 평균: "+avg);

	}

}
