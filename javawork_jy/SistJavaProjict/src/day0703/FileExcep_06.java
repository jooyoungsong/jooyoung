package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//score.txt를 읽고 몇개인지 구하고,총점과 평균까지 구해서 출력
public class FileExcep_06 {

	public static void scoreRead()
	{
		String fileName="C:\\sist0615\\file\\score.txt";
		BufferedReader br=null;
		FileReader fr=null;
		int cnt=0;  //총갯수
		int total=0;  //총합계
		double avg=0;  //평균
		
		//파일읽기
		try {
			fr=new FileReader(fileName);   //file을 찾는 건 무조건 try catch 처리를 해주자고 자바에서 정해놓음
			System.out.println("파일 정상적으로 읽음");
			
			br=new BufferedReader(fr);   //파일 안에 파일을 담아서 버퍼리더에 담는 거야!
			
			while(true)
			 {
				String s=br.readLine();
				//더이상 값이 없으면 종료
				if(s==null)
					break;
				
				cnt++;  //읽은 갯수
				total+=Integer.parseInt(s);  //합계 //s만 하면 문자라서 형변환 필요
				
				System.out.println(s);
				
			 }
			//평균 구하기
			avg=(double)total/cnt;
			System.out.println("총갯수: "+cnt);
			System.out.println("총점: "+total);
			System.out.printf("평균: %.2f",avg);
			
		 	}catch(FileNotFoundException e) {
				System.out.println("파일이 없어요: "+e.getMessage());
			}catch(IOException e) {
				
			}finally {    //여기서 오류가 안 날지라도 DB에서는 finally 안쓰면 안 됨!!
				//자원은 오픈한 반대순서로 닫기
				try {
					br.close();
					fr.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scoreRead();
		System.out.println("***정상종료***");
		

	}

}
