package day0621;

public class ExWhile_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		while(i<10)
		{
			System.out.println("Java"+i);
			i++;
		}
	    System.out.println("종료");
	    
	    
	    i=1;   //i 초기화
	    while(true)
	    {
	    	System.out.println("Java"+i);
	    	i++;
	    	
	    	//break
	    	if(i>=10)          //if(i==10)과 동일
	    		break;
	    	
	    }
	    

	}

}