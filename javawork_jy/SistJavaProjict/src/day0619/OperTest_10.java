package day0619;

public class OperTest_10 {

	public static void main(String[] args) {
		// 대입연산자 :왼쪽에 있는 걸 오른쪽에 대입한다
		// 대입연산자 +=,-=,*=,/=,%=
		
		int a,b,c,d,e;
		a=b=c=d=e=10;
		
		a+=2;  //a=a+2  2를 a에 대입해서 10+2=12  a에 2를 더한 값이 다시 a
		b-=3;
		c*=3;
		d/=3;
		e%=3;
		
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);   
		

	}

}
