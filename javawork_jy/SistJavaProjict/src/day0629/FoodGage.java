package day0629;

public interface FoodGage {
	
	//인터페이스는 상수와 추상메소드만 선언이 가능하다
	String SHOPNAME="보슬보슬";  //상수...final생략 //final 안 붙여있어도 인터페이스에서는 final 붙은거야!
	
	public void order();   //abstract
	public void baedal();

}
