package config;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.ClassicalFrame;
import ui.CodingFrame;
import ui.DatabaseFrame;
import ui.ModernFrame;
import util.FrameUtil;

public class FrameConfig extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon icon1 = new ImageIcon("img/btn1.png");
	ImageIcon icon2 = new ImageIcon("img/btn2.png");
	ImageIcon icon3 = new ImageIcon("img/btn3.png");
	ImageIcon icon4 = new ImageIcon("img/btn4.png");
	private JButton btn1=new JButton(icon1);    //创建JButton对象
	private JButton btn2=new JButton(icon2);
	private JButton btn3=new JButton(icon3);
	private JButton btn4=new JButton(icon4);
	private JPanel jp=new JPanel();    //创建JPanel对象
	
	public FrameConfig() {		
		JFrame jf=this;
		setTitle("CTF加解密工具箱");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置布局管理器为边界布局
		this.setLayout(new BorderLayout());
		// 添加主面板
		this.setResizable(false);
		this.setSize(380, 370);
		jp.setLayout(new GridLayout(2,2,10,10));
		// 居中对齐
		jp.add(btn1);
		jp.add(btn2);
		jp.add(btn3);
		jp.add(btn4);	
		
		//监控--事件
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            	jf.dispose();
                new ClassicalFrame();
            }
        });
		btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jf.dispose();
                new CodingFrame();
            }
        });
		btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jf.dispose();
                new ModernFrame();
            }
        });
		btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jf.dispose();
                new DatabaseFrame();
            }
        });
		this.add(jp);
		FrameUtil.setFrameCenter(this);	
		setVisible(true);		
	}
	
}
