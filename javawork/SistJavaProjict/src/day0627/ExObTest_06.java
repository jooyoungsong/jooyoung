package day0627;

class ObTestA{
	
	private int x;
	private static int y;  // int static y;라고 써도 같은 말
	
	//x
	public void setx(int xx)   //set은 수정을 목적으로 하기에 인자값을 반드시 보내야한다
	{	
		//this.x=xx;  이름이 같을 때 예를 들면 다 x면 this 써서 구분
		x=xx;  //이름이 틀릴 때는 this 생략가능
	}
	
	//x
	public void getx()   //get 메소드는 인자값이 없다=>()의 값이 없음
	{
		System.out.println("x= "+this.x);  //this.x나 x와도 된다
	}
	
	//y
	public static void setY(int yy)
	{
		//this.y=yy; 레퍼런스변수는 this를 가지고 있지 않다
		//일반멤버변수 호출못함...static변수만 호출가능
		ObTestA.y=yy;
	}
	
	//y
	public static void getY()
	{
		System.out.println("y="+ObTestA.y);
	}
}


//////////////////////////////////////////
public class ExObTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * x는 생성...private 붙히는 순간 에러...메소드로 접근해라
		ObTestA oa1=new ObTestA();
		System.out.println(oa1.x);
		
		* y는 클래스명으로 호출
		System.out.println(ObTestA.y);
		*/
		
		//private변수이므로 메소드 만들어서 호출가능...변수에 직접 접근 안됨
		ObTestA oa1=new ObTestA();
		oa1.setx(20);  //수정 set메소드를 20으로 수정해봐
	    oa1.getx();
	    
	    ObTestA oa2=new ObTestA();
	    oa2.setx(50);
	    oa2.getx();
	    
	    
	   // ObTestA.y=200;   //private 붙어서 오류 뜬다_멤버 y에 직접 접근 못함
	    
	   //y호출...클래스명으로 호출
		ObTestA.setY(100);
		ObTestA.getY();

	}

}
