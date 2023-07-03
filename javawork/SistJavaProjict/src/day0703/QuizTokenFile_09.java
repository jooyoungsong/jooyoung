package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizTokenFile_09 {
	
	public static void fruitRead()
	{
		String fileName="C:\\sist0615\\file\\fruit.txt";
		BufferedReader br=null;
		FileReader fr=null;
		int amount;
		
    	try {
    		fr=new FileReader(fileName);
    		br=new BufferedReader(fr);
    		
    		System.out.println("***과일목록***");
    		System.out.println("상품\t수량\t단가\t총금액");
    		System.out.println("===============================");
    		
    		while(true)
    		{
    			String s=br.readLine();
    			
    			if(s==null)
    				break;
    			
    			String [] data=s.split(",");
    			amount=Integer.parseInt(data[1])*Integer.parseInt(data[2]);
    			System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+amount+"원");
    			
    		/*	//토큰아이저
    			StringTokenizer st=new StringTokenizer(s, ",");
    			
    			//배열개수만큼 반복출력
    			String sang=st.nextToken();
    			int su=Integer.parseInt(st.nextToken());
    			int dan=Integer.parseInt(st.nextToken());
    			int total=su*dan;
    			
    			System.out.println(sang+"\t"+su+"개\t"+dan+"원\t"+total+"원\t");
    			
    			*/
    			
    		}
    		
  
    		
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
	    } catch (IOException e) {
			
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		/*
		 ***과일목록***
		 상품   수량   단가   총금액
		 ------------------------
		 바나나  10   5000  50000
		 .
		 .
		 .
		 */
		fruitRead();

	}

}
