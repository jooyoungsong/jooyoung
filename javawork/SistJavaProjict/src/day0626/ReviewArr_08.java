package day0626;

public class ReviewArr_08 {

	public static void main(String[] args) {
		// 해당 배열을 for문 이용하여 출력하시오_why? 배열은 범위가 확실하기 때문
		
		//1. ex> 0번지: 영환이
		
		String[] names= {"영환이","수환이","동환이","성환이"};
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(i+"번지: "+names[i]);
		}
		
		//2.해당배열을 가로로 출력하시오
		int [] nums= {2,4,5,7,8};
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");

		}
		System.out.println();
		
		//flowers 
		String[] flowers= {"백합","데이지","해바라기","장미","튤립","수국"};
		for(int i=0;i<flowers.length;i++)
		{
			System.out.println((i+1)+"번째: "+flowers[i]);
		}
		
		
		
		//colors
		String[] colors= {"red","orange","yellow","green","blue","white","black"};
		for(int i=0;i<colors.length;i++)
		{
			System.out.print("("+i+")= "+colors[i]+" ");
			if(i==colors.length/2)
				System.out.println();
			
		}
		
	
		            

	}

}
