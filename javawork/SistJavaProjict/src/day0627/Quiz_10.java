package day0627;

public class Quiz_10 {
	
	//멤버변수 선언
	private String sangpum;  //상품명
	int su;  //수량
	int dan; //단가
	static String SHOPNAME="롯데마트"; //상점
	
	
	//sangpum에 대한 set과 getMethod를 만들어 줘야한다
	public void setSangpum(String sangpum)
	{
		this.sangpum=sangpum;
	}
	
	
	public String getSangpum()
	{
		return sangpum;
	}

}
