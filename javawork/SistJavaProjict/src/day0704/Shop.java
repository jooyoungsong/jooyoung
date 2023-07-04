package day0704;

public class Shop {
	
	private String sangName; //상품
	private int su; //수량
	private int dan; //가격
	

	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	public Shop(String n,int s,int d) {
		this.sangName=n;
		this.su=s;
		this.dan=d;
	}

	//setter & getter 자동생성
	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	
	
	
}
