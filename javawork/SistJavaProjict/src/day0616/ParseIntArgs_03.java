package day0616;

public class ParseIntArgs_03 {

	public static void main(String[] args) {
		/*[결과출력]
		 *내이름은 김영환
		 *자바점수는 88
		 *오라클점수는 77
		 *두과목의 합계는 165점 입니다]*/ 
		
		//변수선언
	    String name=args[0];    // String은 변수의 이름을 정해준다. args[0]은 내가 쓸 변수 순서
		int java=Integer.parseInt(args[1]);  //int는 정수를 말하고, Integer.paseInt는 문자를 숫자로 바꿔준다.(형변환)
	    int oracle=Integer.parseInt(args[2]);
		
		
	  System.out.println("[결과출력]");
	  System.out.println("내이름은 "+name);
	  System.out.println("자바점수는 "+java);
	  System.out.println("오라클점수는 "+oracle);
	  System.out.println("두과목의 합계는 "+ (java+oracle));
		

	}

}
