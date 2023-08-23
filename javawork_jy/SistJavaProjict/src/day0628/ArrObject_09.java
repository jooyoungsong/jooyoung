package day0628;

class Student{
	
	private String sname;
	private String hp;
	private int grade;          //grade는 int나 string 해도 됨
	
	//명시적 생성자(=생성과 동시에 초기값 주는 것)
	public Student(String sname,String hp,int grade) {
		
		this.sname=sname;
		this.hp=hp;
		this.grade=grade;
		
	}
	
	//멤버값 출력데이터
	public void getData()
	{
		System.out.println("이름: "+sname);
		System.out.println("연락처: "+hp);
		System.out.println("학년: "+grade);
		
	}
	
}

public class ArrObject_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student [] stu=new Student[3];
		
		stu[0]=new Student("이민규", "010-222-5555", 3);  //stu[i]가 참조변수
		stu[1]=new Student("최진평", "010-111-2222", 1);
		stu[2]=new Student("진현규", "010-444-7777", 4);*/
		
		//생성하면서 바로 초기화
		Student[] stu= {new Student("이민규", "010-222-5555", 3),
				new Student("최진평", "010-111-2222", 1),
				new Student("진현규", "010-444-7777", 4)
				};
				
		
		
		//출력_for
		for(int i=0;i<stu.length;i++) 
		{
			Student s=stu[i];
			s.getData();
			//stu[i].getData();
			System.out.println("--------------------");
		}
		
		//출력_for each문 사용
		//for(자료형 참조변수명:stu)
		for(Student s1:stu)
		{
			s1.getData();
			System.out.println("--------------------");
		}

	}

}
