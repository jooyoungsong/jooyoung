package day0623;

public class ArrayTest_04 {

	public static void main(String[] args) {
		// 기본형배열은 객체로 인식
		
		int [] arr1,arr2; //배열로 선언
		arr1=new int[3];  //메모리할당
		arr2=new int[5];  //할당만 되도 값은 0으로 초기화
		
	   //int [] arr1=new int[3];
	   //int arr2[]=new int[5]; 같은 말임
		
		
		//arr1 배열에 값을 넣는다.
		arr1[0]=10;
		arr1[1]=5;
		arr1[2]=20;
		
		//배열의 갯수
		System.out.println(arr1.length);  //3(0~2)
		System.out.println(arr2.length);  //5(0~4)
		
		//arr1출력
		System.out.println("arr1 출력");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
	    //사실 위에건 반복문으로 사용해줘야해
		System.out.println("for문으로 arr1출력");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		//arr2를 출력해보는데 범위를 변수화한 for문으로 출력해보세요
		System.out.println("for문으로 arr2출력");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		//for~each(배열변수자료형 임의의 이름: 변수명)  배열 안에 모든 값을 출력하고 싶을 때 사용
		System.out.println("for~each_arr1");
		for(int a1:arr1)       //arr1이 int이기에 a1도 int여야 한다.
		{
			System.out.println(a1);
		}
		
		System.out.println("for~each_arr2");
		for(int a2:arr2)
		{
			System.out.println(a2);
		}
		
	}

}
