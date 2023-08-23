package day0619;

import java.util.Scanner;

public class QuizOper_08 {

	public static void main(String[] args) {
		//월 급여를 입력해서 만원,십원,일원 갯수를 출력하세요
		//ex. 금액을 입력하시오
		/*산술연산자를 이용하여 계산해보세요
		 * 2,565,325(쓸때는 ,쓰면 숫자로 인식 안되기에 빼주고 하세요)
		 * 
		 * ===========
		 * 만원: 256
		 * 천원: 5
		 * 백원: 3
		 * 십원: 2
		 * 일원: 5
		 * */
		
		Scanner sc=new Scanner(System.in);
		int pay;
		
		System.out.println("금액을 입력하시오");
		pay=sc.nextInt();  //pay를 한 줄로 받을 거라는 의미
		
		System.out.println("=======");
		System.out.println("만원: "+(pay/10000));
		System.out.println("천원: "+(pay%10000/1000));
		System.out.println("백원: "+(pay%1000/100));
		System.out.println("십원: "+(pay%100/10));
		System.out.println("일원: "+(pay%10/1));
		
		

	}

}
