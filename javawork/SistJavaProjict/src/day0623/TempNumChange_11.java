package day0623;

public class TempNumChange_11 {

	public static void main(String[] args) {
		// 순서바꾸기 temp(빈그릇)
		int a=10,b=20;
		
		System.out.println("a="+a+", b="+b);
		
		int temp=a;  //빈그릇에 a를 담았어
		a=b;         //a자리 비니깐 b 가지고 와
		b=temp;      //b자리 비워져서 빈그릇을 여기에 다 놔
		
		System.out.println("a="+a+", b="+b);
		
		System.out.println("배열로 순서 바꾸기");
		
		//
		int [] n= {5,7,9};
		
		for(int t:n)
		{
			System.out.print(t+" ");
		}
		
		System.out.println();
		
		
		System.out.println("0번과 2번 교환후 출력");
		
		int temp1=n[0];
		n[0]=n[2];
		n[2]=temp1;
		
		for(int t:n)
		System.out.print(t+" ");

	}

}
