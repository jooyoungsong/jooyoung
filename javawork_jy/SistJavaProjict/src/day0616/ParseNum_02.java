package day0616;

public class ParseNum_02 {

	public static void main(String[] args) {
		// String타입을 int타입으로 변경하려면
		// Integer.parseInt("10"); 문자열 1이 정수 1로 변환 (소수점은 표현하지 않음)
		// Double.parseDouble("12.23"); 문자열 12.23이 실수타입의 12.23으로 반환되는 것 

	
	    String num1="200";
	    String num2="7";
	    
	    
	    System.out.println("두수 더하기: "+(num1+num2));
	    
	    //문자열 num1,num2를 정수타입 int로 변환 후 계산
	    int su1=Integer.parseInt(num1);
	    int su2=Integer.parseInt(num2);
	    
	    System.out.println("변환후 두수 더하기: "+(su1+su2));
	    System.out.println("변환후 두수 빼기: " +(su1-su2));
	    System.out.println("변환후 두수 곱하기: " +(su1*su2));
	    System.out.println("변환후 두수 나누기: " +(su1/su2));
	    
	}

}
