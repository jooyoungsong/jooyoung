package day0616;

public class PrintFTest_05 {

	public static void main(String[] args) {
		// Printf는 문자열을 구성해서 출력
		// 문자열("")뒤에 따라오는 데이터(%d등_page69)를 순서대로 배치
		// %쓸 때만 printf 사용해준다
		// %d: 정수 %f: 실수 %s: 문자열
		
		int num1=10,num2=20;  //같은 자료형은 한줄로 표현도 가능
		int num3=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+num3);
		
		//printf로 출력
		System.out.printf("num1의 값은 %d,num2의 값은 %d,num3의 값은 %d입니다",num1,num2,num3);
		

	}

}
