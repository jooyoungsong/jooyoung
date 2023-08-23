package day0628;

class MyPersonInfo{
	
	private String name;
	private String blood;
	private String age;
	
	public MyPersonInfo(String name,String blood,String age) {
		
		this.name=name;
		this.blood=blood;
		this.age=age;
		
	}
	
	//제목
	public static void title()
	{
		System.out.println("이름\t혈액형\t나이");
		System.out.println("==========================");
	}
	
	//출력문
	public void getInfo()
	{
		System.out.println(name+"\t"+blood+"형\t"+age+"세");
	}
	
}

/////////////////////////////////////////
public class ArrObject_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPersonInfo.title();
		
		MyPersonInfo [] in1= {new MyPersonInfo("가은주", "A", "19"),
				new MyPersonInfo("나영희", "B", "25"),
				new MyPersonInfo("다라영", "O", "28")};
		
		System.out.println("총 "+in1.length+"명의 정보 출력");
		MyPersonInfo.title();
		
		//for each 출력
		for(MyPersonInfo info:in1)
			info.getInfo();
		
		System.out.println("--------------------------");
		
		MyPersonInfo.title();
		
		//for출력
		for(int i=0;i<in1.length;i++)
		{
			in1[i].getInfo();
		}
	}

}
