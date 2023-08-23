package day0616;

public class QuizDataType_10 {

	public static void main(String[] args) {
		/* 매개변수(위에 args)를 이용하여 출력해보세요
		 * [시험결과]
		 * Java=88,Jsp=77,Spring=99
		 * 총점: 264점
		 * 평균: 88.00 점*/

		
		//1.변수선언&계산
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		//int count=3 해줘도 되고 아래처럼 /3으로 나눠줘도 된다. _count=3은 과목 3개를 의미
		int total=java+jsp+spring;
		
		double average=total/3; //double>int
		//double avg2=(double)tot/count;이렇게 해도 된다.
			
		
		//2.출력
		System.out.println("[시험결과]");
		System.out.println("Java="+java+",Jsp="+jsp+",Spring="+spring);
		System.out.println("총점: "+total+"점");
		System.out.println("평균: "+average+"점");
				
				/*System.out.printf("java=%d,jsp=%d,spring=%d\n",java,jsp,spring);
				 *System.out.println("총점: "+total+"점");
				 *System.out.printf("평균: %.2f점",average);*/ //이렇게 표현해줘도 나온다.
				
				
	}

}
