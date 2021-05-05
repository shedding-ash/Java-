package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Encryption_Classical.Atbash;
import Encryption_Classical.ROT;
import Encryption_Classical.Rail_fence;
import Encryption_Classical.Vigenere;
import config.FrameConfig;
import util.Insert;
public class ClassicalFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private JPanel panel1,panel2,panel3,panel4;
	private JTextField tfd1=new JTextField();    //�����ı���
	private JTextField tfd5=new JTextField();  //����
	private JTextField tfd6=new JTextField();  //����
	private JTextField tfd7=new JTextField();  //����
	private JLabel lbl1=new JLabel("���������Ļ����ģ�");    //������ǩ
	private JLabel lbl2=new JLabel("������"); 
	private JLabel lbl3=new JLabel("������"); 
	private JLabel lbl4=new JLabel("���ܴʣ�"); 
	private JButton btn1=new JButton("����Ͷι����");	
	private JButton btn5=new JButton("����");    //����JButton����
	private JButton btn6=new JButton("����");
	private JButton btn7=new JButton("�������ݿ�");
	private JButton btn8=new JButton("����");    //����JButton����
	private JButton btn9=new JButton("����");
	private JButton btn10=new JButton("�������ݿ�");
	private JButton btn11=new JButton("����");    //����JButton����
	private JButton btn12=new JButton("����");
	private JButton btn13=new JButton("�������ݿ�");
	private JButton btn14=new JButton("����");    //����JButton����
	private JButton btn15=new JButton("����");
	private JButton btn16=new JButton("�������ݿ�");
	private JButton btn100=new JButton("x");
	public ClassicalFrame()
	{
		super("�ŵ�����"); setBounds(600,300,400,300);
		JFrame jf=this;
		Container c = getContentPane();
		tabbedPane=new JTabbedPane();	//����ѡ�������
				 
		//�������
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		
		btn1.setBounds(135, 140, 130, 50);		
		this.add(btn1);
		
		
		 btn5.setBounds(10, 80, 90, 30);		 
		 btn6.setBounds(130, 80, 90, 30);	
		 btn7.setBounds(250, 80, 120, 30);	
		 btn8.setBounds(10, 80, 90, 30);		 
		 btn9.setBounds(130, 80, 90, 30);	
		 btn10.setBounds(250, 80, 120, 30);	
		 btn11.setBounds(10, 80, 90, 30);		 
		 btn12.setBounds(130, 80, 90, 30);	
		 btn13.setBounds(250, 80, 120, 30);	
		 btn14.setBounds(10, 80, 90, 30);		 
		 btn15.setBounds(130, 80, 90, 30);	
		 btn16.setBounds(250, 80, 120, 30);	
		 
		 btn1.addActionListener(new MyListener()); 		 
		 btn5.addActionListener(new MyListener()); 
		 btn6.addActionListener(new MyListener()); 
		 btn7.addActionListener(new MyListener()); 
		 btn8.addActionListener(new MyListener()); 
		 btn9.addActionListener(new MyListener()); 
		 btn10.addActionListener(new MyListener()); 
		 btn11.addActionListener(new MyListener()); 
		 btn12.addActionListener(new MyListener()); 
		 btn13.addActionListener(new MyListener()); 
		 btn14.addActionListener(new MyListener()); 
		 btn15.addActionListener(new MyListener()); 
		 btn16.addActionListener(new MyListener()); 
		 
		 panel1.add(btn5);
		 panel1.add(btn6);
		 panel1.add(btn7);
		 panel2.add(btn8);
		 panel2.add(btn9);
		 panel2.add(btn10);
		 panel3.add(btn11);
		 panel3.add(btn12);
		 panel3.add(btn13);
		 panel4.add(btn14);
		 panel4.add(btn15);
		 panel4.add(btn16);
		 
		 btn100.setBounds(280, 180, 30, 30);
		 btn100.addActionListener(new MyListener()); 
		 this.add(btn100);
		 btn100.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent actionEvent) {
	                jf.dispose();
	                new FrameConfig();
	            }
	        });
		 
		 tfd1.setBounds(110, 45, 250, 30);
		 tfd5.setBounds(50, 170, 70, 30);
		 tfd6.setBounds(50, 170, 70, 30);
		 tfd7.setBounds(50, 170, 70, 30);
	     this.add(tfd1);    
	     panel2.add(tfd5); 
	     panel3.add(tfd6); 
	     panel4.add(tfd7); 
		
	     lbl1.setBounds(3, 45, 110, 30);
	     lbl2.setBounds(3, 170, 50, 30);
	     lbl3.setBounds(3, 170, 50, 30);
	     lbl4.setBounds(3, 170, 50, 30);
	     this.add(lbl1);  
	     panel2.add(lbl2); 
	     panel3.add(lbl3); 
	     panel4.add(lbl4); 
		
	     JLabel labimg=new JLabel(new ImageIcon("img/���й۲�.jpg"));
	     this.add(labimg);
	     labimg.setBounds(313,138,70,140);
	        
		this.setBackground(Color.white);
		
		//����ǩ�����뵽ѡ���������
		tabbedPane.addTab("���ذ�ϣ",null,panel1,"First panel");
		tabbedPane.addTab("դ������",null,panel2,"Second panel");
		tabbedPane.addTab("ROT",null,panel3,"Third panel");
		tabbedPane.addTab("ά������",null,panel4,"Third panel");
 
		c.add(tabbedPane);
		c.setBackground(Color.white);
 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//�����Ӧ�¼�
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == btn1 ) 
				{
					
					new DonateFrame();
				}
				else if(e.getSource() == btn7||e.getSource() == btn10||e.getSource() == btn13||e.getSource() == btn16) 
				{				
//					String str=tfd1.getText();
//					Insert.insert(str);	
					tfd1.setText("�ݲ�֧��500�ֽ����ϵļӽ������㣡");
				}
				else if(e.getSource() == btn5||e.getSource() ==btn6) {
					String str=tfd1.getText();
					Atbash a=new Atbash();
					tfd1.setText(a.AtbashEnCode(str));
				}
				else if(e.getSource() == btn8) { 	
					String str=tfd1.getText();
					Rail_fence a=new Rail_fence();
					int b=Integer.parseInt(tfd5.getText());
					tfd1.setText(a.Rail_fenceEnCode(str,b));
				}
				else if(e.getSource() == btn9) { 	
					String str=tfd1.getText();
					Rail_fence a=new Rail_fence();
					int b=Integer.parseInt(tfd5.getText());
					tfd1.setText(a.Rail_fenceDeCode(str,b));
				}
				else if(e.getSource() == btn11||e.getSource() == btn12) { 
					String str=tfd1.getText();
					ROT a=new ROT();
					String b=tfd6.getText();
					tfd1.setText(a.ROTEncode(str,b));
				}
				else if(e.getSource() == btn14) { 
					String str=tfd1.getText();
					Vigenere a=new Vigenere();
					String b=tfd7.getText();
					tfd1.setText(a.VigenereEncryption(str,b));
				}
				else if(e.getSource() == btn15) { 	
					String str=tfd1.getText();
					Vigenere a=new Vigenere();
					String b=tfd7.getText();
					tfd1.setText(a.VigenereDecryption(str,b));
				}				
			}
		}	
	
	public static void main(String args[])
	{
		new ClassicalFrame();
	}
}