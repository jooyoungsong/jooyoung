package day0627;

class Student{
	
	private String name;  //null
	private int age;  //0
	
	//setter_method
	//인스턴스변수에 저장된 데이터를 수정할 목적(사용방법: set변수명)_수정할 인자값 있다
	//저장및수정용도이므로 리턴값(결과값)이 없다(void)
	
	//getter_method
	//인스턴스변수에 저장된 데이터를 조회할목적(select=출력)으로 사용(사용방법: get변수명)
	//데이터를 얻는 목적으로 호출데이터를 넘겨줄 필요가 없으므로 인자값(=파라메타값)이 없다
	//실행결과를 돌려주므로 "return 결과값"으로 지정
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
}
//////////////////////////////////////
public class SetGetMethod_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.객체생성
		Student stu1=new Student();
		
		//2.참조변수명으로 set에서도 호출
		stu1.setName("최지우");
		stu1.setAge(33);
		
		//3.get메서드를 통한 값을 얻기
		String name=stu1.getName();
		int age=stu1.getAge();
		
		//4.출력
		System.out.println(name+" "+age);
		
		//한명 더 생성 해보세요
		Student stu2=new Student();
		stu2.setName("홍길동");
		stu2.setAge(38);
		String name2=stu2.getName();
		int age2=stu2.getAge();
		System.out.println(name2+" "+age);
				
		

	}

}
