package day0629;

class Point {
	int x;
	int y;

	// 디폴트생성자
	public Point() {
		System.out.println("super_디폴트 생성자");
	}

	// 명시적생성자
	public Point(int x, int y) {
		System.out.println("super_인자 있는 생성자");
		this.x = x;
		this.y = y;
	}

	// 메소드
	public void write() {
		System.out.println("x좌표=" + x + "y좌표=" + y);
	}

}

////////////////////////////  
class SubPoint extends Point {
	
	String msg;
	
	public SubPoint(int x,int y,String msg) {
		super(x,y);
		this.msg=msg;
		System.out.println("sub_인자 있는 생성자");
	}
	
	public SubPoint() {
		super();
		System.out.println("sub_디폴트 생성자");
	}

	// 오버라이딩...부모의 메소드 재구현할 목적
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
		System.out.println("메세지: " + msg);
	}
}

///////////////////////////////////////////
public class ExObTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubPoint sp=new SubPoint();
		sp.write();
		
		SubPoint sp1=new SubPoint(30, 50, "hello");
		sp1.write();
		

	}

}
