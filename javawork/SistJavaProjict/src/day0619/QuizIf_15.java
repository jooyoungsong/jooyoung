package day0619;

import java.util.Scanner;

public class QuizIf_15 {

	public static void main(String[] args) {
		// 점수를 입력하여 평가를 출력하시오_입력할 때는 무조건 scanner 쓴다고 생각하면 된다.
		/*
		 * 당신의 점수는? 88
		 * ====================
		 * 90점 이상: 장학생  80점 이상: 우수상 80점 미만: 재시험
		 * ====================
		 *당신은 88점이므로 평가는 우수상~
		 */
		
		Scanner sc=new Scanner(System.in);
		
		
		/*int score;
		String result;
		
		System.out.println("당신의 점수는? ");
		score=sc.nextInt();
		
		if(score>=90)
			result="장학생";
		
		else if(score>=80)
			result="우수상";
		
		else 
			result="재시험";
		
		
		System.out.println("===============");
		System.out.println(" 90점 이상: 장학생  80점 이상: 우수상 80점 미만: 재시험");
		System.out.println("===============");
		System.out.println("당신은 "+score+"점이므로 평가는 "+result+"~"); */
		
		int score;
		
		//입력
		System.out.println("당신의 점수는?");
	    score=sc.nextInt();
		
	    //점수별평가
		String result=(score>=90)?"장학생":(score>=80)?"우수상":"재시험";
		
		//결과출력
		System.out.println("당신은 "+score+"점이므로 평가는 "+result+"~");
		

	}

}
