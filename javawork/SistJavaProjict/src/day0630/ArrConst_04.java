package day0630;

abstract class Game{
	
	abstract void play();
	abstract void stop();
}
/////////////////////////////
class SungHyeon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 종료합니다");
	}
	
	
}
/////////////////////////////
class SoonYeong extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 종료합니다");
	}
	
		
}
///////////////////////////
class SunBum extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 시작합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 종료합니다");
	}
	
}

/////////////////////////////
public class ArrConst_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언
		Game [] gm=new Game[3];
		
		//각각의 sub로 생성
		gm[0]=new SungHyeon();
		gm[1]=new SoonYeong();
		gm[2]=new SunBum();
		
		//for(증가)
		for(int i=0;i<gm.length;i++)
		{
			gm[i].play();
		}
		
		System.out.println("-------------------------------");
		
		//for(감소)
		for(int i=gm.length-1;i>=0;i--)
		{
			gm[i].stop();
		}
	

	}

}
