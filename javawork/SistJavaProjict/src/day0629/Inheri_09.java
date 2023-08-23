package day0629;

class Work{
	
	public void process()
	{
		System.out.println("작업중!!!");
	}
}
///////////////////////////
class Food extends Work{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***음식을 합니다!!!***");
	}
}
class Clean extends Work{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***청소를 합니다!***");
	}
}
class Study extends Work{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***공부를 합니다!***");
	}
}

///////////////////////////
public class Inheri_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반적인 생성...메소드호출
		Food food=new Food();
		Clean clean=new Clean();
		Study study=new Study();
		
		food.process();
		clean.process();
		study.process();
		
		//다형성(new로 어떠한 자식이 호출되었는가!!를 보는 것이다)
		//다형성...하나의 변수를 호출 시 누가 생성되었느냐에 따라 그 기능이 달라짐
		Work work=null;
		
		work=new Food();
		work.process();
		
		work=new Clean();
		work.process();
		
		work=new Study();
		work.process();
				

	}

}
