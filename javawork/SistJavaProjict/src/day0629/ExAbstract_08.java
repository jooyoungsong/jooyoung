package day0629;
/*
 추상클래스는 new로 생성하지 못함
 추상메소드가 하나라도 존재하는 클래스를 추상 클래스라고 한다
 추상클래스-> 일반메서드,추상메서드 둘다 존재 가능
 */
abstract class Fruit{
	//class에 abstract 붙여준다_아래에 추상메소드 있기에 class도 바꿔줘야 함!
	
	static final String MESSAGE="오늘은 비 많이 오는 날";
	
	//일반메소드
	public void getTitle()
	{
		System.out.println("우리는 추상클래스 공부중!!!");
	}
	
	
	//추상메소드(미완의 메소드...선언문만 있고 구현부인 몸통이 없는 것을 말한다)
	//public void showMessage(); -> 오류남->abstract 붙여주기
	abstract public void showMessage();
	//근데 또 에러나기에 class 앞에도 abstract 붙여준다
}
//////////////////////////////
class Apple extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Apple_Message");
		System.out.println(Fruit.MESSAGE);
	}
	
	
}
//////////////////////////////
class Banana extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Banana_Message");
		
	}


}
//////////////////////////////
class Orange extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Orange_Message");
	}


}

//////////////////////////////
public class ExAbstract_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반생성_메소드 호출
		Apple apple=new Apple();
		Banana banana=new Banana();
		Orange orange=new Orange();
		
		apple.showMessage();
		banana.showMessage();
		orange.showMessage();
		
		//다형성
		//다형성은 하나의 변수로 여러가지 일을 처리할 때 이용
		//부모클래스명 변수명=new 자식클래스명();
		Fruit fruit;
		
		fruit=new Apple();
		fruit.showMessage();  // 생성하고 다음에 출력하는 문은 해당 Apple에 대한 메서드를 불러와라.
		
		fruit=new Banana();
		fruit.showMessage();  // 생성하고 다음에 출력하는 문은 해당 Banana에 대한 메서드를 불러와라.
		
		fruit=new Orange();
		fruit.showMessage();  // 생성하고 다음에 출력하는 문은 해당 Orange에 대한 메서드를 불러와라.
		
		fruit.getTitle(); 

	}

}
