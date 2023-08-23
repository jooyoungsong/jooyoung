package day0629;

public class Employee_04 {
	
	String sawonName;
	int salary;
	
	public Employee_04(String name, int sal) {
		
		this.sawonName=name;
		this.salary=sal;
		
	}
	
	//리턴 메소드
	public String getEmp()
	{
		return sawonName+","+salary;  //이거는 출력은 안 되는 거야
	}

}
