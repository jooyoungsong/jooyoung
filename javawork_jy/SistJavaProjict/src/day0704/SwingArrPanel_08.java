package day0704;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingArrPanel_08 extends JFrame implements ActionListener{
		
		Container cp;
		JButton [] btn=new JButton[6];
		String [] btnLabel= {"Red","Green","Gray","Cyan","Yellow","White"};
		Color [] btnColor= {Color.red,Color.green,Color.gray,Color.cyan,Color.yellow,Color.white};
		
		public SwingArrPanel_08(String title) {
			super(title);
			cp=this.getContentPane();
			this.setBounds(200, 100, 500, 400);
			cp.setBackground(new Color(255,255,200));
			setDesign();
			setVisible(true);
		}
		
	public void setDesign()
	{
		//panel 기본이 Flowlayout
		JPanel panel=new JPanel();
		panel.setBackground(Color.orange);
		//프레임에 패널을 추가_상단 하단...
		this.add(panel,BorderLayout.NORTH);
		
		//버튼생성
		for(int i=0;i<btn.length;i++)
		{
			btn[i]= new JButton(btnLabel[i]);
			
			//버튼색
			btn[i].setBackground(btnColor[i]);
			
			//패널에 추가
			panel.add(btn[i]);
			
			//버튼 6개에 이벤트 추가
			btn[i].addActionListener(this);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingArrPanel_08("스윙 배열연습");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		for(int i=0;i<btn.length;i++)
		{
			if(ob==btn[i])
			{
				//배경색
				cp.setBackground(btnColor[i]);  //배경색만 cp고 나머지 제목이나 이런 것들은 다 this야!
			
			    //제목바꾸기
			    this.setTitle("color:"+btnLabel[i]);
			}
		}
		
	}

}
