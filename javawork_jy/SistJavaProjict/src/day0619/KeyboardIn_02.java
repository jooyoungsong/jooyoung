package day0619;

import java.util.Scanner;

public class KeyboardIn_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner는 문자열이나 숫자를 모두 키보드를 입력받으려 할 때 생성
		Scanner sc=new Scanner(System.in);
		//참조변수명 sc는 scanner에서 sc만 써준 것_사실 아무거나 써도 됨
		
		//변수
		//String name=null;    // null은 비어있다는 뜻, 숫자일때는 0 써준다면 비어있다는 뜻
		String name;
		int age;
		String city;
		
		//출력(입력문)
		System.out.print("이름을 입력해 보세요===>");
		name=sc.nextLine();  //한줄을 문자로 읽어온다(공백사용가능)
		
		System.out.print("나이를 입력해 보세요===>");
		//age=sc.nextInt();   //숫자를 읽어온다
		age=Integer.parseInt(sc.nextLine());   //숫자입력과 동시에 라인도 띄어준다
		//숫자 입력 후 엔터를 누르면 그 엔터가 키보드 버퍼로 저장되어 다음 문자열을 읽을 때 먼저 읽어버리는 문제가 발생
		//그래서 다음 문자열을 읽기 전에 sc.nextline()으로 형변환 한다.
		
		System.out.println("당신이 사는 지역은?===>");
		city=sc.nextLine();
		
		
		//최종출력
		System.out.println("내이름은 "+name+"입니다");
		System.out.println("내나이는 "+age+"세 입니다");
		System.out.println("내가 사는 지역은 "+city+"입니다");
		
	}

}
