package day0620;

import java.util.Scanner;

public class QuizOper_06 {

	public static void main(String[] args) {
		/*
		 이름을 입력하세요
		 강민호
		 3과목의 점수를 입력하세요(kor,eng,mat)
		 39
		 88
		 99
		 =======================
		 3과목점수: 33,88,99
		 평균: 75.33333333
		 =======================
		 ****합격조건: 평균이 70점 이상이고, 각과목이 40점이상이면 합격***
		 =======================
		 강민호님은 불합격입니다
		  */
		
		Scanner sc=new Scanner(System.in);
		
		String name,con;
		int kor,eng,mat;
		double avg;
		
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("3과목의 점수를 입력하세요");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		double count=3;
		avg=(kor+eng+mat)/count;
		
		if(avg>=70 && kor>=40 && eng>=40 && mat>=40)
			con="합격";
		else 
			con="불합격";
		
		System.out.println("======================");
		System.out.println("3과목점수: "+kor+","+eng+","+mat);
		System.out.printf("평균: %.2f",avg);
		System.out.println("======================");
		System.out.println("합격조건:****합격조건: 평균이 70점 이상이고, 각과목이 40점이상이면 합격***");
		System.out.println("======================");
		System.out.println(name+"님은 "+con+"입니다");
		
		

	}

}
