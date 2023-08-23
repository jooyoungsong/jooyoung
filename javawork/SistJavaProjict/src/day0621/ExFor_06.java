package day0621;

public class ExFor_06 {

	public static void main(String[] args) {
		
		// for문
		// 1~10까지 가로로 출력
		
		for(int i=1;i<10;i++)        //for문 안에서 int 선언은 for문 벗어나면 끝임,안에서만 작동함
		{
			System.out.print(i);
		}
		
		System.out.println();

       //10~1까지 가로로 출력
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i);
		}
		
		System.out.println();
		
		// 1~50까지를 출력하는데 3씩 증가하게 해보세요 
		//(두가지 방법이 있다_초기i=1과 3증가 하거나, continue 사용해서 스킵하는 방법)
		//1 4 7 ...
		
		for(int i=1;i<=50;i+=3)
			System.out.print(i+" ");  //{} 안해도 된다
		System.out.println(); 
		
		//continue
		//1~20까지 출력하는데 1 2 3 4 6 7 8 9 11 12  _5의 배수가 빠져있음
		for(int i=1;i<=20;i++)
		{
			//5의 배수를 빼고 출력하는 조건을 달아야 함
			if(i%5==0)
				continue;  //for문의 증감식 i++로 이동하게 된다.
				//break;  //이렇게 쓰면 5가 되면 그냥 빠져나가서 1 2 3 4까지만 도출된다.
			System.out.print(i+" ");
		}
		
	
		
		
	}

}
