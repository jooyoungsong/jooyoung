package day0619;

public class IfTest_14 {

	public static void main(String[] args) {
		
		/*int n=20;
		
		if(n>=100) {
			System.out.println("n은 100보다 크거나 같다");
		    System.out.println("***");
			
		}
		    System.out.println("프로그램종료!!!");*/
		    
		
       //i가 홀수인지 짝수인지 구하기
		/*int i=9;
		
		if(i%2==1)
			System.out.println(i+"는 홀수입니다");
		else {
			System.out.println(i+"는 짝수입니다");*/
		
		
		//if문을 이용해서 학점 구하기..90점 이상 A,80점 이상 B,70점 이상 C,60점 이상 D,60점 미만 F
		int score=88;
		/*String grade;  //grade는 string("")이나 char(')로 두어도 된다.
		
		if(score>=90) 
			grade="A";
					
			else if(score>=80)
				grade="B";
			else if(score>=70)
				grade="C";
			else if(score>=60)
				grade="D";
			else
				grade="F";
			
		
		System.out.println("학점은"+grade+"입니다");*/
	
		//학점을 삼항연산자를 이용하여 구해보기
		
		String grade=score>=90?"A":
			  score>=80?"B":
			  score>=70?"C":
			  score>=60?"D":"F";
		
			  System.out.println("학점은"+grade+"입니다");
		
	}
}
		
		
		
		



