/**
@auther:wqy
@date:2019/7/31
*/

import javax.swing.*;

public class JframeHelloWorldDome{
	public static void main(String[] args){
		JFrame frame = new JFrame("JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("这是一个700x1000的框");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(700,1000);
		frame.setVisible(true);
	}
}