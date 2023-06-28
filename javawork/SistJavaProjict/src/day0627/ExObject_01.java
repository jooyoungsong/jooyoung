package day0627;

public class ExObject_01 {
	
	String name;     //instance변수라고 봐야한다...일반적인 인스턴스 멤버변수는 객체 생성 후 각각 다른값을 가질 수 있다
	static String MESSAGE="Happy Day!!!";   //상수는 all 대문자로 표현하기 //static은 공동으로 다 알려줄 때
	//static final String MESSAGE="Happy Day!!!"라고 써도 된다 (final) 붙여서// 상수로 만들면 아무도 수정하지 못하게 할 수 있다
	//static 멤버변수는 주로 상수로 선언할 때 사용하며 인스턴스 변수없이 클래스명으로 접근가능하다.
	//여러 객체가 같은 값을 가져야 할 경우 주로 static으로 선언한다.

	/*생성자
	 * public ExObject_01() {
	 
		// TODO Auto-generated constructor stub
	                        }  //생성만을 목적으로 태어난 아이*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("static변수는 new로 생성없이 호출가능");
		System.out.println(ExObject_01.MESSAGE);
		System.out.println(MESSAGE);
		// MESSAGE="Nice Day!!!";  //final이어서 값변경이 되지 않아 오류난다.
		
		
	    // 클래스명 참조변수명=new 클래스명();
		ExObject_01 ex1=new ExObject_01();  
		System.out.println(ex1.name);  //null
		
		ex1.name="김철수";
		System.out.println(ex1.name);
		
		
		ExObject_01 ex2=new ExObject_01();
		ex2.name="홍길동";
		System.out.println(ex2.name);
		
		
		ExObject_01 joo=new ExObject_01();
		joo.name="주영";
		System.out.println(joo.name);
		
		System.out.println("다같이 사용하는 메세지: "+MESSAGE);

	}

}
