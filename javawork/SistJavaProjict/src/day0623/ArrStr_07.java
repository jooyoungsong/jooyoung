package day0623;

public class ArrStr_07 {

	public static void main(String[] args) {
		// 문자형 배열 str1,str2...선언과 동시에 초기화
		
		String [] str1= {"김밥","피자","스파게티","햄버거","짜장면"};
		String [] str2=new String[5];  //5개의 문자열이 들어가도록 메모리할당,지금은 null로 초기화
		
		//str2에 문자열 넣기
		str2[0]="빨강";
		str2[2]="노랑";
		str2[4]="파랑";
		
		//str1을 변수 i를 이용해서 출력
		//음식1: 김밥
		//음식2: 피자 이런식으로 나오게 하시오 (전체를)
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println("음식"+(i+1)+":"+str1[i]);
		}
		
		
		//str1출력_for~each (김밥 피자 스파게티 햄버거 짜장면)
		for(String f1:str1)
		{
			System.out.print(f1+" ");
		}
		
		System.out.println();
		System.out.println();
		
		//str2도 2가지 방법 해보세요.
		System.out.println("str2도 2가지 방법 해보세요.");
		for(int i=0;i<str2.length;i++)
		{
			System.out.println("음식"+(i+1)+":"+str2[i]);
		}

		for(String f2:str2)
		{
			System.out.print(f2+" ");
		}

	}

}
