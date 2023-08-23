package day0621;

public class ExForWhile_10 {

	//변수가 이곳에 들어갈수도있다.
	public static void test1() {
		
		//for문으로 1~5까지 합구하기(반복문의 num을 sum에 더하는 문제)
		
		int sum=0;
	
		for(int i=1;i<=5;i++)
		{
			sum+=i;
			
		}
		
		System.out.println("총합계는 "+sum);
		//이렇게만하면 출력 안됨 main 메서드에서 불러와야 함.
	}
    //static 메소드는 굳이 생성하지 않고 클래스가 로딩이 되면 바로 쓸 수가 있다.
	//void가 아닌 string이나 int하면 return값 반환하라고 뜬다.
	
	
	public static void test2() {
		
	//1~10까지의 홀수합 for
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			sum+=i;
		}
		System.out.println("총합계는 "+sum);
		
		//for(int i=1;i<=10;i+=2)로 할 수 도 있음
		//sum+=i;
	}
	public static void test3() {
		
		
		//100까지의 합은 5050  100은 변수로 처리해서 출력하시오...for문 이용하시오
		int sum=0;
		int i;

		for(i=1;i<=100;i++)
		{
		  sum+=i;	
		}
		System.out.println(sum);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// 메인메소드 : 메소드의 시작과 끝을 담담한다
		//좋은 메소드는 하나의 기능만 담는다
		
		test1();
		test2();
		test3();
		

	}

}
