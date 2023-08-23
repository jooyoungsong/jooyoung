package day0704;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] flowers= {"장미","후리지아","다알리아","수국"};

		//객체 삽입,삭제할 수 있는 컨테이너 클래스 생성
		//한가지만 담겠습니다 = Generic
		ArrayList<String> list=new ArrayList<String>();
		
		//데이터 담기
		for(String f:flowers)
		{
			list.add(f);  //삽입 //위에  {"장미","후리지아","다알리아","수국"};를 담는 것이다! 따로따로 안 써줘도 된다.
		}
		System.out.println("size: "+list.size());
		
		//
		System.out.println("#출력1_for");
		
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i);
			System.out.println(s);
		}
		
		//
		System.out.println("#출력2_for~each");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	
		
	}

}
