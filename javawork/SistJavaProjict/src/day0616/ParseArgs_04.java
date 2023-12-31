package day0616;

public class ParseArgs_04 {

	public static void main(String[] args) {
		/* main에서 실행할 때 args로 변수 넘기는 문제
		 * main 함수에서 String과 args로 고정되어 있으니 우리는 String을 정의하고 숫자는 문자열로 표현되니 형변환으로 숫자로 바꿔주기
		 * 변수명: sangName, su, dan, total로 지정
		 * 
		 * 1. 변수선언
		 * 2. 계산
		 * 3. 출력
		 * 
		 * [상품정보]
		 * 상품명: 갤럭시폴드
		 * 수량: 5개
		 * 단가: 800000 원
		 * 총금액: 4000000 원*/


		//1.변수선언
		String sangName=args[0];
		int su=Integer.parseInt(args[1]);
		int dan=Integer.parseInt(args[2]);
		int total=su*dan; //int total; 로 정의만 해도 된다. 그리고 계산에서 total su*dan;을 적어주면 되긴함

        //2.계산, 출력
		System.out.println("[상품정보]");   //c언어에서는 printf도 라인 나누기 기능임(=java에서 println과 동일)
		System.out.println("상품명: "+sangName);
		System.out.println("수량: "+su+"개");
		System.out.println("단가: "+dan+"원");
		System.out.println("총금액: "+total+"원");
	}

}
