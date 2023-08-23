package day0704;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_05 {
	
	public static void fileWrite()
	{
		FileWriter fw=null;  //이렇게 반드시 null값 정해줘야 한다. 클래스가 아닌 메소드라서!
		String fileName="C:\\sist0615\\file\\filetest1.txt";
		//filetest1은 파일이 없으나 내가 만들거야!
		
		try {
			fw=new FileWriter(fileName); //파일 새로 생성(같은 이름이 있어도 새로 생성)
			
			//파일에 내용 추가
			fw.write("Have a Nice Day!!!!\n");
			fw.write(new Date().toString());  //날짜를 String 형식으로 바꿀 때 해줌
			System.out.println("***파일 저장 성공***");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void fileWrite2()
	{
		FileWriter fw=null;
		String fileName="C:\\sist0615\\file\\fileTest2.txt";
		
		try {
			fw=new FileWriter(fileName,true); //추가모드
			
			fw.write("내이름은 홍길동\n");
			fw.write("====================\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileWrite();
		fileWrite2();
	}

}
