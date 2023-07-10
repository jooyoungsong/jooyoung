import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizConnectNewBoard {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	public void connectSnsBoard() {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select b_num 기본키, nick 닉네임, subject 제목, content 내용, wday 현재날짜 from snsboard";
		
		try {
			conn=DriverManager.getConnection(URL, "jooyoung", "a1234");
			System.out.println("클라우드 오라클 서버 연결 성공!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int b_num=rs.getInt("기본키");
				String nick=rs.getString("닉네임");
				String subject=rs.getString("제목");
				String content=rs.getString("내용");
				String wday=rs.getString("현재날짜");
				
				System.out.println(b_num+"\t"+nick+"\t"+subject+"\t"+content+"\t"+wday);
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
		
		QuizConnectNewBoard b=new QuizConnectNewBoard();
		b.connectSnsBoard();

	}

}
