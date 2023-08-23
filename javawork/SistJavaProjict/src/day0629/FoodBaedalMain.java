package day0629;

public class FoodBaedalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반적생성
		Food1 fd=new Food1();
		fd.order();
		fd.baedal();
		System.out.println();

		
		
		//다형성: 부모클래스 하나로 자식 여러명 쓸 수 있다
		FoodGage gage=new Food1();
		gage.order();
		gage.baedal();
		

	}

}
