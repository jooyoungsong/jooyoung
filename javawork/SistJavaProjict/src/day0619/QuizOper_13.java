package day0619;

import java.util.Scanner;

public class QuizOper_13 {

	public static void main(String[] args) {
		/*
		 * 이름입력
		 * 강호동
		 * 키
		 * 177.5
		 * 체중
		 * 88
		 * 
		 * **학생 신체 정보**
		 * 이름: 강호동
		 * 키: 177.5cm
		 * 체중: 88kg
		 * 
		 * 표준 체중: (키-100)*0.9kg
		 * 권장 표준 체중는 69.75kg입니다 */
		
		Scanner sc=new Scanner(System.in);
		String name;
		double hei,wei,st_wei;
		

		
		System.out.println("이름");
		name=sc.nextLine();
		
		System.out.println("키");
		hei=sc.nextDouble();
		
		System.out.println("체중");
		wei=sc.nextDouble();
		
		st_wei=(hei-100)*0.9;
		String say=(st_wei==69.75)?"정상":((st_wei>69.75)?"비만":"마름");
		
		System.out.println("==========");
		System.out.println("**학생 신체 정보**");
		System.out.println("이름: "+name);
		System.out.println("키: "+hei+"cm");
		System.out.println("체중: "+wei+"kg");
		System.out.println("권장 표준몸무게: "+st_wei+"kg입니다");
		System.out.println(name+"은 bmi가 "+say);
		System.out.printf("권장 표준몸무게:%.3fkg",+st_wei);
		
		
		
		
		
		
		
		

	}

}
