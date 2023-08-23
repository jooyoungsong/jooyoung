package day0628;

class Mydate{
	
	//변수선언
	private int year;
	private int month;
	private int day;
	
	//디폴트 생성자 숨어있다
	
	public Mydate() {
		// TODO Auto-generated constructor stub
	}
	
	//명시적 생성자...3개의 인자값을 수정과 동시에 생성하는
	public Mydate(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	}
	
	//getter,setter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
	
}


////////////////////////////////////
public class AutoSetGet_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		Mydate date=new Mydate();
		
		date.setYear(2023);
		date.setMonth(6);
		date.setDay(22);
		
		
		System.out.println(date.getYear()+"-"+date.getMonth()+"-"+date.getDay());
		
		//명시적 생성자
		Mydate date1= new Mydate(2020, 8, 10);
		System.out.println(date1.getYear()+"-"+date1.getMonth()+"-"+date1.getDay());

	}

}
