package day0628;

/*
 이름   급여   가족수   시간수   : 입력
 
 이름   급여   가족수   초과시간    가족수당   시간수당   총급여   : 최종출력
 */


public class Sawon {
	
	private String sawonName;
	private int pay;
	private int familysu;
	private int timesu;
	
	
	//setter,getter 자동생성
	public String getSawonName() {
		return sawonName;
	}
	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamilysu() {
		return familysu;
	}
	public void setFamilysu(int familysu) {
		this.familysu = familysu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	//가족수당...가족 1명당 5만원(4명이 넘더라도 최대 20만원)
	public int getFamilysudang() 
	{
		int n=0;
		
		if(familysu>=4)
			n=200000;
		else
			n=familysu*50000;
		
		return n;
	}
	
	
	//시간외수당...시간당 3만원(10시간 이상이더라도 최대 30만원)
	public int getTimeSudang()
	{
		int n=0;
		
		if(timesu>=10)
			n=300000;
		else
			n=timesu*30000;
		
		return n;
	}
	
	
	//총급여
	public int getTotalPay()
	{
		int n=pay+getFamilysudang()+getTimeSudang();	
		return n;
	}
	
	//제목
	public static void getTitle()
	{
		System.out.println("**우리회사 직원 급여현황***");
		System.out.println();
		System.out.println("사원명\t급여\t가족수\t초과시간\t가족수당\t시간외수당\t총급여");
		System.out.println("==================================================================");
	}
	
	//총출력 여기서 해도 되지만 SawonMain 페이지에서 하는 거 해볼게요!

}
