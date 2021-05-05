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
	private JTextField tfd1=new JTextField();    //�����ı���
	private JTextField tfd2=new JTextField();    //�����ı���
	private JLabel lbl1=new JLabel("�û�����");    //������ǩ
	private JLabel lbl2=new JLabel("���룺");    //������ǩ
	private JButton btn1=new JButton("����Ͷι����");
	private JButton btn2=new JButton("��¼");    //����JButton����
	private JButton btn100=new JButton("x");
	public DatabaseFrame()
	{
		super("���ݿ��¼����"); setBounds(600,300,400,300);
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
	    
	    JLabel labimg=new JLabel(new ImageIcon("img/���й۲�.jpg"));
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
