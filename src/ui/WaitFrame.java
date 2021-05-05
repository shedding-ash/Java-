package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import config.FrameConfig;

public class WaitFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numClicks = 0; // 计数器，计算点击次数
	public WaitFrame() {			

		JFrame jf=this;
		// 设置名字
		this.setTitle("我需要你的力量~~");
		// 设置默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口大小
		this.setBounds(500,200,500,450);
		// 不允许用户改变窗口大小
		this.setResizable(false);
		
		
		JTextField tfd1=new JTextField();    //创建文本框
		this.add(tfd1);
		tfd1.setBounds(90,180,300,30);
		JTextField tfd2=new JTextField();    //创建文本框
		this.add(tfd2);
		tfd2.setBounds(200,350,70,30);
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
        JButton btn2=new JButton("谢谢！");
        btn2.setBounds(200,315,70,30);
        this.add(btn1);
        this.add(btn2);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jf.dispose();
                new FrameConfig();
            }
        });
        
      
      
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                if(numClicks%2==0) {
                	tfd1.setText("orzorzorzorzorzorzorzorz");
                    tfd2.setText("(●'◡'●)");
                }          
                else {
                	 tfd1.setText("靠你们了靠你们了靠你们了靠你们了");	
                	 tfd2.setText("(●ˇ∀ˇ●)");
                }
               
//                if(numClicks<44){
//                	if(numClicks==1) {
//                    	tfd1.setText("Wow");
//                    }else if(numClicks==2) {
//                    	tfd1.setText("这似乎称不上一次令人愉悦的相遇");
//                    }else if(numClicks==3) {
//                    	tfd1.setText("初次见面就口吐芬芳");
//                    }else if(numClicks==4) {
//                    	tfd1.setText("你这样我很难和你相处啊");
//                    }else if(numClicks==5) {
//                    	tfd1.setText("给予一个陌生人一点善意真的是那么困难的事情吗");
//                    }else if(numClicks==6) {
//                    	tfd1.setText("看看那两个二维码");
//                    }else if(numClicks==7) {
//                    	tfd1.setText("一分钱也许就挽救了一个缺爱的大学生");
//                    }else if(numClicks==8) {
//                    	tfd1.setText("不考虑一下吗(●'◡'●)");
//                    }else if(numClicks==9) {
//                    	tfd1.setText("还是不肯改变心意么");
//                    }else if(numClicks==10) {
//                    	tfd1.setText("Emmmmm");
//                    }else if(numClicks==11) {
//                    	tfd1.setText("你难道也是一个缺爱的大学生吗");
//                    }else if(numClicks==12) {
//                    	tfd1.setText("这样就说得通了呢。。");
//                    }else if(numClicks==13) {
//                    	tfd1.setText("呃。。什么。");
//                    }else if(numClicks==14) {
//                    	tfd1.setText("不是吗。。");
//                    }else if(numClicks==15) {
//                    	tfd1.setText("看来又是我在自说自话了啊。。");
//                    }else if(numClicks==16) {
//                    	tfd1.setText("真对不起。。");
//                    }else if(numClicks==17) {
//                    	tfd1.setText("我发觉一件事情。。");
//                    }else if(numClicks==18) {
//                    	tfd1.setText("我这样一直每句都回应你似乎成了你不断点“滚“的动力。。");
//                    }else if(numClicks==19) {
//                    	tfd1.setText("那么我就不会回应你了哟。。");
//                    }else if(numClicks==20) {
//                    	tfd1.setText("真的不会了哟");
//                    }else if(numClicks==21) {
//                    	tfd1.setText("真的真的不会了哟");
//                    }else if(numClicks==22) {
//                    	tfd1.setText("真的真的真的不会了哟");
//                    }else if(numClicks==23) {
//                    	tfd1.setText("从这句开始！");
//                    }else if(numClicks>23&&numClicks<40) {
//                    	tfd1.setText("");
//                    }else if(numClicks==40) {
//                    	tfd1.setText("(●'◡'●)");
//                    }else if(numClicks==41) {
//                    	tfd1.setText("我回来了。。");
//                    }else if(numClicks==42) {
//                    	tfd1.setText("看来你是真的不想捐赠啊。。");
//                    }else if(numClicks==43) {
//                    	tfd1.setText("那么我允许你在不捐赠的情况下点击那个按钮了");
//                    }
//                }
//                else if(numClicks%100==0) {
//                	tfd1.setText("Wow，你已经跟我说了"+numClicks+"句话了");
//                }else {
//                	tfd1.setText("快去使用软件吧！");
//                }
                
                // 显示按钮被点击的次数
            }
        });

		add(new JLabel("求投喂...",JLabel.CENTER));
		setVisible(true);					
	}
	
}
