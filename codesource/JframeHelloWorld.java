/**
@auther:wqy
@date:2019/7/31
*/

import javax.swing.*;

public class JframeHelloWorld{
    
    public static void main(String[] args){
	   // �൱��body
	   JFrame frame = new JFrame("����һ��JFrame");
	   // �൱��div
	   JPanel panel = new JPanel();
	   // �൱������
	   JLabel label = new JLabel("helloworld");
	   // �����ַ���div��
	   panel.add(label);
	   // ��div����body��
	   frame.setContentPane(panel);
	   // ����body�Ŀ��
	   frame.setSize(300,400);
	   // ��body����Ϊ�ɼ�
	   frame.setVisible(true);
	}
}