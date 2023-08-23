package day0621;

public class ExWhile_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문으로 1부터 10ㄹ까지 출력
		
		int n=0;
		
		while(n<10)
		{
			n++;    //단항
			System.out.printf("%4d",n);
		}
		System.out.println();
		
		//다른방법
		n=0;   //단항 아님,수식임 //int n=0; 못하는 이유는 앞에서 선언 지금 n=0;한 것은 위에거 초기화한다는 뜻
		while(n<10)
		{
			System.out.printf("%4d",++n);  //이건 단항으로 인식이 아니라 수식으로 이용되어 전치 후치에 따라 결과 다름
		}
		System.out.println();
		
		//true 
		n=0;
		while(true)      //true일 동안
		{
			System.out.printf("%4d",++n);
			
			//무한루프에 빠지므로 반드시 break문을 주어야 한다
			if(n==10)
				break;
		}
		System.out.println();
		
		
	
			
		

	}

}
