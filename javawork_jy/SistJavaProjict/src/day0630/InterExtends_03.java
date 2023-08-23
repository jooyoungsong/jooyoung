package day0630;

interface InterAA{
	
	public void eat();
	public void go();
}
////////////////////////
interface InterBB extends InterAA{
	
	public void ride();
}
//////////////////////////
class InterImpl2 implements InterBB{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("저녁을 먹어요");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("롯데월드 가요");
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("자전거 타고 놀아요");
	}
	
	
}
//////////////////////////
public class InterExtends_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3개 모두 호출
		InterImpl2 im2 =new InterImpl2();
		im2.eat();
		im2.go();
		im2.ride();
						
		//다형성 호출(부모-자식)
		InterBB bb=new InterImpl2();   //interbb만 한 이유는 interbb에서 interaa를 가져왔으니깐 intetbb가 모두 포함하고 있어서(extends)
		bb.eat();
		bb.go();
		bb.ride();

	}

}
