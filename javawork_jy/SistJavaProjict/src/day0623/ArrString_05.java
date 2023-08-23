package day0623;

public class ArrString_05 {   //이전에는 array를 int로 선언했다면 이번에는 array를 string으로 선언

	public static void main(String[] args) {
		// 배열선언 문자열선언후 초기값
		String [] str=new String[4];  //4개의 배열로 만들겠다고 정해줘야함
		
		//초기화
		str[0]="최진평";
		str[1]="고은비";
		str[2]="김영환";
		str[3]="홍성경";
		
		//출력
		System.out.println("for문으로 출력");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("for~each문으로 출력");
		
		for(String s1:str)
		{
			System.out.println(s1);
		}
			

	}

}
