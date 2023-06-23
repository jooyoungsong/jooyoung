package day0622;

import java.util.Scanner;

public class ScanGugu_05 {

	public static void main(String[] args) {
		// 단을 입력해서 해당단을 출력하기=Scanner
		// 0을 입력시 종료( 0이 나올 때까지 계속 반복해야 되니깐 while(true)문을 사용한다)
		
		Scanner sc=new Scanner(System.in);
	    int dan;
		
		while(true)
		{
			System.out.println("단을 입력하시오(종료:0)");
		    dan=sc.nextInt();
		    
		   //종료
		   //System.out.println("["+dan+"]단");
		    if(dan==0)
		    {
		    	System.out.println("종료합니다");
		    	break;
		    }
		    
		   //2~9단까지만 입력가능
		    if(dan>=10 || dan<=1)
		    {
		    	System.out.println("다시 입력해주세요");
		        continue;
		    }
		    
		   //구구단 출력
		    System.out.println("["+dan+"]단");
		    for(int j=1;j<=9;j++)
		    {
		    	//System.out.println(dan+"X"+j+"="+dan*j);
		    	System.out.printf("%d X %d = %2d\n",dan,j,dan*j);
		    }
		    System.out.println();
		    
		}
			
		
		

	}

}
