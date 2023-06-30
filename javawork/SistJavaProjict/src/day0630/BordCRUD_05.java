package day0630;

import java.util.Scanner;

interface Board{
	public void process();
}
////////////////////////////
class Insert implements Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 추가합니다");
	}
	
	
}
////////////////////////////
class Sellect implements Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 조회합니다");
	}
	
	
}
////////////////////////////
class Update implements Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 수정합니다");
	}
	
	
}
////////////////////////////
class Delete implements Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 삭제합니다");
	}
	
	
}
////////////////////////////
public class BordCRUD_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Board board=null;   //의미 없어, 나중에 배열 주려고 초기값 설정해놓는 것
		int n; //우리가 입력할 숫자
		
		while(true)
		{
			System.out.println("1.추가  2.조회  3.수정  4.삭제  9.종료");
			System.out.println("==================================");
			n=sc.nextInt();
			
			switch(n)  //조건문 switch(인자값)
			{
			case 1:
				board=new Insert();
				break;  //case에서 break는 case 빠져나가는 건데
			case 2:
				board=new Sellect();
				break;
			case 3:
				board=new Update();
				break;
			case 4:
				board=new Delete();
				break;
			/*default:
				System.out.println(""); _다른 숫자 다라는 뜻*/
			case 9:
				System.out.println("종료합니다");
				System.exit(0);  //여기서 break는 while(true)문이 빠져나가야 함
			default:
				System.out.println("**잘못입력했습니다**");
				break;
			}
			
			if(n<=4)
			   board.process();
			
		}

	}

}
