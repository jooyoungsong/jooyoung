package day0616;

import java.util.Calendar;


public class CalendarTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date date=new Date(); _date는 여기서 참조변수
		//System.out.println("지금은 "+(date.getYear()+1900));
		
		Calendar cal=Calendar.getInstance();  //매서드화 시켜서 만든 것
		System.out.println("지금은 "+cal.get(cal.YEAR )+"년도 입니다");
		System.out.println("지금은 "+(cal.get(cal.MONTH)+1)+"월 입니다");  //월은 항상 1을 더해야 나온다. (0부터 세기에 달은 1을 더해야한다.)
		System.out.println("지금은 "+cal.get(cal.DATE)+"일 입니다");
		System.out.println("지금은 "+cal.get(cal.DAY_OF_MONTH)+"일 입니다");
		System.out.println("지금은 "+cal.get(cal.HOUR)+"시 입니다");
		System.out.println("지금은 "+cal.get(cal.HOUR_OF_DAY)+"시 입니다");
		System.out.println("지금은 "+cal.get(cal.MINUTE)+"분 입니다");
		System.out.println("지금은 "+cal.get(cal.SECOND )+"초 입니다");
		System.out.println("시간: "+cal.get(cal.HOUR_OF_DAY)+"시"+cal.get(cal.MINUTE)+"분 입니다");
		
	}

}
