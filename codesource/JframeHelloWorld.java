/**
@auther:wqy
@date:2019/7/31
*/

import javax.swing.*;

public class JframeHelloWorld{
    
    public static void main(String[] args){
	   // 相当于body
	   JFrame frame = new JFrame("这是一个JFrame");
	   // 相当于div
	   JPanel panel = new JPanel();
	   // 相当于文字
	   JLabel label = new JLabel("helloworld");
	   // 将文字放入div中
	   panel.add(label);
	   // 将div放入body中
	   frame.setContentPane(panel);
	   // 设置body的宽高
	   frame.setSize(300,400);
	   // 将body设置为可见
	   frame.setVisible(true);
	}
}