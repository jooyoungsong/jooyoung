package day0620;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerReview_01 {

	public static void main(String[] args) {
		/*
		 * 태어난연도: 1997
		 * 이름: 홍길동
		 * 핸드폰번호: 010-1234-5678 (이건 문자야! 숫자 아님)
		 * 주소: 서울시 동작구
		 * ========================================
		 *     [개인정보]
		 * 이름: 홍길동
		 * 나이: 26세
		 * 연락처: 010-1234-5678
		 * 주소: 서울시 동작구
		 * */
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		String name,phone,addr;
		int year;
		int age=cal.get(cal.YEAR);   //int age;로 정의하고 계산으로 해도 된다.
		
		System.out.println("태어난연도: ");
	    year=Integer.parseInt(sc.nextLine());  
	    /*year=sc.nextInt();
	     *sc.nextLine();        
	     *이렇게 두줄로 써줘도 된다.
	     *왜? Int(정수) 다음에 엔터 누르면 엔터도 문자열로 받기 때문에 다음에 입력할 문장이 넘어가는 문제 발생함(버퍼발생)
	     *그래서 엔터를 받을 문자열을 추가해주는 것이다=> sc.nextLine();*/
	    System.out.println("이름: ");
	    name=sc.nextLine();
	    System.out.println("핸드폰번호: ");
	    phone=sc.nextLine();
	    System.out.println("주소: ");
	    addr=sc.nextLine();
	    
	    
	    /* 앞에 int age=cal.get(cal.YEAR); 대신
	     * int age; 쓰고
	     * age=cal.get(cal.YEAR)-year;* 계산식을 써주면 된다*/
	    
	    System.out.println("=========================");
	    System.out.println("  [개인정보]");
	    System.out.println("이름: "+name);
	    System.out.println("나이: "+(age-year)+"세");
	    System.out.println("연락처: "+phone);
	    System.out.println("주소: "+addr);
	
		
		

	}

}
