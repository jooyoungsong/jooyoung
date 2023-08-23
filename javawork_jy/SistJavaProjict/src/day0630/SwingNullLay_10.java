package day0630;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingNullLay_10 extends JFrame implements ActionListener {

	Container cp;
	JButton btn1,btn2;

	public SwingNullLay_10(String title) {
		
	
		super(title);
		cp=this.getContentPane();
		this.setBounds(700, 100, 400, 400);    //setBounds=>swing창의 x축,y축,swing창의 가로,swing창의 세로
		cp.setBackground(Color.cyan);
		setDesign();
		setVisible(true);  //swing창 표시해라(true) , swing창 나타내기하지 않으려면(false)
	}
	
	//디자인
	public void setDesign()
	{
	   //기본레이아웃 없애기
		this.setLayout(null);
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		//위치 직접 지정
		btn1.setBounds(50, 100, 80, 30);
		btn2.setBounds(150, 100, 80, 30);
		
		//프레임추가
		this.add(btn1);  //버튼1 나타내라
		this.add(btn2);  //버튼2 나타내라
		
		//색상
		btn1.setForeground(Color.red);
		btn2.setForeground(Color.white);
		btn1.setBackground(Color.black);
		btn2.setBackground(Color.black);
		
		//이벤트
		btn1.addActionListener(this);  //버튼1을 누르면 어떤 이벤트를 발생시켜라
		btn2.addActionListener(this);  //버튼2을 누르면 어떤 이벤트를 발생시켜라
	}
	
	@Override  //ac하고 ctrl+space누르고 액션퍼포먼스 하고 (위치선정o)하거나 or SwingNullLay_10 눌러서 불러오기(자동,위치선정이 x)
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		if(ob==btn1)
			JOptionPane.showMessageDialog(this, "왼쪽으로 이동합니다");
		else if(ob==btn2)
			JOptionPane.showMessageDialog(this, "오른쪽으로 이동합니다");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingNullLay_10("레이아웃 없이 만들기");
	}

	
		
	

}
