package day0629;


class MyTv{
	
	private String channel; //채널
	private String vol; //볼륨
	static String Title="**tv시청목록**";
	
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getVol() {
		return vol;
	}
	public void setVol(String vol) {
		this.vol = vol;
	}
	
	public void print() {        //여기서 print는 그냥 이름이야! 가로출력이라는 뜻 아님 그냥 출력의 의미로 이름 붙인거야!
		System.out.println(channel+"채널을 시청합니다");
		System.out.println("볼륨은 "+vol+" 데시벨 입니다");
		System.out.println("----------------------------");
	}

	
	
}
//////////////////////////////////////////////////////
public class ReviewObject_01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyTv.Title);
		
		MyTv tv1=new MyTv();
		tv1.setChannel("ebs");
	    tv1.setVol("15");
	    
	    tv1.getChannel();
	    tv1.getVol();
	    tv1.print();
	    
	    MyTv tv2=new MyTv();
	    tv2.setChannel("tvn");
	    tv2.setVol("22");
	    tv2.print();

	}

}
