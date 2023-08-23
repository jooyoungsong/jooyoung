package day0704;

public class Board {
	
	private String wirter; //글쓴이
	private String subject; //제목
	private String content; //내용
	
	//디폴트생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	//명시적생성자
	public Board(String w,String s,String c) {
		this.wirter=w;
		this.subject=s;
		this.content=c;
	}
	
    //setter과 getter 자동생성
	public String getWirter() {
		return wirter;
	}

	public void setWirter(String wirter) {
		this.wirter = wirter;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
