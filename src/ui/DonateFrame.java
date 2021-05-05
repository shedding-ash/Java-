package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DonateFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DonateFrame() {	
		
		JFrame jf=this;
		// 设置名字
		this.setTitle("软件滞销，救救孩子。。。");
		// 设置默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口大小
		this.setBounds(500,200,500, 450);
		// 不允许用户改变窗口大小
		this.setResizable(false);
		
		
		
		JLabel labimg1=new JLabel(new ImageIcon("img/微信.png"));
		JLabel labimg2=new JLabel(new ImageIcon("img/支付宝.jpg"));
		JLabel labimg3=new JLabel(new ImageIcon("img/害羞.jpg"));		
		this.add(labimg1);
		this.add(labimg2);
        this.add(labimg3);
        labimg1.setBounds(0,0,200,180);
        labimg3.setBounds(205,0,70,70);
        labimg2.setBounds(270,0,200,180);
        JLabel labimg4=new JLabel(new ImageIcon("img/嘻嘻.gif"));
        this.add(labimg4);
        labimg4.setBounds(205,100,70,70);
        JLabel labimg5=new JLabel(new ImageIcon("img/投喂.gif"));
        this.add(labimg5);
        labimg5.setBounds(0,210,200,180);
        JLabel labimg6=new JLabel(new ImageIcon("img/投喂2.gif"));
        this.add(labimg6);
        labimg6.setBounds(270,210,200,180);
        
        JButton btn1=new JButton("投喂！");
        btn1.setBounds(200,280,70,30);
        this.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jf.dispose();
            }
        });
        
		add(new JLabel("求投喂...",JLabel.CENTER));
		setVisible(true);					
	}
	
}
