package day0621;

public class DoWhile_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		System.out.println("while문 결과");
		//선조건: 조건이 먼저 온다. 조건 안맞으면 실행하지 않음(참일동안만 반복)
		
		while(i>5)
		{
			//출력후 증가
			System.out.println(i++);
			
			/*System.out.println(i);
			i++;*/        //위와 같음
		}
		
		System.out.println("do-while문 결과");
		//후조건: 조건이 나중에 온다. 조건 안맞아도 한번 실행
		
		i=1;
		
		do {
			//출력후 증가
			System.out.println(i++);
		}while(i>5);

		
	}

}
