package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import config.FrameConfig;

public class DatabaseFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection con = null;
	private JPanel panel1;
	private JTextField tfd1=new JTextField();    //创建文本框
	private JTextField tfd2=new JTextField();    //创建文本框
	private JLabel lbl1=new JLabel("用户名：");    //创建标签
	private JLabel lbl2=new JLabel("密码：");    //创建标签
	private JButton btn1=new JButton("！！投喂！！");
	private JButton btn2=new JButton("登录");    //创建JButton对象
	private JButton btn100=new JButton("x");
	public DatabaseFrame()
	{
		super("数据库登录界面"); setBounds(600,300,400,300);
		JFrame jf=this;
		panel1=new JPanel();
		panel1.setLayout(null);
		
		btn1.setBounds(120, 180, 130, 50);
		btn1.addActionListener(new MyListener()); 	
		panel1.add(btn1);
		
		btn2.setBounds(130, 140, 90, 30);	
		btn2.addActionListener(new MyListener()); 
		panel1.add(btn2);
		
		btn100.setBounds(280, 180, 30, 30);
		btn100.addActionListener(new MyListener()); 
		panel1.add(btn100);
		
		tfd1.setBounds(110, 30, 200, 30);
	    panel1.add(tfd1);    
	    tfd2.setBounds(110, 80, 200, 30);
	    panel1.add(tfd2);
	    
	    lbl1.setBounds(30, 30, 110, 30);
	    panel1.add(lbl1);    
	    lbl2.setBounds(30, 80, 50, 30);
	    panel1.add(lbl2);  
	    
	   
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
	    	    
	    this.add(panel1);    
		this.setBackground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) 
				{
					new DonateFrame();
				}
				else if(e.getSource() == btn2){
					//String USER=tfd1.getText();
					//String PASS=tfd2.getText();	
					
				}
			}				
		}
	public static void main(String args[])
	{
		new DatabaseFrame();
	}
}
