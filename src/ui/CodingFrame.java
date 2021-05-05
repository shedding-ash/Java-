package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Encryption_Coding.ASCII;
import Encryption_Coding.Conversion_2;
import Encryption_Coding.HEXCoder;
import Encryption_Coding.MorseCoder;
import Encryption_Coding.URL;
import Encryption_Coding.Unicode;
import Encryption_Coding.base_64;
import config.FrameConfig;
import util.Insert;


public class CodingFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private JPanel panel1,panel2,panel3,panel4;
	private JPanel panel5,panel6,panel7,panel8;
	private JTextField tfd1=new JTextField();    //创建文本框
	private JTextField tfd2=new JTextField();    //创建文本框
	private JTextField tfd3=new JTextField();    //创建文本框
	private JTextField tfd4=new JTextField();    //创建文本框
	private JTextField tfd5=new JTextField();    //步进框
	private JTextField tfd6=new JTextField();    //创建文本框
	private JTextField tfd7=new JTextField();    //步进框
	private JTextField tfd8=new JTextField();    //步进框
	private JLabel lbl1=new JLabel("请输入明文或密文：");    //创建标签
	private JLabel lbl2=new JLabel("分隔符：");    //创建标签
	private JLabel lbl3=new JLabel("分隔符：");    //创建标签
	private JLabel lbl4=new JLabel("分隔符：");    //创建标签
	private JLabel lbl5=new JLabel("步进：");    //创建标签
	private JLabel lbl6=new JLabel("分隔符：");    //创建标签
	private JLabel lbl7=new JLabel("原进制：");    //创建标签
	private JLabel lbl8=new JLabel("目标进制:");    //创建标签
	private JButton btn1=new JButton("！！投喂！！");
	private JButton btn5=new JButton("加密");    //创建JButton对象
	private JButton btn6=new JButton("解密");
	private JButton btn7=new JButton("导入数据库");
	private JButton btn8=new JButton("加密");    //创建JButton对象
	private JButton btn9=new JButton("解密");
	private JButton btn11=new JButton("加密");    //创建JButton对象
	private JButton btn12=new JButton("解密");
	private JButton btn14=new JButton("加密");    //创建JButton对象
	private JButton btn15=new JButton("解密");
	private JButton btn17=new JButton("加密");    //创建JButton对象
	private JButton btn18=new JButton("解密");
	private JButton btn20=new JButton("加密");    //创建JButton对象
	private JButton btn21=new JButton("解密");
	private JButton btn23=new JButton("加密");    //创建JButton对象
	private JButton btn24=new JButton("解密");
	private JButton btn26=new JButton("加密");    //创建JButton对象
	private JButton btn27=new JButton("解密");
	private JButton btn100=new JButton("x");
	public CodingFrame()
	{
		super("常用编码"); setBounds(600,300,400,300);
		JFrame jf=this;
		Container c = getContentPane();
		tabbedPane=new JTabbedPane();	//创建选项卡面板对象
				 
		//创建面板
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel5=new JPanel();
		panel6=new JPanel();
		panel7=new JPanel();
		panel8=new JPanel();
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		panel5.setLayout(null);
		panel6.setLayout(null);
		panel7.setLayout(null);
		panel8.setLayout(null);
		
		btn1.setBounds(135, 160, 130, 50);
		this.add(btn1);
		
		 btn5.setBounds(10, 60, 90, 30);		 
		 btn6.setBounds(130, 60, 90, 30);	
		 btn7.setBounds(250, 108, 120, 30);	
		 btn8.setBounds(10, 60, 90, 30);		 
		 btn9.setBounds(130, 60, 90, 30);	
		 btn11.setBounds(10, 60, 90, 30);		 
		 btn12.setBounds(130, 60, 90, 30);	
		 btn14.setBounds(10, 60, 90, 30);		 
		 btn15.setBounds(130, 60, 90, 30);		
		 btn17.setBounds(10, 60, 90, 30);		 
		 btn18.setBounds(130, 60, 90, 30);	
		 btn20.setBounds(10, 60, 90, 30);		 
		 btn21.setBounds(130, 60, 90, 30);	
		 btn23.setBounds(10, 60, 90, 30);		 
		 btn24.setBounds(130, 60, 90, 30);	
		 btn26.setBounds(10, 60, 90, 30);		 
		 btn27.setBounds(130, 60, 90, 30);	

		 
		 btn1.addActionListener(new MyListener()); 	
		 btn5.addActionListener(new MyListener()); 
		 btn6.addActionListener(new MyListener()); 
		 btn7.addActionListener(new MyListener()); 
		 btn8.addActionListener(new MyListener()); 
		 btn9.addActionListener(new MyListener()); 
		 btn11.addActionListener(new MyListener()); 
		 btn12.addActionListener(new MyListener());  
		 btn14.addActionListener(new MyListener()); 
		 btn15.addActionListener(new MyListener()); 
		 btn17.addActionListener(new MyListener()); 
		 btn18.addActionListener(new MyListener()); 
		 btn20.addActionListener(new MyListener()); 
		 btn21.addActionListener(new MyListener()); 
		 btn23.addActionListener(new MyListener()); 
		 btn24.addActionListener(new MyListener()); 
		 btn26.addActionListener(new MyListener()); 
		 btn27.addActionListener(new MyListener()); 
		 
		 panel1.add(btn5);
		 panel1.add(btn6);
		 this.add(btn7);
		 panel2.add(btn8);
		 panel2.add(btn9);
		 panel3.add(btn11);
		 panel3.add(btn12);
		 panel4.add(btn14);
		 panel4.add(btn15);
		 panel5.add(btn17);
		 panel5.add(btn18);
		 panel6.add(btn20);
		 panel6.add(btn21);
		 panel7.add(btn23);
		 panel7.add(btn24);
		 panel8.add(btn26);
		 panel8.add(btn27);
		 
		 btn100.setBounds(280, 180, 30, 30);
		 btn100.addActionListener(new MyListener()); 
		 this.add(btn100);
		 
		 tfd1.setBounds(110, 60, 250, 30);
	     this.add(tfd1);    
	     tfd2.setBounds(50, 170, 70, 30);
	     panel1.add(tfd2);
	     tfd5.setBounds(170, 170, 70, 30);
	     panel1.add(tfd5);
	     
	     tfd6.setBounds(50, 170, 70, 30);
	     panel4.add(tfd6);
	     tfd7.setBounds(170, 170, 70, 30);
	     panel4.add(tfd7);
	     tfd8.setBounds(50, 120, 70, 30);
	     panel4.add(tfd8);
	     
	     tfd3.setBounds(50, 170, 70, 30);
	     panel5.add(tfd3);	     
	     tfd4.setBounds(50, 170, 70, 30);
	     panel6.add(tfd4);
	     
	     
	     
	     lbl1.setBounds(3, 60, 110, 30);
	     this.add(lbl1);    
	     lbl2.setBounds(3, 170, 50, 30);
	     lbl3.setBounds(3, 170, 50, 30);
	     lbl4.setBounds(3, 170, 50, 30);
	     lbl5.setBounds(130, 170, 50, 30);
	     lbl6.setBounds(3, 170, 50, 30);
	     lbl7.setBounds(125, 170, 50, 30);
	     lbl8.setBounds(0, 123, 60, 30);
	     panel1.add(lbl4); 
	     panel1.add(lbl5); 
	     panel4.add(lbl6); 
	     panel4.add(lbl7); 
	     panel4.add(lbl8); 
	     panel5.add(lbl2); 
	     panel6.add(lbl3); 
	     
	     btn100.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent actionEvent) {
	                jf.dispose();
	                new FrameConfig();
	            }
	        });
		
	     JLabel labimg=new JLabel(new ImageIcon("img/暗中观察.jpg"));
	     this.add(labimg);
	     labimg.setBounds(313,138,70,140);
	        
		this.setBackground(Color.white);
		
		//将标签面板加入到选项卡面板对象上
		tabbedPane.addTab("ASCII",null,panel1,"First panel");
		tabbedPane.addTab("BASE64",null,panel2,"Second panel");
		tabbedPane.addTab("Conversion",null,panel3,"Third panel");
		tabbedPane.addTab("Conversion2",null,panel4,"Forth panel");
		tabbedPane.addTab("HEXCoder",null,panel5,"Fifth panel");
		tabbedPane.addTab("MorseCoder",null,panel6,"Sixth panel");
		tabbedPane.addTab("Unicode",null,panel7,"Seventh panel");
		tabbedPane.addTab("URL",null,panel8,"Eighth panel");
 
		c.add(tabbedPane);
		c.setBackground(Color.white);
 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//	//添加响应事件
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) 
				{
					new DonateFrame();
				}
				else if(e.getSource() == btn7){
					String str=tfd1.getText();
					Insert.insert(str);
				}				
				else if(e.getSource() == btn8) { 
					String str=tfd1.getText();
					base_64 a=new base_64();
					tfd1.setText(a.Base64Encode(str));
				}
				else if(e.getSource() == btn9) { 
					String str=tfd1.getText();
					base_64 a=new base_64();
					tfd1.setText(a.Base64Decode(str));
				}
				else if(e.getSource() == btn5) { 
					String str=tfd1.getText();
					String d=tfd2.getText();
					int b=Integer.parseInt(tfd5.getText());
					ASCII a=new ASCII();
					tfd1.setText(a.EnCode(str,d,b));
				}
				else if(e.getSource() == btn6) { 	
					String str=tfd1.getText();
					String d=tfd2.getText();
					ASCII a=new ASCII();
					tfd1.setText(a.DeCode(str,d));
				}
				else if(e.getSource() == btn11) { 							
				}
				else if(e.getSource() == btn12) { 							
				}
				else if(e.getSource() == btn14||e.getSource() == btn15) { 	
					String str=tfd1.getText();
					String d=tfd6.getText();
					Conversion_2 a=new Conversion_2();
					int b=Integer.parseInt(tfd7.getText());
					int c=Integer.parseInt(tfd8.getText());
					tfd1.setText(a.Base_Conversion(str,b,c,d));
				}		
				else if(e.getSource() == btn17) { 
					String str=tfd1.getText();
					String d=tfd3.getText();
					System.out.println(d);
					HEXCoder a=new HEXCoder();
					try {
						tfd1.setText(a.Encode(str, d));
					} catch (UnsupportedEncodingException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn18) { 		
					String str=tfd1.getText();
					String d=tfd3.getText();
					HEXCoder a=new HEXCoder();
					tfd1.setText(a.Decode(str, d));
				}
				else if(e.getSource() == btn20) { 	
					String str=tfd1.getText();
					String d=tfd4.getText();
					MorseCoder a=new MorseCoder('-','+');
					tfd1.setText(a.encode(str, d));
				}
				else if(e.getSource() == btn21) { 	
					String str=tfd1.getText();
					String d=tfd4.getText();
					MorseCoder a=new MorseCoder('-','+');
					tfd1.setText(a.decode(str, d));
				}
				else if(e.getSource() == btn23) { 	
					String str=tfd1.getText();
					Unicode a=new Unicode();
					tfd1.setText(a.stringToUnicode(str));
				}
				else if(e.getSource() == btn24) { 	
					String str=tfd1.getText();
					Unicode a=new Unicode();
					tfd1.setText(a.unicodeToString(str));
				}		
				else if(e.getSource() == btn26) { 	
					String str=tfd1.getText();
					URL a=new URL();
					try {
						tfd1.setText(a.URLEncode(str));
					} catch (UnsupportedEncodingException e1) {
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn27) {
					String str=tfd1.getText();
					URL a=new URL();
					try {
						tfd1.setText(a.URLDecode(str));
					} catch (UnsupportedEncodingException e1) {
						e1.printStackTrace();
					}
				}	
			}
		}	
	
	public static void main(String args[])
	{
		new CodingFrame();
	}
}