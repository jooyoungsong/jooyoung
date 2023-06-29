package day0629;

//class가 class: extends
//class가 interface: implements
//inter가 inter: extends
//implements는 다중구현이 가능하다

public class Food1 implements FoodGage {
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		//SHOPNAME="돈까스집"; (final이라 변경 안됨)
		System.out.println("음식을 주문합니다");
		
	}
	
	@Override
	public void baedal() {
		// TODO Auto-generated method stub
		
		System.out.println(SHOPNAME);
		System.out.println("음식을 배달합니다");
	}

	

}
