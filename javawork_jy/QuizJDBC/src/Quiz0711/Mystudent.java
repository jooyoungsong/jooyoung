package Quiz0711;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Mystudent {
	
	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in);
	
	public void insertMystudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("학생이름은?");
		String stu_name=sc.nextLine();
		System.out.println("학년은?");
		int stu_grade=Integer.parseInt(sc.nextLine());
		System.out.println("핸드폰번호는?");
		String hp=sc.nextLine();
		System.out.println("주소는?");
		String addr=sc.nextLine();
		System.out.println("나이는?");
		int age=Integer.parseInt(sc.nextLine());
		
		String sql="insert into mystudent values (seq_stu.nextval,?,?,?,?,?,sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, stu_name);
			pstmt.setInt(2, stu_grade);
			pstmt.setString(3, hp);
			pstmt.setString(4, addr);
			pstmt.setInt(5, age);
			
			int a=pstmt.executeUpdate();
			
			if(a==1)
			    System.out.println("인서트 성공");
			else
				System.out.println("인서트 실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	
	}
	
	public void selectMystudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from mystudent order by stu_name";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int stu_num=rs.getInt("stu_num");
				String stu_name=rs.getString("stu_name");
				int stu_grade=rs.getInt("stu_grade");
				String hp=rs.getString("hp");
				String addr=rs.getString("addr");
				int age=rs.getInt("age");
				Date sdate=rs.getDate("sdate");
				
				System.out.println(stu_num+"\t"+stu_name+"\t"+stu_grade+"\t"+hp+"\t"+addr+"\t"+age+"\t"+sdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 연결실패:"+e.getMessage());
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	public void deleteMystudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("삭제할 시퀀스는?");
		int num=Integer.parseInt(sc.nextLine());
		
		String sql="delete from mystudent where stu_num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			pstmt.execute();
			System.out.println("***삭제 성공***");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	public boolean isData(String stu_num)
	{
		boolean b=false;
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from mystudent where stu_num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);
			rs=pstmt.executeQuery();
			
			if(rs.next())
				b=true;
			else
				b=false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return b;
	}
	public void updateMystudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("수정할 시퀀스는?");
		String num=sc.nextLine();
		
		if(!isData(num))
		{
			System.out.println("해당 시퀀스가 없습니다");
			return;
		}
		
		System.out.println("수정할 학생명은?");
		String stu_name=sc.nextLine();
		System.out.println("수정할 학년은?");
		int stu_grade=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 전화번호는?");
		String hp=sc.nextLine();
		System.out.println("수정할 주소는?");
		String addr=sc.nextLine();
		System.out.println("수정할 나이는?");
		int age=Integer.parseInt(sc.nextLine());
		
		
		String sql="update mystudent set stu_name=?,stu_grade=?,hp=?,addr=?,age=? where stu_num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, stu_name);
			pstmt.setInt(2, stu_grade);
			pstmt.setString(3, hp);
			pstmt.setString(4, addr);
			pstmt.setInt(5, age);
			pstmt.setString(6, num);
			
			pstmt.execute();
			
			System.out.println("***수정성공***");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void searchMystudent()
	{
		System.out.println("검색할 학생명(일부)");
		String stu_name=sc.nextLine();
		
		String sql="select * from mystudent where stu_name like ?";
		System.out.println(sql);
		System.out.println("시퀀스\t학생명\t학년\t핸드폰번호\t주소\t나이\t날짜");
		System.out.println("=========================================================================");
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+stu_name+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int stu_num=rs.getInt("stu_num");
				String sname=rs.getString("stu_name");
				int stu_grade=rs.getInt("stu_grade");
				String hp=rs.getString("hp");
				String addr=rs.getString("addr");
				int age=rs.getInt("age");
				Date sdate=rs.getDate("sdate");
				
				System.out.println(stu_num+"\t"+sname+"\t"+stu_grade+"\t"+hp+"\t"+addr+"\t"+age+"\t"+sdate);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mystudent st=new Mystudent();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("***학생정보***");
			System.out.println("1.입력   2.출력   3.삭제   4.수정   5.검색   9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				st.insertMystudent();
			else if(n==2)
				st.selectMystudent();
			else if(n==3)
				st.deleteMystudent();
			else if(n==4)
				st.updateMystudent();
			else if(n==5)
				st.searchMystudent();
			else if(n==9)
			{
				System.out.println("시스템을 종료합니다");
				break;
			}
		}
	}

}
