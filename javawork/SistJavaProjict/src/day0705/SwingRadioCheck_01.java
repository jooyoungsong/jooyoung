package day0705;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingRadioCheck_01 extends JFrame implements ActionListener{

	Container cp;
	//전역변수인 JRadioButton ~ 기본적으로 배열로 놓으세요
	JRadioButton [] rb=new JRadioButton[4];  //하나만 선택하고 싶을 때
	JCheckBox [] cb=new JCheckBox[4];
	//라디오버튼과 체크박스가 출력될 라벨
	JLabel lblMessage; //라디오버튼,체크박스 결과값 출력할 곳
	//패널 생성
	JPanel pTop,pBottom;  //라디오버튼,체크박스 올릴 패널
	Color [] colors= {Color.red,Color.pink,Color.blue,Color.green};

	
	public SwingRadioCheck_01(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 600, 500);
		cp.setBackground(new Color(255,255,200));
		setDesign();
		setVisible(true);
	}

	public void setDesign()
	{
		//상단패널에 보더로 감싼 4개의 radio button 만들기
		String [] str1= {"빨강","핑크","파랑","초록"};
		pTop=new JPanel();
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North",pTop);
		
		
		//라디오 버튼 하나만 선택되도록 그룹을 지어줌
		ButtonGroup bg=new ButtonGroup();
		
		for(int i=0;i<rb.length;i++)
		{
			rb[i]=new JRadioButton(str1[i],i==1?true:false);  //라디오버튼 생성 (string값으로 했을때)
			rb[i].addActionListener(this);  //라디오버튼에 액션 추가
			pTop.add(rb[i]); //4개의 버튼을 탑패널에 추가
			bg.add(rb[i]);  //add 안하면 다중선택된다
 		}
		
		//이미지 넣기
		ImageIcon icon=new ImageIcon("C:\\sist0615\\swingimg\\icon02.png");
		
		lblMessage=new JLabel("Have a Nice Day!!!",icon,JLabel.CENTER);
		lblMessage.setHorizontalTextPosition(JLabel.LEFT);
		lblMessage.setBorder(new LineBorder(Color.green,2)); //라인굵기
		this.add("Center",lblMessage);
		
		//하단패널에 보더로 감싼 4개의 checkbox버튼 만들기
		pBottom=new JPanel();
		pBottom.setBorder(new TitledBorder("가능언어"));
		this.add("South",pBottom);
		
		String [] str2= {"Java","ORACLE","HTML","JSP"};
		
		for(int i=0;i<cb.length;i++)
		{
			cb[i]=new JCheckBox(str2[i]);  //JCheckBox에서 string타입
			cb[i].addActionListener(this);
			pBottom.add(cb[i]);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingRadioCheck_01("라디오 체크 연습");

	}

	//이벤트 메소드 받기
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//명확한 객체 생성 위해 해당 작업 함
		Object ob=e.getSource();
		
		//라디오 버튼 호출처리, 메세지를 컬러별로 출력
		for(int i=0;i<rb.length;i++)
		{
			if(ob==rb[i])
			{
				lblMessage.setForeground(colors[i]);
				lblMessage.setFont(new Font("",Font.BOLD,20));
			}
		}
		
		//체크박스 호출처리..선택한 체크를 라벨메세지별 출력
		String lang="나의 가능언어는 ";
		
		for(int i=0;i<cb.length;i++)
		{
			if(cb[i].isSelected())
			{
				lang+=cb[i].getText()+"";
			}
		}
		
		lblMessage.setText(lang);
		
		//Have a Nice Day!!!로 돌아가고 싶다면?
		//클래스 타입비교
		if(ob instanceof JCheckBox)
			lblMessage.setText(lang);
		else if(ob instanceof JRadioButton)
			lblMessage.setText("Have a Nice Day!!!");
		
	}

}
