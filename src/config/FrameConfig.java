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
	private JButton btn1=new JButton(icon1);    //����JButton����
	private JButton btn2=new JButton(icon2);
	private JButton btn3=new JButton(icon3);
	private JButton btn4=new JButton(icon4);
	private JPanel jp=new JPanel();    //����JPanel����
	
	public FrameConfig() {		
		JFrame jf=this;
		setTitle("CTF�ӽ��ܹ�����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ò��ֹ�����Ϊ�߽粼��
		this.setLayout(new BorderLayout());
		// ��������
		this.setResizable(false);
		this.setSize(380, 370);
		jp.setLayout(new GridLayout(2,2,10,10));
		// ���ж���
		jp.add(btn1);
		jp.add(btn2);
		jp.add(btn3);
		jp.add(btn4);	
		
		//���--�¼�
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
