/**
@auther:wqy
@date:2019/7/31
*/

import javax.swing.*;

public class JframeHelloWorldDome{
	public static void main(String[] args){
		JFrame frame = new JFrame("JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("����һ��700x1000�Ŀ�");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(700,1000);
		frame.setVisible(true);
	}
}