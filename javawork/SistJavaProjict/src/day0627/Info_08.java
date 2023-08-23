package day0627;

public class Info_08 {
	
	//3개의 인스턴스 변수  private 없으니깐 바로 접근 가능
	String stuName;
	int age;
	String addr;
	
	//생성자
	public Info_08() {
		// TODO Auto-generated constructor stub
	}
	
	//명시적 생성자...생성과 동시에 멤버 초기화//setter메소드 안쓰고 setter메소드와 같은 결과
	public Info_08(String name,int age,String addr) {
		
		stuName=name;
		this.age=age;
		this.addr=addr;
	}
	
	//getter메소드
	public String getStuName()
	{
		return stuName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getAddr()
	{
		return addr;
	}
	

}
