package day0630;

import java.util.Scanner;

abstract class Command{
	
	abstract public void write();
}
//////////////////////////////
class Insert1 extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("출력합니다");
		
	}
	
	
}
//////////////////////////////
class List extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("조회합니다");
	}
	
	
}
//////////////////////////////
class Modify extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("수정합니다");
	}
	
	
}
//////////////////////////////
class Delete1 extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("삭제합니다");
	}
	
	
}

//////////////////////////////
public class OracleCRUD_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Command cmd=null;
		int i;
		
		exist:while(true)
		{
			System.out.println("1.추가  2.조회  3.수정  4.삭제  0.종료");
			System.out.println("==================================");
			i=sc.nextInt();
			
			switch(i)
			{
			case 1:
				cmd=new Insert1();
				break;
			case 2:
				cmd=new List();
				break;
			case 3:
				cmd=new Modify();
				break;
			case 4:
				cmd=new Delete1();
				break;
			case 0:
				System.out.println("종료합니다");
				break exist;
			default:
				System.out.println("**잘못입력했습니다**");
				break;
			}
			if(i<=4)
				cmd.write();

		}
		
		
	}

}
