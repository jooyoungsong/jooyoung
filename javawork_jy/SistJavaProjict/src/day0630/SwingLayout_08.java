package day0630;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayout_08 extends JFrame {
	
	Container cp;
	JButton btn1;
	
	public SwingLayout_08(String title) {
		
		super(title);
		
		this.setBounds(200, 100, 300, 500);
		cp=this.getContentPane();
		
		
		cp.setBackground(new Color(255,255,200));
		
		//버튼생성
		btn1=new JButton("버튼1");
		//프레임에 버튼을 추가할 것
		//프레임 기본레이아웃이 BorderLayout임(동서남북을 가리킴)
		//BorderLayout 추가시 위치 지정 필수
		
		//this.add(btn1, BorderLayout.NORTH); //위쪽
		//this.add(btn1, BorderLayout.SOUTH); //아래쪽
		this.add("North",btn1);  //첫글자 대문자로 하는 것이 필수!
		
		
		//생성과 동시에 프레임 추가 또는 위치지정까지
		this.add("South",new JButton("아래쪽"));
		this.add("West",new JButton("왼쪽"));
		this.add("East",new JButton("오른쪽"));
		this.add("Center",new JButton("가운데"));
		
		//버튼1에 속성
		btn1.setBackground(Color.CYAN);
		btn1.setForeground(Color.white);
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingLayout_08("스윙 레이아웃 연습");

	}

}
