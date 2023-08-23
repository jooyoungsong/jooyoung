package day0616;

public class PrintTest_06 {

	public static void main(String[] args) {
		
		//%d: 정수 %f:실수 %s: 문자열
		
		// printf로 출력하세요
		// 안녕하세요 제 이름은 송혜교입니다
		// 나이는 25세입니다.
		// escape 써서 사용하세요.(printf 써야하니 println 사용 못하잖아 그래서 escape 사용해보세요)
		// escape는 역슬래시 기호 들어간거임!
		
		String name="송혜교";
		int age=25;
		
		System.out.printf("안녕하세요 제 이름은 %s입니다\n나이는 %d세입니다",name,age);

	}

}
