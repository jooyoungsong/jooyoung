package day0626;

import java.util.Arrays;

public class LottoSort_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] lotto=new int[6];
		
		
		for(int i=0;i<lotto.length;i++)
		{
			//1~45까지의 랜덤수 발생
			lotto[i]=(int)(Math.random()*45)+1;
			
			//중복처리
			for(int j=0;j<i;j++)    //j는 변수의 배열이고
			{
				if(lotto[i]==lotto[j])  //lotto[j]는 배열의 해당 값이다.
				{
					i--;      //같은 번지에 다시 값을 구하기 위함_로또 index(배열) i와 j가 같다면 i는 빼줘야 중복이 제거됨 
					break;    //중복제거 후 i++로 가야하기 때문에 break 써준다. 그럼 반복문 for문 빠져나간다.
				}
			}
		}
		
		//Arrays.sort(lotto);
		//오름차순정렬(기준데이터:처음~끝에서2번째/비교데이터:처음의 다음값부터 끝까지)
		
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		
		//출력
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		System.out.println();

	}

}
