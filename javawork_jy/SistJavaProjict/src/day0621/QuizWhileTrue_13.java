package day0621;

import java.util.Scanner;

public class QuizWhileTrue_13 {

	public static void main(String[] args) {
		/*
		 점수를 반복해서 입력하다가 q나 Q를 입력하면 
		 while문을 빠져나온 뒤 총갯수,총점,평균을 출력하시오
		 평균은 소수점 1자리까지 표현하세요
		 */
		
		Scanner sc=new Scanner(System.in);
		String score;
		int count=0,sum=0;
		double avg;
		
		
		
		while(true) {
			System.out.println("점수를 입력하세요");
			score=sc.nextLine();
			if(score.equals("q")||score.equals("Q"))
		//if(score.charAt(0)=='q'  	|| score.charAt(0)=='Q'
		//if(score.equalsIgnoreCase("q")
				break;
			
			count++;
			sum+=Integer.parseInt(score);   //+=누적
		}
		
		avg=(double)sum/count;
		
		System.out.println("***결과출력***");	
		System.out.println("총갯수: "+count);		
		System.out.println("총점: "+sum+"점");
		System.out.printf("평균:%.1f",avg);
		
		

	}

}
