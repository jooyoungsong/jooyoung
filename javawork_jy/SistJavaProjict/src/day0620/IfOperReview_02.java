package day0620;

import java.util.Scanner;

public class IfOperReview_02 {

	public static void main(String[] args) {
		/*
		 * 평가메세지: 90점이상: 참잘함 80점이상: 잘함 80점미만: 다음기회에...
		 * (삼항연산자) 
		 * 학점: 90점이상:A 80점이상:B 70점이상:C 60점이상:D 60점미만:F
		 * (IF문)
		 *점수를 입력하세요
		 *88
		 *===============
		 *점수: 88점
		 *평가메세지: 잘함
		 *학점: B
		 */
		
		Scanner sc=new Scanner(System.in);
		
		int score;
		String msg,grade;
		
		//입력
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();  //변수가 들어오면 학점과 평가메세지 구할 수 있음
		
		//점수별 메세지
		msg=score>=90?"참잘함":score>=80?"잘함":"다음기회에";
		//String grade=score>=90?"참잘함":score>=80?"잘함":"다음기회에...";
		
		
		//학점
		if(score>=90)
			grade="A";
		else if(score>=80)
			grade="B";
		else if(score>=70)
			grade="C";
		else if(score>=60)
			grade="D";
		else
			grade="F";
		
		System.out.println("=========");
		System.out.println("점수: "+score+"점");
		System.out.println("평가메세지: "+msg);
		System.out.println("학점: "+grade);
		
		
		
		
	}

}
