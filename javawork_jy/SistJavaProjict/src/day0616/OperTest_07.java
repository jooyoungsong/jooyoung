package day0616;

public class OperTest_07 {

	public static void main(String[] args) {
		//기본자료형_총 8개
		// 1.논리형_true,false
		boolean b=false;  //Boolean flag=false;로 써도 된다. 왜? 변수니깐, false로 무조건 놓고 하기 왜? 없을 수도 있으니깐 
        
		
		// 2.문자형
		// 반드시 하나의 문자 16비트로 유니코드값 표현
		// 자바에서 char 문자 하나 2byte
		// 기본적으로는 정수형, 아스키코드로 변환하면 한글,영어를 숫자로 표현 가능(구글에서 검색_아스키코드)_거의 스트링만 쓰는데 char는 정교할 때
		char ch='A';		
		
		
		// 3. 정수형
		byte a=-128; // 1byte는 -128~127까지 가능
		short s=32000; // 16bit
        int c=6700000; // 32bit
		long num=100L; // 64bit, long을 표현하기에 숫자 뒤에 대소문자 L,l을 붙여준다.
		
		
		// 4. 실수형
		double d=42356.14526; // 64bit, 소수점을 의미, double이 소수점 할 때 기본
		float f=3.1234568f; // 32bit, double과 구분하기 위해 숫자 뒤에 f 붙여준다.
		
		
		// int,float는 똑같이 32bit 사용하지만, 기본적으로 실수형이 정수형보다 큰 타입으로 처리된다.
		
		//출력
		System.out.println("bool+"+b);
		System.out.println("not bool="+!b);
		System.out.println("ch="+ch); //65
		System.out.println("ch="+(ch+1)); //66
		System.out.println("ch="+(char)(ch+1)); //B _ ch+1은 66인데 char(문자)로 해서 B가 된다
		System.out.println("d="+d); //정밀도 15자리
		System.out.println("f="+f); //정밀도 8자리
		//printf %f:실수 
		//전체자리수 10자리 소수점 2자리
		System.out.printf("d=%10.2f\n",d);
		//소수점 1자리
		System.out.printf("d=%.1f",d);
		
	}

}
