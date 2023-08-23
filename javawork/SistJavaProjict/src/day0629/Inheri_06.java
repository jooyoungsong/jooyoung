package day0629;

class Shop {

	String sangpum;
	int su;

	public Shop(String sang, int su) {

		this.sangpum = sang;
		this.su = su;
	}

	public String getShop() {
		return sangpum + "," + su;
	}
}

class SubShop extends Shop {
	
	int price;
	public SubShop(String sang, int su, int p) {
		super(sang, su);
		price = p;
	}
	
	@Override
	public String getShop() {
		// TODO Auto-generated method stub
		return super.getShop()+","+price;
	}
	
}

public class Inheri_06 {

	public static void main(String[] args) {
		
		SubShop sub=new SubShop("컴퓨터", 2, 5000000);
		System.out.println(sub.getShop());

	}

}
