package day0628;

class Member{
	
	private String stuName; //학생명
	private String gender;  //성별
	private String addr;  //주소
	
	static String ban;
	static int cnt=0;
	
	//수정용 메서드
	public void setMembers(String name,String gender,String addr)
	{
		this.stuName=name;
		this.gender=gender;
		this.addr=addr;
	}
	
	
	//출력용 메서드
	public void getMembers()
	{
		cnt++;
		
		System.out.println("**학생"+cnt+"정보**");
		System.out.println("학생명: "+stuName);
		System.out.println("소속학급: "+Member.ban);
		// System.out.println("소속학급: "+ban);도 가능
		System.out.println("성별: "+gender);
		System.out.println("주소: "+addr);
		System.out.println("================================");
	}
	
	
}

///////////////////////////////////////
public class ExObject_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1=new Member();
		Member.ban="쌍용 자바 7강의장";
		m1.setMembers("최성현", "남자", "서울시 강남구");
		m1.getMembers();
		
		Member m2=new Member();
		m2.setMembers("장신영", "여자", "인천시");
		m2.getMembers();

	}

}
