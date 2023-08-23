package day0620;

public class SubString_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="나는 쌍용에서 자바를 공부중입니다";
				
	    char ch=str.charAt(3);  //char는 숫자 셀 때 0부터 센다
	    String word1=str.substring(8); //string도 숫자 셀 때 0부터 센다.  
	    String word2=str.substring(8,11); //자바를 // 공백포함 // str.substring(처음포함,마지막은미포함)
	    int i=str.length(); //총길이, 갯수(공백포함) // str.length();는 길이기 때문에 1부터 시작함
	   
		System.out.println(ch);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(i);

	}

}
