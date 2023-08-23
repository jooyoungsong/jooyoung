package day0619;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerMyAge_05 {

	public static void main(String[] args) {
		/* Scanner 사용해서 만들기
		 * 당신의 이름은? 김민희
		 * 당신의 출생년도는? 1997년
		 * =========================
		 * 이름: 김민희
		 * 현재년도: 2023년
		 * 나이: 26세 */
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		String name;
		int birth;
		
		int curYear=cal.get(cal.YEAR);  //2023
		
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
	
	    System.out.println("당신의 출생년도는?");
	    birth=sc.nextInt();
	    
	    System.out.println("==================");
	    System.out.println("이름: "+name);
	    System.out.println("현재년도: "+curYear+"년");
	    System.out.println("나이: "+(curYear-birth)+"세");
		
		
	}

}
