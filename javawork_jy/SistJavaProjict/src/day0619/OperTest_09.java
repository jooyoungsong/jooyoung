package day0619;

public class OperTest_09 {

	public static void main(String[] args) {
		// 비교(관계)연산자: >,>=,<,<=,==,!=
		// 논리연산자: &&(and),||(or),!(not)
		
		//결과값을 true,false출력
		int a=5,b=3,c=5;
		
		System.out.println(a>b); //true
		System.out.println(a=b); //false
		System.out.println(!(a==b)); //true
		System.out.println(a!=b); //true
		
		System.out.println(a>b&&b>c); //false_'true&&(그리고)false=false'
		System.out.println(a>b||b>c); //true_'true||(또는)false=true'
		
		
		
		
	}

}
