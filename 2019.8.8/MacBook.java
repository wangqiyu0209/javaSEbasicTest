package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */

public class MacBook {

	// cpu�ͺ�
	String num;
	// ��ɫ
	String color;
	
	// �޲ι�����
	public MacBook() {
		
	}
	// �вι�����
	public MacBook(String num,String color) {
		this.num = num;
		this.color = color;
	}

	// ����ʼǱ���Ϣ�ķ���
	public  String getInformation(String num ,String color) {
		System.out.println(num);
		return color;
	}
	
}
