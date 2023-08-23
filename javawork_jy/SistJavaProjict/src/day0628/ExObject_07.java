package day0628;

class Score{
	
	private String stuName;
	private int java;
	private int oracle;
	private int html;
	
	static final String TITLE="중간고사 시험결과";

	
	//자동 setter,getter 불러오기
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	//합계메소드
	public int getTot()
	{
		int t=java+oracle+html;
		return t;
	}
	
	//평균메소드
	public double getAvg()
	{
		double a=getTot()/3.0;
		return a;
		
		// return getTot()/3.0;
	}
	
}

///////////////////////////////////////////////////////
public class ExObject_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Score.TITLE);
		
		Score semi1=new Score();
		semi1.setStuName("김지윤");
		semi1.setJava(99);
		semi1.setOracle(88);
		semi1.setHtml(56);
		
		System.out.println("학생명: "+semi1.getStuName());
		System.out.println("자바점수: "+semi1.getJava());
		System.out.println("오라클점수: "+semi1.getOracle());
		System.out.println("HTML점수: "+semi1.getHtml());
		System.out.println("합계점수: "+semi1.getTot());
		System.out.println("평균점수: "+semi1.getAvg());
		
		System.out.println("==========================");
		
		Score semi2=new Score();
		semi2.setStuName("박영주");
		semi2.setJava(80);
		semi2.setOracle(98);
		semi2.setHtml(67);
		
		String name2=semi2.getStuName();
		int java2=semi2.getJava();
		int oracle2=semi2.getOracle();
		int html2=semi2.getHtml();
		
		System.out.println("학생명: "+name2);
		System.out.println("자바점수: "+java2);
		System.out.println("오라클점수: "+oracle2);
		System.out.println("HTML점수: "+html2);
		System.out.println("합계점수: "+semi2.getTot());
		System.out.printf("평균점수:%.2f",semi2.getAvg());
		
		
	}

}
