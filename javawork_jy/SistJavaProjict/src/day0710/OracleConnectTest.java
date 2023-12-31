package day0710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnectTest {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectSawon() {
		
		Connection conn=null;  //커넥션으로 연결이 되었으니깐 오라클을 이클립스에서 불러올 수 있음
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from sawon order by name";
		
		try {
			conn=DriverManager.getConnection(URL,"jooyoung", "a1234");
			System.out.println("클라우드 오라클 서버 연결 성공!!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//데이터가 없을 때까지 계속 불러와야 함_false값을 불러올 때까지
			while(rs.next()) //true값 반환, 더이상 데이터 없으면 false
			{
				//db로부터 데이터 가져오기
				int num=rs.getInt("num"); //컬럼명 or 열번호(1,2...) 사용 가능
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");
				
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 서버  연결 실패!!!"+e.getMessage());
		} finally {
			
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null)conn.close();
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			
			}
			
		}
	
	
	}
	
	public void connectBamin()
	{
		//주문번호  주문자  음식명  가격  상호명  가게위치  배송지
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select num 주문번호, name 주문자, foodname 음식명, price 가격, shopname 상호명, loc 가게위치, addr 배송지 from food f,jumun j where f.fno=j.fno order by name";
		
		try {
			conn=DriverManager.getConnection(URL, "jooyoung", "a1234");
			System.out.println("클라우드 오라클 서버 연결 성공!");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("주문번호\t주문자명\t음식명\t가격\t상호명\t가게위치\t배송지");
			
			while(rs.next())
			{
				int num=rs.getInt("주문번호");
				String name=rs.getString("주문자");
				String foodname=rs.getString("음식명");
				int price=rs.getInt("가격");
				String shopname=rs.getString("상호명");
				String loc=rs.getString("가게위치");
				String addr=rs.getString("배송지");
				
				System.out.println(num+"\t"+name+"\t"+foodname+"\t"+price+"\t"+shopname+"\t"+loc+"\t"+addr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 서버 실패!"+e.getMessage());
		} finally {
			
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public void connectSawonGroup()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select gender, count(*) cnt,to_char(avg(pay),'l999,999,999') avgpay from sawon group by gender";
		
		try {
			conn=DriverManager.getConnection(URL, "jooyoung", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("**성별 인원 및 평균급여**");
			System.out.println("성별\t인원수\t평균급여");
			System.out.println("======================================");
			
			while(rs.next())
			{
				String gender=rs.getString("gender");
				int count=rs.getInt("cnt");
				String avgpay=rs.getString("avgpay");
				
				System.out.println(gender+"\t"+count+"\t"+avgpay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OracleConnectTest oc=new OracleConnectTest();
		//oc.connectSawon();
		
		//OracleConnectTest oc1=new OracleConnectTest();
		//oc1.connectBamin();
		
		OracleConnectTest oc2=new OracleConnectTest();
		oc2.connectSawonGroup();
		
	}

}
