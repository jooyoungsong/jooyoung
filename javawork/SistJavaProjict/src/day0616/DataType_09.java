package day0616;

public class DataType_09 {

	public static void main(String[] args) {
		// 묵시적 형변환 : 자동 결정되는 타입
		// String+int=String
		// double+int=double
		// long+short=long
		// char+int=int

		
		char a='a';
		
		System.out.println(a);
		System.out.println(a+2);
		System.out.println((char)(a+2)); //char+int=int
		
		
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3); //아스키 코드 65+3=68 _아스키코드 A가 65를 의미
		System.out.println(2+'b'); //아스키 코드 a=97,b=98
		System.out.println('a'+'b'); //97+98
		
		
	}

}
