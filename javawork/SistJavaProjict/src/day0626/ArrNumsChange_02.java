package day0626;

public class ArrNumsChange_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {4,6,7,33,22,44,1,78,8,9};  //총길이 10개 배열 0~9
		
		//출력
		System.out.println("원래데이터");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		//데이터 거꾸로 변경하기
		for(int i=0;i<arr.length/2;i++)  //거꾸로 할때 /2해주면 반반에서 가장자리부터 서로 교환됨
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i]; //10개일 때 배열(i) 0번째하고 9번째랑 바꾸는 것
			arr[arr.length-1-i]=temp;
		}
		
		//출력
				System.out.println("순서 바꾼 후 데이터");
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				
		//selection sort(오름차순 정렬)
	    //Arrays.sort(arr): 배열 arr을 정렬한다
		//선택정렬: 가장 작은 숫자를 앞으로 보내자
				
		//기준데이터는 0부터 끝에서 두번째까지 비교
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	//비교하는 데이터는 기준의 다음값부터 끝까지
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]>arr[j])           //i>j여야 둘이 바뀌는 것이기 때문
	    		{
	    			int temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    }
		
		//출력
		System.out.println("오름차순 정렬 후 데이터");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(); 

	}

}
