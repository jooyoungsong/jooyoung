package day0616;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a=127; // 바이트는 -128~127까지
		byte b=(byte)128; // 더 작은 자료형으로의 변환 (디모션_값손실) ,강제형변환(책page55)
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		int x=7;
		int y=4;
		
		System.out.println(x/y); //정수형끼리의 계산결과는 무조건 int타입
		System.out.println((double)x/y); //계산 시 x를 double로 변환해서 계산 (소수점으로 표현하고 싶다면 더블 함수 사용)
		System.out.println(x/(double)y); //계산 시 x나 y에 double로 붙여도 상관 없이 소수점으로 표현된다.
		
		//강제형변환
		
		double d=100.0; //double 쓰고 정수 쓰면 안되니깐 .0 붙인것
		int i=100;
		
		int result=(int)d+i;  // d=double, i=int (int<double니깐)
		double result2=d+i; // double result2=(double)d+i 로 맞춰줘도 된다. 오류 안 날 때는 더블 안 써도 된다는 말
		
		System.out.println("d="+d);
		System.out.println("i="+i);
		System.out.println("result="+result);
		
		
	}

}
