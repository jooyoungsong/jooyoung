package day0619;

public class OperTest_06 {

	public static void main(String[] args) {
		// 증감연산자 ++,--
		int a,b;
		a=b=5;
		
		//증감연산자 테스트할 때, 
		//단항일경우에는 앞에 붙히거나 뒤에 붙히거나 같다. (수식의 경우는 다름)
		++a;//원래 a값에서 1증가
        b++;//b=b+1이랑 같은 의미이다.
		
		
		System.out.println("a="+a+",b="+b);
		
		//수식에서 사용할 때는 전치,후치의 결과값이 틀리다
		int m,n;
		m=n=0;
		a=b=5;      //다시 초기화로 a,b를 5로 만들었다
		
		m=a++; //후치일 경우 먼저 대입 후 증가한다_a뒤에 ++와서 후치_그럼 m에 먼저 숫자 대입 5
		System.out.println("m="+m+",a="+a); //m=5,a=6(=>m+1)
		
		n=++b; //전치일 경우 먼저 대입 후 증가한다_b앞에 ++와서 전치_그럼 b+1한 값이 n이 된다.
		System.out.println("n="+n+",b="+b); //n=6,b=6(=>(b=n))
		

	}

}
