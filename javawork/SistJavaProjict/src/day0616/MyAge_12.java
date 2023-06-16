package day0616;

import java.util.Calendar;

public class MyAge_12 {

	public static void main(String[] args) {
		// 매개변수 args에서 실행 시 이름과 태어난 연도를 보낸 후 출력하세요. (name,myBirth)
		// 이름: 이민규
		// 태어난 연도: 1995년
		// 나이: 28세
		
		// 현재년도는 Calendar import하여 구할 수 있다.
		
		//로직 안내
	    //1.임포트 import Calendar calendar=Calendar.getInstance();
		//2.변수 String name=args[0];
        //      int myBirth=integer.parseInt(args[1]);
		//      int curYear=calendar.get(calendar.Year); //현재년도 
		//3.계산 int myAge=curYear-myBirth;
		//4.출력 System.out.println("이름: "+name);
		//     System.out.println("태어난 연도: "+mybirth+"년");
		//      System.out.println("나이: "+myAge+"세");
		
		
		String name=args[0];
		int myBirth=Integer.parseInt(args[1]);
		
		Calendar cal=Calendar.getInstance();
		System.out.println("이름: "+name);
		System.out.println("태어난 연도: "+mybirth+"년");
		System.out.println("나이: "+ (cal.get(cal.YEAR)-myBirth)+"세");
		
		
	

	}

}
