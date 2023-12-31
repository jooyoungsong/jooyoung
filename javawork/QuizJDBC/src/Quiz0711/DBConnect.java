package Quiz0711;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	//url
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//driver(딱 한번만 실행, 생성자에서 함)
	String driver="oracle.jdbc.driver.OracleDriver";
	
	public DBConnect() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 드라이버 실패!!!");
		}
	}
	
     //Connection에 관한 것 메소드로 만들어볼게요
	public Connection getConnection()
	{
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "jooyoung", "a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 연결실패: url,계정,비번 확인요망"+e.getMessage());
		}
		
		return conn;
	}
	
	


   //close메소드...총 4개
   public void dbClose(ResultSet rs,Statement stmt,Connection conn)
   {
	   try {
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   public void dbClose(Statement stmt,Connection conn)
   {
	   try {
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   
   public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn)
   {
	   try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   
   public void dbClose(PreparedStatement pstmt,Connection conn)
   {
	   try {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   
 }
