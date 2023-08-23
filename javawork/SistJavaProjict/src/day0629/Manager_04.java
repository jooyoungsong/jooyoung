package day0629;

public class Manager_04 extends Employee_04 {

	String buseo;
	public Manager_04(String name, int sal, String b) {
	
		super(name, sal); //부모생성자 호출
		buseo=b;  //초기화
		
	}
	
	//하위클래스에서 부모클래스의 메소드를 수정해서 사용하는 것이 '오버라이딩'이다
	//전제조건: 1.상속 2.메소드이름동일 3.리턴타입도 동일
	
	@Override  //get을 누르고 ctrl+space누르고 불러옴
	public String getEmp() {
		// TODO Auto-generated method stub
		
		return super.getEmp()+","+buseo;
	}

}
