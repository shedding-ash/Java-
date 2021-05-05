
package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Encryption_Modern.AES;
import Encryption_Modern.Authentication_JWT;
import Encryption_Modern.Authentication_LM;
import Encryption_Modern.Authentication_NTLM;
import Encryption_Modern.DES;
import Encryption_Modern.Hash;
import Encryption_Modern.Hash_add;
import Encryption_Modern.SM3;
import config.FrameConfig;
import util.Insert;


public class ModernFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTabbedPane tabbedPane;
	private JPanel panel1,panel2,panel3,panel4;
	private JPanel panel5,panel6,panel7,panel8;
	private JComboBox<String>cmb1=new JComboBox<String>();    //创建JComboBox
	private JComboBox<String> cmb2=new JComboBox<String>();    //创建JComboBox
	private JComboBox<String> cmb3=new JComboBox<String>();    //创建JComboBox
	private JTextField tfd1=new JTextField();    //创建文本框
	private JTextField tfd2=new JTextField();    //创建文本框
	private JTextField tfd3=new JTextField();    //创建文本框
	private JTextField tfd4=new JTextField();    //创建文本框
	private JTextField tfd5=new JTextField();    //创建文本框
	private JTextField tfd6=new JTextField();    //创建文本框
	private JLabel lbl1=new JLabel("请输入明文或密文：");    //创建标签
	private JLabel lbl2=new JLabel("密钥：");    //创建标签
	private JLabel lbl3=new JLabel("密钥：");    //创建标签
	private JLabel lbl4=new JLabel("首部：");    //创建标签
	private JLabel lbl5=new JLabel("密钥：");    //创建标签
	private JLabel lbl6=new JLabel("加密类型（MD4）：");    //创建标签
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
	
	
	public ModernFrame()
	{
		
		super("现代密码"); setBounds(600,300,400,300);
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
		 btn100.setBounds(280, 180, 30, 30);	

		 
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
		 
		 btn100.setBounds(280, 180, 30, 30);
		 btn100.addActionListener(new MyListener()); 
		 this.add(btn100);
		 
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
		 this.add(btn100);
		 
		 tfd1.setBounds(110, 60, 250, 30);
	     this.add(tfd1);    
	     tfd2.setBounds(180, 170, 100, 30);
	     panel1.add(tfd2); 
	     tfd3.setBounds(35, 170, 90, 30);
	     panel2.add(tfd3);
	     tfd4.setBounds(165, 170, 90, 30);
	     panel2.add(tfd4);
	     tfd5.setBounds(165, 170, 90, 30);
	     panel5.add(tfd5);
	     tfd6.setBounds(165, 170, 90, 30);
	     panel7.add(tfd6);
		
	     lbl1.setBounds(3, 60, 110, 30);
	     this.add(lbl1);  
	     lbl2.setBounds(130, 170, 110, 30);
	     panel1.add(lbl2);  
	     lbl3.setBounds(3, 170, 110, 30);
	     panel2.add(lbl3);  
	     lbl4.setBounds(130, 170, 110, 30);
	     panel2.add(lbl4);  
	     lbl5.setBounds(130, 170, 110, 30);
	     panel5.add(lbl5); 
	     lbl6.setBounds(50, 170, 110, 30);
	     panel7.add(lbl6); 

	     cmb1.addItem("CBC");
	     cmb1.addItem("ECB");
	     cmb2.addItem("Base64");
	     cmb2.addItem("16进制");
	     cmb3.addItem("128");
	     cmb3.addItem("192");
	     cmb3.addItem("256");     
	     cmb1.setBounds(3, 100, 110, 30);
	     cmb2.setBounds(3, 135, 110, 30);
	     cmb3.setBounds(3, 170, 110, 30);
	     panel1.add(cmb1);  
	     panel1.add(cmb2);  
	     panel1.add(cmb3);  
	     
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
		tabbedPane.addTab("AES",null,panel1,"First panel");
		tabbedPane.addTab("JWT",null,panel2,"Second panel");
		tabbedPane.addTab("LM",null,panel3,"Third panel");
		tabbedPane.addTab("NTLM",null,panel4,"Forth panel");
		tabbedPane.addTab("DES",null,panel5,"Fifth panel");
		tabbedPane.addTab("Hash_add",null,panel6,"Sixth panel");
		tabbedPane.addTab("Hash",null,panel7,"Seventh panel");
		tabbedPane.addTab("SM3",null,panel8,"Eighth panel");
 
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
				else if(e.getSource() == btn5) { 
					String str=tfd1.getText();
					AES a=new AES();
					String key=tfd2.getText();
					String Mode=cmb1.getSelectedItem().toString();
					String OutStyle=cmb2.getSelectedItem().toString();
					int KLength=Integer.parseInt(cmb3.getSelectedItem().toString());
					try {
						tfd1.setText(a.AESEncrypt(str, key, Mode, OutStyle, KLength));
					} catch (GeneralSecurityException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn6) { 		
					String str=tfd1.getText();
					AES a=new AES();
					String key=tfd2.getText();
					String Mode=cmb1.getSelectedItem().toString();
					String OutStyle=cmb2.getSelectedItem().toString();				
					int KLength=Integer.parseInt(cmb3.getSelectedItem().toString());
					System.out.println(str);
					System.out.println(key);
					System.out.println(Mode);
					System.out.println(OutStyle);
					System.out.println(KLength);
					try {
						tfd1.setText(a.AESDecrypt(str, key, Mode, OutStyle, KLength));
					} catch (GeneralSecurityException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn8) { 		
					String str=tfd1.getText();
					String Signature=tfd3.getText();
					String Headers=tfd4.getText();
					Authentication_JWT a=new Authentication_JWT ();
					try {
						tfd1.setText(a.JWTencode(Headers, str, Signature));
					} catch (InvalidKeyException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedEncodingException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn9) { 	
					String str=tfd1.getText();
					Authentication_JWT a=new Authentication_JWT ();
					String sp[]=a.JWTdecode(str);
					System.out.println(a.JWTdecode(str));
					String res= sp[0]+" "+sp[1];
					tfd1.setText(res);
				}
				else if(e.getSource() == btn11||e.getSource() == btn12) { 		
					String str=tfd1.getText();
					tfd1.setText(Authentication_LM.LM2T16(Authentication_LM.LMEncrypt(str)));
				}				
				else if(e.getSource() == btn14||e.getSource() == btn15) { 		
					String str=tfd1.getText();
					Authentication_NTLM a=new Authentication_NTLM ();
					tfd1.setText(a.NTLMEncrypt(str));
				}
				else if(e.getSource() == btn17) { 		
					String str=tfd1.getText();
					String key=tfd5.getText();
					DES a;
					try {
						a = new DES(key);
						tfd1.setText(a.encrypt(str));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}				
				else if(e.getSource() == btn18) { 						
					try {
						String str=tfd1.getText();
						String key=tfd5.getText();
						DES a=new DES(key);
						tfd1.setText(a.decrypt(str));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(e.getSource() == btn20||e.getSource() == btn21) { 		
					String str=tfd1.getText();
					Hash_add a=new Hash_add();
					tfd1.setText(a.getMD4ofStr(str));
				}				
				else if(e.getSource() == btn23||e.getSource() == btn24) { 						
					String str=tfd1.getText();
					String Mode=tfd6.getText();
					Hash a=new Hash();					
					tfd1.setText(a.HashEncode(str,Mode));
				}				
				else if(e.getSource() == btn26||e.getSource() == btn27) { 		
					String str=tfd1.getText();
					byte[] strbyte = str.getBytes();		
					SM3 a=new SM3();					
					tfd1.setText(a.byteArrayToHexString(strbyte));
				}	
				
			}
		}	
	
	public static void main(String args[])
	{
		new ModernFrame();
	}
}