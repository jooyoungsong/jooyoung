package day0628;

class Test{
	
	public Test() {
		System.out.println("디폴트 생성자");
	}
	
	//생성자 대신 인스턴스를 반환해주는 메소드
	public static Test getInstance()  //getter가 아니고 calendar배울 때 get 가져왔던 개념_이건 get안써도 됨_그냥 개발자들끼리 암묵적으로 써서 쓴것
	{
		return new Test();
	}
	
	//일반메소드
	public void writeMessage()
	{
		System.out.println("안녕??");
	}


}


////////////////////////////////////////////////
public class ConstGetInstance_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test();
		t1.writeMessage();
		///////////////////////////////////////
		Test t2=Test.getInstance();
		t2.writeMessage();

	}

}
