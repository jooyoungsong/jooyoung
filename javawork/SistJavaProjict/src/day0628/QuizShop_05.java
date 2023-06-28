package day0628;

class MyShop{
	
	private String sangpumName;
	private String ipgoday;
	private String chulgoday;
	
	//3개의 데이터를 한번에 수정할 수 있는 메서드
	public void setOrder(String sname,String iday,String cday)
	{
		sangpumName=sname;
		ipgoday=iday;
		chulgoday=cday;
	}
	
	
	//3개의 데이터를 한번에 출력할 수 있게 메서드
	public void getOrder()
	{
		System.out.println("상품명: "+sangpumName);
		System.out.println("입고일: "+ipgoday);
		System.out.println("출고일: "+chulgoday);
		
		
		//String s="상품명: "+sangpumName+"\t입고날짜:"+ipgoday+"\t출고일자:"+chulgoday;
		//retrun s;
	}
	
}




public class QuizShop_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***상품입고***");
		
		MyShop m1=new MyShop();
		m1.setOrder("키보드","2023-06-01","2023-06-20");
		m1.getOrder();
		
		System.out.println("=================");
		
		MyShop m2=new MyShop();
		m2.setOrder("모니터", "2023-06-04", "2023-06-23");
		m2.getOrder();    //system.out.println(m2.getOrder());과 같은 표현
		

	}

}
