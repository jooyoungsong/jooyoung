package day0627;

class ConstA{
	
	int num=0;
	
	//디폴트생성자...명시적인 생성자를 만드는 순간 디폴트 생성자는 자동생성 안된다.
	//필요하면 만들어준다
	public ConstA() {
		num=10;
		System.out.println("디폴트 생성자");
	}
	
	
	
	//인자있는생성자
	public ConstA(int num) {
		this.num=num;
		System.out.println("생성자 호출");
	}
	
	//메소드
	//public static void 대신 아래처럼 int라고 하는 순간 int값이 필요 (void는 없다는 뜻)
	public int getNumber() {
		
		num=50;
		
		return num;  //return 하는 순간 오류가 없어진다. void 아니면 무조건 return으로
		//int면 int로 return, string이면 string으로 return으로 할 것!
	}
	
	
}


//////////////////////////////////
public class ConstTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//명시적생성자(인자값=파라메타값으로 num을 보낸 생성자)
		ConstA cal=new ConstA(30);
		System.out.println(cal.num);
		
		//디폴트 생성자
		ConstA cal2=new ConstA();
		System.out.println(cal2.num);
		
		//메서드 호출
		ConstA cal3=new ConstA();
		System.out.println(cal3.getNumber());

	}

}
